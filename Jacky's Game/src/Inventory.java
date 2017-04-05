import java.util.ArrayList;

public class Inventory {

	private ArrayList<Item> contents = new ArrayList<Item>();
	int size;

	Inventory(int size) {
		this.size = size;
	}
	
	public void addItem(Item item){
		if(contents.size() < size){
			contents.add(item);
		}
	}
	
	/**
	 * prints contents of the inventory, does not give the item stat's 
	 */
	public String toString(){
		String string = "";
		for(int i = 0; i < contents.size(); i++){
			string += (i+1)+") " + contents.get(i) + "\n";
		}
		return string;
	}
	
	
	
	
}
