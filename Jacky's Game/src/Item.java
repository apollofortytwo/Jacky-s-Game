
public class Item {

	private ItemID id = null;
	private int health = 0;
	private int defence = 0;
	private int attack = 0;
	private int speed = 0;
	private String name = "BLANK";
	private String definition = "BLANK";

	public Item(Item item) {
		id = item.id;
		health = item.getHealth();
		defence = item.getDefence();
		attack = item.getAttack();
		speed = item.getSpeed();
		name = item.getName();
		definition = item.getDefinition();
	}
	
	public Item(){
		
	}
	
	public void use(){
		
	}
	
	@Override 
	public String toString(){
		return null;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
}
