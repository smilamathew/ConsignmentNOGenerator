package com.example.freightmate.consignmentNo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.freightmate.consignmentNo.Model.ConnoteNumberModel;
import com.example.freightmate.consignmentNo.Service.ConnoteNumberService;

@SpringBootApplication
public class ConsignmentNoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConsignmentNoApplication.class, args);
		//ConnoteNumberService connotService = context.getBean(ConnoteNumberService.class);
		//ConnoteNumberModel connoteModel = new ConnoteNumberModel("FreightmateCourierCo","123ABC",10,19604,19000,20000);
		//String connoteNumber = connotService.generateConnoteNumber(connoteModel);
		//System.out.println("Consignment Note Number: " +connoteNumber);
	}

}
