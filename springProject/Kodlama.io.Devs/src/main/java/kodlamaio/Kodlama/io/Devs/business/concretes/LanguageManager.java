package kodlamaio.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlamaio.Kodlama.io.Devs.business.requsts.CreateProgramminLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;
import kodlamaio.Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageResponse;
import kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> languages=languageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> allProgrammingLanguageResponses=new ArrayList<GetAllProgrammingLanguageResponse>();
		for(ProgrammingLanguage lang:languages) {
			GetAllProgrammingLanguageResponse response=new GetAllProgrammingLanguageResponse();
			response.setName(lang.getName());
			response.setId(lang.getId());
			allProgrammingLanguageResponses.add(response);
		}
		
		
		return allProgrammingLanguageResponses;
	}

	@Override
	public void add(CreateProgramminLanguageRequest createProgramminLanguageRequest) throws Exception{
		ProgrammingLanguage language=new ProgrammingLanguage();
		if(createProgramminLanguageRequest.getName()==null ||createProgramminLanguageRequest.getName()=="") {
			throw new Exception("name cannot be empty");
		}
		language.setName(createProgramminLanguageRequest.getName().toUpperCase());
		this.languageRepository.save(language);
		
	}

	@Override
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.setId(deleteProgrammingLanguageRequest.getId());
		this.languageRepository.delete(language);
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgramminLanguageRequest) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.setId(updateProgramminLanguageRequest.getId());
		language.setName(updateProgramminLanguageRequest.getName().toUpperCase());
		this.languageRepository.save(language);
	}

	

}
