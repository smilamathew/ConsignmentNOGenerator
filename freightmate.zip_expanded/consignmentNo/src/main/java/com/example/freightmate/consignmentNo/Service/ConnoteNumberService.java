/* It take input and generate the next connote number*/
package com.example.freightmate.consignmentNo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.freightmate.consignmentNo.Model.ConnoteNumberModel;

@Service
public class ConnoteNumberService {
	@Autowired
	ConnoteNumberModel connotNumber;
	String consignmentNumber;
	public String generateConnoteNumber(ConnoteNumberModel connotNumber) {
		if(connotNumber.getLastUsedIndex()>= connotNumber.getRangeStart() && connotNumber.getLastUsedIndex()< connotNumber.getRangeEnd()) {
			String prefix = connotGetPrefix(connotNumber.getCarrierName());
			int currentConnoteIndex = connotNumber.getLastUsedIndex() +1;
			String consignmentIndex = String.format("%0" + connotNumber.getDigits() + "d", currentConnoteIndex);
			int checkSum = findCheckSum(consignmentIndex);
			consignmentNumber = prefix + connotNumber.getAccountNumber() + consignmentIndex + String.valueOf(checkSum);
		} else {
			consignmentNumber = "Consignment Index is not within the range : " +connotNumber.getRangeStart() + "-" +connotNumber.getRangeEnd();
			
		}
		return consignmentNumber;
	}
	
	private int findCheckSum(String consignmentIndex) {
		// TODO Auto-generated method stub
		int firstSum=0;
		int secondSum=0;
		int finalSum = 0;
		int checkSum = 0;
		int multiple =0;
		for(int i=consignmentIndex.length()-1; i>=0; i=i-2) {
			firstSum += Integer.parseInt(String.valueOf(consignmentIndex.charAt(i))); 
		}
		for(int i=consignmentIndex.length()-2; i>=0; i=i-2) {
			secondSum += Integer.parseInt(String.valueOf(consignmentIndex.charAt(i))); 
		}
		finalSum = ((firstSum*3) + (secondSum*7));
		if(finalSum%10 ==0) {
			checkSum = 0;
		} else {
			multiple =finalSum+ (10-(finalSum%10));
			checkSum = multiple-finalSum;
		}
		 return checkSum;
		
	}
	
	private String connotGetPrefix(String carrierName) {
		// TODO Auto-generated method stub
		String prefix="";
		for(int i=0; i<carrierName.length(); i++) {
			if(Character.isUpperCase(carrierName.charAt(i))) {
				prefix +=carrierName.charAt(i);
			}
		}
		return prefix;
	}

}
