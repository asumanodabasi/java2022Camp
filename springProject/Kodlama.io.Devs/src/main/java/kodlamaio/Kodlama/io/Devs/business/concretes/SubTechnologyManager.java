package kodlamaio.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlamaio.Kodlama.io.Devs.business.requsts.CreateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;
import kodlamaio.Kodlama.io.Devs.business.responses.GetByIdSubTechnologyResponse;
import kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlamaio.Kodlama.io.Devs.entities.concrete.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService{
SubTechnologyRepository repository;
@Autowired
	public SubTechnologyManager(SubTechnologyRepository repository) {
	this.repository = repository;
}

	@Override
	public List<GetAllSubTechnologyResponse> getAll() {
		List<SubTechnology> subTechnologies=repository.findAll();
		List<GetAllSubTechnologyResponse> byIdSubTechnologyResponses=new ArrayList<>();
		for(SubTechnology tekno:subTechnologies)
		{ 
			GetAllSubTechnologyResponse response=new GetAllSubTechnologyResponse();
			response.setId(tekno.getSubTecId());
			response.setName(tekno.getSubTecName());
			byIdSubTechnologyResponses.add(response);
			
		}
		return byIdSubTechnologyResponses;
	}

	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		SubTechnology subTechnology=new SubTechnology();
		subTechnology.setSubTecId(createSubTechnologyRequest.getProgramingLangId());
		subTechnology.setSubTecName(createSubTechnologyRequest.getName());
		repository.save(subTechnology);
	}

	@Override
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
		SubTechnology technology=new SubTechnology();
		technology.setSubTecName(deleteSubTechnologyRequest.getName());
		repository.delete(technology);
		
	}

	@Override
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {
	SubTechnology technology=new SubTechnology();
	technology.setSubTecId(updateSubTechnologyRequest.getId());
	technology.setSubTecName(updateSubTechnologyRequest.getName());
	repository.save(technology);
	}

	

}
