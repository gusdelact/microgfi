package com.gfi.rest.RESTPrimero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gfi.rest.RESTPrimero.bean.Frijol;
@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class RestPrimeroApplication {
	@RequestMapping(value="/frijol")
	public Frijol frijol() {
		return new Frijol(100,"una cadena ");
	}

	public static void main(String[] args) {
		SpringApplication.run(RestPrimeroApplication.class, args);
	}
	
	@RequestMapping(value="/{firstName}/{lastName}",
	              method=RequestMethod.GET)
	public String hello(@PathVariable("firstName") String firstName,
	                    @PathVariable("lastName") String lastName) {
		return
		String.format("hola mundo %s %s", firstName,lastName);
	}
    @RequestMapping(value="/welcome")
	public String welcome( ) {
		
		return "welcome";
	}
	

	
}
