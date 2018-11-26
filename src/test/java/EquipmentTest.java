import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class EquipmentTest {

	@Test
	public void givenEquipmentName_whenGetBackgroundGear_thenItems() {
		Equipment sut = new Equipment();
		String[] items = sut.getBackgroundGear("Acolyte");
		String[] expected = new String[6];
		expected[0] = "holy symbol";
		expected[1] = "prayer book";
		expected[2] = "5 sticks of incense";
		expected[3] = "vestments";
		expected[4] = "common clothes";
		expected[5] = "belt pouch (containing 15gp)";
		assert(Arrays.equals(items, expected));
	}
	
	@Test
	public void givenEquipment_whenGetBurglarPack_thenItems() {
		Equipment sut = new Equipment();
		String[] items = sut.getBurglarsPack();
		String[] expected = new String[14];
		expected[0] = "backpack";
		expected[1] = "1,000 ball bearings";
		expected[2] = "10ft of string";
		expected[3] = "a bell";
		expected[4] = "5 candles";
		expected[5] = "crowbar";
		expected[6] = "hammer";
		expected[7] = "10 pitons";
		expected[8] = "hooded lantern";
		expected[9] = "2 flasks of oil";
		expected[10] = "5 days of rations";
		expected[11] = "tinderbox";
		expected[12] = "waterskin";
		expected[13] = "50 ft. hempen rope";
		assert(Arrays.equals(items, expected));
	}
	
	@Test
	public void givenEquipment_whenGetDiplomatsPack_thenItems() {
		Equipment sut = new Equipment();
		String[] items = sut.getDiplomatsPack();
		String[] expected = new String[11];
		expected[0] = "chest";
		expected[1] = "2 scroll cases";
		expected[2] = "fine clothes";
		expected[3] = "bottle of ink";
		expected[4] = "ink pen";
		expected[5] = "lamp";
		expected[6] = "2 flasks of oil";
		expected[7] = "5 sheets of paper";
		expected[8] = "vial of perfume";
		expected[9] = "sealing wax";
		expected[10] = "soap";
		assert(Arrays.equals(items, expected));
	}
}
