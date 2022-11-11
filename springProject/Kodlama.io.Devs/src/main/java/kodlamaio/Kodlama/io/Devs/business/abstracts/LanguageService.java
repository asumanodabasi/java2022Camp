package kodlamaio.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Kodlama.io.Devs.business.requsts.CreateProgramminLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateProgrammingLanguageRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageResponse;

public interface LanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgramminLanguageRequest createProgramminLanguageRequest ) throws Exception;
	public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	void update(UpdateProgrammingLanguageRequest updateProgramminLanguageRequest);
	
}
