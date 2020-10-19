package hello;
import models.auth.*;

import org.springframework.v4.auth.api.AuthorizationApi;
import org.springframework.v4.auth.api.DecoupledAuthorizationApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.joda.time.LocalTime;

public class StartAuth {
	public String generateAccessToken(){

		Auth_model auth_model = new Auth_model();

		StartAuthModel params = new StartAuthModel(auth_model.getId(), auth_model.getSecret(), "NO" ,12900, auth_model.getRedirectURI(), "");

		String t = sendRequest(params.getId(), params.getSecret(), "NO", 12900, params.getRedirectURI(), "");
		System.out.println(t);


		return "hoho";
	}

	@RequestMapping(
	value = "/autorize", 
	method = RequestMethod.GET,
	headers = {"Content-Type = application/x-www-form-urlencoded", "X-IBM-Client-Id = 3f063beb-bf33-4638-bcdd-e8f5a00716f8", "X-IBM-Client-Secret = D0mN6vX8rF5sQ8vV7eI6hA5dW5mJ5bA6xU6qR2eY1cS2bF2kB3"},
	produces = "application/json"
	)
	@ResponseBody
	public String sendRequest(@RequestParam String id, @RequestParam String Secret,  @RequestParam String country, @RequestParam int duration, @RequestParam String reUri, @RequestParam String scope){
		return "ID: " + id;	
	}

}
