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
import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguageControllers {
	private LanguageService languageService;

	@Autowired
	public ProgrammingLanguageControllers(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping ("/getall")
	public List<ProgrammingLanguage> getAll()
	{
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage language)
	{
	languageService.add(language);	
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguage language)
	{
		languageService.delete(1);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage language)
	{
		languageService.update(language);
	}
		
	@PostMapping("/getbyid")
	public void getById(@RequestBody ProgrammingLanguage language)
	{
		languageService.getById(language);
	}
	
}
