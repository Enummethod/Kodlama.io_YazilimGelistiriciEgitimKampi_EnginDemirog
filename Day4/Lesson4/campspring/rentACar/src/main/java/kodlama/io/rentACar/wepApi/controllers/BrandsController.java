
package kodlama.io.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation
@RequestMapping("/api/brands")//domain + 
public class BrandsController {
	private BrandService brandService;

	@Autowired  //IOC new.
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
    @GetMapping("/getall") //domain + map 
	public List<Brand> getAll() {

		return brandService.getAll();

	}

}
