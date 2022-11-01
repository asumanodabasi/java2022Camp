package kodlamaio.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

public interface LanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language);
	void delete(int id);
	ProgrammingLanguage getById(ProgrammingLanguage language);
	void update(ProgrammingLanguage language);
}
