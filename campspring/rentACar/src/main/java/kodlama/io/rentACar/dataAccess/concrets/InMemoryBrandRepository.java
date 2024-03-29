package kodlama.io.rentACar.dataAccess.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrets.Brand;

@Repository //bu sınıf bir DataAccess nesnesidir demiş olduk springe
public class InMemoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands=new ArrayList<Brand>();   //burda bos bir liste olusturduk
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Audi"));
		brands.add(new Brand(3,"Mercedes"));
		brands.add(new Brand(4,"Fiat"));
		brands.add(new Brand(5,"Renault"));
	}

	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
