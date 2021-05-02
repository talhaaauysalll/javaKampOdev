package Business;

import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getProductName()+" eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getProductName()+" silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getProductName()+" güncellendi");
		
	}

	@Override
	public void getAll(Game[] games) {
		System.out.println("Sitemizde bulunan oyunlar...");
		for(Game game:games) {
			System.out.println(game.getProductName());
		}
		
	}

}
