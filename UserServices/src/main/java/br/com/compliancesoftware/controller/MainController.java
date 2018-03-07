package br.com.compliancesoftware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.compliancesoftware.models.ResponseBody;

@Controller
public class MainController {
	
	@PostMapping(value = "listAll")
	public ResponseEntity<ResponseBody> listAll() {
		ResponseBody body = new ResponseBody();
		ResponseEntity<ResponseBody> response = new ResponseEntity<ResponseBody>(body, HttpStatus.INTERNAL_SERVER_ERROR);
		
		
		
		return response;
	}
	
}
