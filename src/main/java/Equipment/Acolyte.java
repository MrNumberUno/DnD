package Equipment;

import java.util.ArrayList;
import java.util.Arrays;

public class Acolyte extends EquipmentPack {
	String name = "Acolyte";
	ArrayList<String> items = new ArrayList<String>(
		      Arrays.asList("holy symbol", "prayer book", "5 sticks of incense", "vestments", "common clothes", "belt pouch (containing 15gp)"));
	@Override
	ArrayList<String> getItems() {
		return items;
	}
}
