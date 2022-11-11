package kodlamaio.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlamaio.Kodlama.io.Devs.business.requsts.CreateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;

@RestController
@RequestMapping("/api/subtechnology")
public class SubTechnologyControllers {
	SubTechnologyService service;
@Autowired
	public SubTechnologyControllers(SubTechnologyService service) {
		this.service = service;
	}
@GetMapping("/getAll")
	public List<GetAllSubTechnologyResponse> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateSubTechnologyRequest request) {
		service.add(request);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
		service.delete(deleteSubTechnologyRequest);
	}
	@PutMapping("/update")
	public void update(UpdateSubTechnologyRequest request)
	{
		service.update(request);
	}
}
