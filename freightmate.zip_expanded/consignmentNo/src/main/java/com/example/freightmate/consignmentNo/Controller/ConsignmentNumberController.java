/* controller class which read the input request and then call the service class and display the output*/
package com.example.freightmate.consignmentNo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.freightmate.consignmentNo.Model.ConnoteNumberModel;
import com.example.freightmate.consignmentNo.Service.ConnoteNumberService;

@Controller

public class ConsignmentNumberController {
	@Autowired
	private ConnoteNumberService connotService;
	@Autowired
	private ConnoteNumberModel connoteModel;
	@GetMapping("/connotenumber")
	public String getInput(Model model) {
		model.addAttribute("connotenumber", connoteModel);
		return "consignmentGenerateInputForm";
	}
	
	@PostMapping("/connotenumber")
	
	public String generateConnoteNumber(@ModelAttribute ConnoteNumberModel connotenumber, Model model ) {
		model.addAttribute("connotenumber",connotService.generateConnoteNumber(connotenumber));
		return "consignmentNumberOutput";
	}
	
}
