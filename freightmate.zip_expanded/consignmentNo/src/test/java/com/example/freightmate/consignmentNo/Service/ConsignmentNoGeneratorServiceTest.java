package com.example.freightmate.consignmentNo.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.freightmate.consignmentNo.Model.ConnoteNumberModel;
@SpringBootTest
class ConsignmentNoGeneratorServiceTest {
@Autowired
ConnoteNumberService connoteNumberService;
	@Test
	void testGenerateConnoteNumber() {
		
		assertEquals("FMCC123ABC000352172", connoteNumberService.generateConnoteNumber(new ConnoteNumberModel("FMccCC","123ABC",8,35216,19000,40000)));
	}

}
