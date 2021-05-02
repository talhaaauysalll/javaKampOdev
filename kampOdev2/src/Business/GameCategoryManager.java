package Business;

import Entity.GameCategory;

public class GameCategoryManager implements GameCategoryService {

	@Override
	public void add(GameCategory gameCategory) {
		System.out.println(gameCategory.getCategoryName()+" eklendi");
		
	}

	@Override
	public void delete(GameCategory gameCategory) {
		System.out.println(gameCategory.getCategoryName()+" silindi");
		
	}

	@Override
	public void update(GameCategory gameCategory) {
		System.out.println(gameCategory.getCategoryName()+" güncellendi");
		
	}

	@Override
	public void getAll(GameCategory[] gameCategories) {
		System.out.println("Oyun Kategorilerimiz");
		for(GameCategory gameCategory:gameCategories) {
			System.out.println(gameCategory.getCategoryName());
		}
		
	}

}
