package kodlamaio.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Kodlama.io.Devs.business.requsts.CreateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.DeleteSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.requsts.UpdateSubTechnologyRequest;
import kodlamaio.Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponse> getAll();
	void add(CreateSubTechnologyRequest  createSubTechnologyRequest);
	void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
	void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);
	
}
