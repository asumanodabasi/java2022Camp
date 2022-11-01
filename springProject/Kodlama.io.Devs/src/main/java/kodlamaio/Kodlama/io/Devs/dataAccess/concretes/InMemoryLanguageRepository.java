package kodlamaio.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;
@Repository 
public class InMemoryLanguageRepository implements LanguageRepository {

	List<ProgrammingLanguage>  languages;
	

	public InMemoryLanguageRepository() {
		languages=new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"C#"));
		languages.add(new ProgrammingLanguage(2,"Java"));
		languages.add(new ProgrammingLanguage(3,"Phyton"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		
		languages.add(language);
	}

	@Override
	public void delete(int id) {	
				languages.remove(id);			
		}
		
	

	@Override
	public ProgrammingLanguage getById(ProgrammingLanguage language) {
	 for(ProgrammingLanguage pl:languages)
	 {
		 if(pl.getId()==language.getId())
		 {
			 return pl;
		 }
	 }
		return null;
	}

	@Override
	public void update(ProgrammingLanguage language) {
		for(ProgrammingLanguage pl: languages)
		{
			if(pl.getId()==language.getId())
			{
				pl.setName(language.getName());
			}
		}
		
	}

}
