
package kodlama.io.rentACar.wepApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController // annotation
@RequestMapping("/api/brands") // domain + map
public class BrandsController {
	private BrandService brandService;

	@Autowired // IOC new.
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping("/getall") // domain + Rmap+Gmap
	public List<GetAllBrandsResponse> getAll() {

		return brandService.getAll();

	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
		
	}

}
