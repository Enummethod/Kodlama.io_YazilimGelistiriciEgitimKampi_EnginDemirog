package kodlama.io.devs.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.demo.business.abstracts.LanguageService;
import kodlama.io.devs.demo.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.demo.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName().isEmpty()) {
            throw new Exception("Programlama dili boş geçilemez...");
        }
        for (Language languages : getAll()) {
            if (languages.getName() == language.getName()) {
                throw new Exception("Programlama dili tekrar edilemez");
            }
        }
        languageRepository.add(language);
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);

	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void update(int id, Language language) {
		languageRepository.update(id, language);
	}

}
