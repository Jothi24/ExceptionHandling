package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ErrorResponse;



@RestController
@RequestMapping("api")
public class ExceptionHandlingResource{
	 
	
		
		//Query Parameter implementation example
		@GetMapping("testExceptionHandling")
	    public ErrorResponse getAuthMessage(@RequestParam("code") String code) {
			ErrorResponse errorResponse = new ErrorResponse();
			if(code.equals("401")) {
				errorResponse.setErrorMessage("You are not Authorized");
			}else if(code.equals("404")) {
				errorResponse.setErrorMessage("resource not found");
			}else {
				//default or code not found condition
				errorResponse.setErrorMessage("code not found");
			}
			
			
	        return errorResponse;
	    }
	 
	

}
