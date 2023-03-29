package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {//burdan itibaren veritabanı nesnesi kullanma!
		List<GetAllBrandResponse> getAll();
		GetByIdBrandResponse getById(int id);
		void add(CreateBrandRequest createBrandRequest);
		void update(UpdateBrandRequest updateBrandRequest);
		void delete(int id);
}
