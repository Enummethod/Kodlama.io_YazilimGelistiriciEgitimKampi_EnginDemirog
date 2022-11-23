package kodlama_io_website.dataAccess;

import kodlama_io_website.entities.Category;

public interface CategoryDao {

   void	addCategory(Category category);
   void deleteCategory(Category category);
}
