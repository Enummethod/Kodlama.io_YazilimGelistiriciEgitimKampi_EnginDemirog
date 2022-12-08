package kodlama.io.devs.demo.business.abstracts;

import java.util.List;

import kodlama.io.devs.demo.entities.concretes.Language;

public interface LanguageService {
	
	void add(Language language) throws Exception;
	void delete(int id);
	Language getById(int id);
	List<Language>getAll();
	void update(int id, Language language);
}
