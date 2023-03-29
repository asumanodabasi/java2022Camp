package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController  //annatation =bilgilendirme ifadesi.Uygulama derlendiginde veya calistiginda
//kimde restcontroller var diye bakiyo bulunca burası ERİŞİM NOKTASI oldugunu anlıyor
@RequestMapping("/api/brands") //kontrollere nasıl ulaşıcagını saglar.Yani adresin sonuna 
//"/api/brands" derse BrandsController kastediyo demektir 
@AllArgsConstructor
public class BrandsController {
 
	private BrandService brandService;

@Autowired //parametreleine bak,uygulamayı tara kim BrandService i implemente ediyo BrandManager
//onun newlenmiş halini bana ver demek 

@GetMapping ()
public List<GetAllBrandResponse> getAll(){
	return brandService.getAll();
}

@GetMapping("/{id}")
public GetByIdBrandResponse getById(@PathVariable int id) {
	return brandService.getById(id);
}
@PostMapping()
@ResponseStatus(code=HttpStatus.CREATED) //http de postlar 201 dondursun diye
public void add(CreateBrandRequest createBrandRequest) {
	this.brandService.add(createBrandRequest);
}

@PutMapping()
public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
	this.brandService.update(updateBrandRequest);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable int id) {
	this.brandService.delete(id);
}
}
