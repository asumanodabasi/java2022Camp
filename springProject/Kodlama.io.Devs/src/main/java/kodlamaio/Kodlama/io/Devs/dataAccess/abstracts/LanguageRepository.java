package kodlamaio.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Kodlama.io.Devs.entities.concrete.ProgrammingLanguage;

@Repository
public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{
	
	
}
