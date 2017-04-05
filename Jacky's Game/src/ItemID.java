
public enum ItemID {
	BasicHealth, BasicDefence;

	public Item getStats() {
		Item item = new Item();

		switch (this.name()) {

		case "BasicHealth":
			item.setHealth(50);
			item.setDefinition("Boost HP");
			item.setName("Basic Health Potion");
			break;

		case "BasicDefence":
			item.setDefence(50);
			item.setDefinition("Boost Defence");
			item.setName("Basic Defence Potion");
			break;
		}

		return item;

	}
}
