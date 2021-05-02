package Business;

import Entity.Game;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void getAll(Game[] games);
}
