package example.smallest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "Hello FUCKING World!!!"; //"application/json" mean this is a text not a redirect
	}

    @GetMapping("/get")
    public @ResponseBody
    ResponseEntity<String> get() {
        return new ResponseEntity<String>("GET Response", HttpStatus.OK);
    }
	
   @GetMapping("/me")
    public @ResponseBody
    ResponseEntity<String> me() {
        return new ResponseEntity<String>("Hello Mukesh Upreti", HttpStatus.OK);
    }
}
