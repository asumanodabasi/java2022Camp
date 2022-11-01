package kodlamaio.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

public interface LanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language);
	public void delete(int id);
	void update(ProgrammingLanguage language);
	ProgrammingLanguage getById(ProgrammingLanguage language);

}
