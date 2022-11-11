package kodlamaio.Kodlama.io.Devs.webApi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlamaio.Kodlama.io.Devs.business.requsts.CreateProgramminLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import kodlamaio.Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;
import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguageControllers {
	private LanguageService languageService;

	@Autowired
	public ProgrammingLanguageControllers(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping ("/getall") 
	public List<GetAllProgrammingLanguageResponse> getAll()
	{
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateProgramminLanguageRequest createProgramminLanguageRequest) throws Exception
	{
	this.languageService.add(createProgramminLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest)
	{
		this.languageService.delete(deleteProgrammingLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest)
	{
		this.languageService.update(updateProgrammingLanguageRequest);
	}
		
	
	
}
