package kodlama.io.devs.demo.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.demo.entities.concretes.Language;

public interface LanguageRepository {

	List<Language>getAll();
	Language getById(int id);
	void update(int id, Language language);
	void delete(int id);
	void add(Language language);


}
