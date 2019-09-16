package model;

public enum Category {
	ANDESITE(1), BOOKSHELF(2), BRICKS(3), CHEST(4), COBBLESTONE(5), CRAFTINGTABLE(6), DIAMOND(7), DIORITE(8);

	private final int type;

	Category(int type) {
		this.type = type;
	}
}
