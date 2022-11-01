package kodlamaio.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository lgrep;
	List<ProgrammingLanguage> languages;

	public LanguageManager(LanguageRepository _lgrep) {
		super();
		this.lgrep = _lgrep;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return lgrep.getAll();
	}

	@Override
	public void add(ProgrammingLanguage language) {
		if(lgrep.equals(language.getName()))
		{
			System.out.println("Name is not equals");
		}
		else if(language.getName().isEmpty())
		{
			System.out.println("Name is not empty!");
		}
		else
		{
			lgrep.add(language);
		}
		
	}

	@Override
	public void delete(int id ) {
		lgrep.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguage language) {
		
		lgrep.update(language);
	}

	@Override
	public ProgrammingLanguage getById(ProgrammingLanguage language) {
		for(ProgrammingLanguage pl :languages)
		{
			if(pl.getId()==language.getId())
			{
				System.out.println("Language get by id");
				 lgrep.getById(language);
			}
		}
		return null;
	}

}
