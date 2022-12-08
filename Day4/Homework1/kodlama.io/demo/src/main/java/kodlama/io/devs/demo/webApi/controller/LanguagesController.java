package kodlama.io.devs.demo.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.devs.demo.business.abstracts.LanguageService;
import kodlama.io.devs.demo.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@DeleteMapping("/{id}")
	public void delete(int id) {
		languageService.delete(id);
	}
	
	@GetMapping("/{id}")
	public Language getById(@PathVariable() int id) {
		return languageService.getById(id);
	}
	

	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}

	@PutMapping("/update")
	public void update(Language Language, int id) {
		languageService.update(id, Language);
	}



}
