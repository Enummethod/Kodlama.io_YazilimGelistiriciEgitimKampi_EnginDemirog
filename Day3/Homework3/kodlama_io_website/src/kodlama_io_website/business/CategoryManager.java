package kodlama_io_website.business;

import kodlama_io_website.core.loging.Logger;
import kodlama_io_website.dataAccess.CategoryDao;
import kodlama_io_website.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void addCategory(Category category) {
		if (category.getCategoryName().equals("Mobil Programlama") || category.getCategoryName().equals("Yapay Zeka")
				|| category.getCategoryName().equals("Web Programlama")) {
			System.out.println("Bu Kategori zaten var...");
		} else {
			categoryDao.addCategory(category);
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}
	}
}
