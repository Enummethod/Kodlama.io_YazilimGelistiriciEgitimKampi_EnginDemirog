package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

 @Service // bu sınıf bir Business nesnesidir.
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		super();
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() {

		
		
	List<Brand> brands = brandRepository.findAll();
	List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
	
		for (Brand brand : brands) {
			GetAllBrandsResponse responseItem= new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponses.add(responseItem);
		}
		return brandsResponses;
	}


	@Override
	public void add(CreateBrandRequest creatBrandRequest) {
		Brand brand = new Brand();
		brand.setName(creatBrandRequest.getName());
		this.brandRepository.save(brand);
	}

}