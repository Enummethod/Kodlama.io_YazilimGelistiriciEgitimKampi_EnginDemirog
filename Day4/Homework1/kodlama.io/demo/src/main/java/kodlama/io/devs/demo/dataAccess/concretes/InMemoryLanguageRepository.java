package kodlama.io.devs.demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.demo.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.demo.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(0, "JAVA"));
		languages.add(new Language(1, "PYTHON"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "C++"));
		languages.add(new Language(4, "GO"));
		languages.add(new Language(5, "KOTLİN"));
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void update(int id, Language language) {
		Language langue = getById(language.getId());
		langue.setName(language.getName());

	}

	@Override
	public void delete(int id) {
		languages.remove(id);
	}

	@Override
	public void add(Language language) {
		languages.add (language);
	}
	
	

}
