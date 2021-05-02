package Business;

import Entity.GameCategory;

public interface GameCategoryService {
	void add(GameCategory gameCategory);
	void delete(GameCategory gameCategory);
	void update(GameCategory gameCategory);
	void getAll(GameCategory[] gameCategories);
	
}
