package kodlama.io.rentACar.business.concrets;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModuleMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concrets.Brand;
import lombok.AllArgsConstructor;

@Service //bu sınıf bir Bussiness nesnesidir demiş olduk springe
@AllArgsConstructor
public class BrandManager implements BrandService{
     private BrandRepository brandRepository; 
	 private ModuleMapperService mapperService;
//AllArgsConstructor yazınca bunun isini yapmis oldu
//	@Autowired
//	public BrandManager(BrandRepository brandRepository) {
//	
//	this.brandRepository = brandRepository;   //injection
//}


	@Override
	public List<GetAllBrandResponse> getAll() {
		List<Brand> brands=brandRepository.findAll(); //datayı gez
//		List<GetAllBrandResponse> brandsResponse=new ArrayList<GetAllBrandResponse>(); //bos bir listesi olustur
//		for (Brand brand:brands) {
//			GetAllBrandResponse responseItem=new GetAllBrandResponse(); 
//			responseItem.setId(brand.getId()); //branddaki idyi GetAllBransResponse daki id ye esitle
//			responseItem.setName(brand.getName());	//aynı seyi name icin de yap
		//burdaki ala arttikca yazmak zorlasir bu yuden 45.satirdaki kod yazilir
//			brandsResponse.add(responseItem); 
//		}
		
		//yukardaki kodun kısa hali 
		List<GetAllBrandResponse> brandResponses=brands.stream()
				.map(barnd->this.mapperService.forResponse().map(barnd, GetAllBrandResponse.class))
				.collect(Collectors.toList());
		return brandResponses;
	}


	@Override
	public void add(CreateBrandRequest createBrandRequest) {
	//Brand brand =new Brand();
	//brand.setName(createBrandRequest.getName());
		
	Brand brand=this.mapperService.forRequest().map(createBrandRequest, Brand.class);
	this.brandRepository.save(brand);
		
	}


	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand=this.brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse response=this.mapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		return response;
	}


	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand=this.mapperService.forResponse().map(updateBrandRequest,Brand.class);
		this.brandRepository.save(brand);
		
	}


	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}

}
