package com.example.teste_api;

import com.example.teste_api.controller.TesteController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class TesteApiApplicationTests {

	@InjectMocks
	private TesteController controller;

	@Test
	void contextLoads() {
		ResponseEntity<String> responseEntity = controller.t1();
		Assertions.assertEquals( HttpStatus.OK, responseEntity.getStatusCode() );
		Assertions.assertEquals( "Hello World", responseEntity.getBody() );
	}

}
