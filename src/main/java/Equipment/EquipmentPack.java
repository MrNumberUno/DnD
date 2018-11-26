//Abstract Equipment Class.
//Not yet used
package Equipment;

import java.util.ArrayList;

public abstract class EquipmentPack {
	String name;
	ArrayList<String> items;
	
	abstract ArrayList<String> getItems();
}
