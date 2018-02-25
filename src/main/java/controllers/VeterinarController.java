package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import models.Veterinar;
import services.interfaces.IVeterinarService;

@RestController
public class VeterinarController {
	
	@Autowired
	IVeterinarService veterinarService;
	
	@RequestMapping(path = "/veterinars" , method = RequestMethod.GET)
	public List<Veterinar> getAllVeterinars(){
		return veterinarService.getAll();
		
	}
	
	@RequestMapping(path = "/addVeterinar", method = RequestMethod.POST, consumes = "application/json")
	public void addVeterinar(@RequestBody Veterinar v) {
		veterinarService.addVet(v);	
	}
	
	@RequestMapping(path = "/deleteVeterinar/{id}", method = RequestMethod.DELETE)
	public List<Veterinar> deleteVeterinar(@PathVariable int id ) {
		veterinarService.deleteVeterinar(id);	
		return veterinarService.getAll();		
	}
	
 
	/*
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	 public String addVeterinar(@ModelAttribute("personAttribute") Veterinar veterinar,
	       Model model) {
	  logger.debug("Add new person");
	   
	  // Prepare acceptable media type
	  List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
	  acceptableMediaTypes.add(MediaType.APPLICATION_XML);
	   
	  // Prepare header
	  HttpHeaders headers = new HttpHeaders();
	  headers.setAccept(acceptableMediaTypes);
	  // Pass the new person and header
	  HttpEntity<Person> entity = new HttpEntity<Person>(person, headers);
	 
	  // Send the request as POST
	  try {
	   ResponseEntity<Person> result = restTemplate.exchange("http://localhost:8080/spring-rest-provider/krams/person", HttpMethod.POST, entity, Person.class);
	  } catch (Exception e) {
	   logger.error(e);
	  }
	   
	  // This will resolve to /WEB-INF/jsp/resultpage.jsp
	  return "resultpage";
	 }*/

}
