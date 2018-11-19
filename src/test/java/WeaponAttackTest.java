import static org.junit.Assert.*;

import org.junit.Test;

public class WeaponAttackTest {

	@Test
	public void givenClub_whenMod2andProf3_thenDamage() {
		WeaponAttack sut = new WeaponAttack("Club", 3, 2);
		assert(sut.damageString().equals("Club : Bludgeoning 1d4 + 3 dmg"));
	}
	
	@Test
	public void givenLightCrossbow_whenMod3andProf2_thenIsRanged() {
		WeaponAttack sut = new WeaponAttack("Light Crossbow", 3, 2);
		assert(sut.isRanged("Light Crossbow"));
	}
	
	@Test
	public void givenRapier_whenMod3andProf2_thenIsRanged() {
		WeaponAttack sut = new WeaponAttack("Rapier", 3, 2);
		assert(sut.isFinesse("Rapier"));
	}
	
	@Test
	public void givenDagger_whenMod3andProf2_thenIsProperties() {
		WeaponAttack sut = new WeaponAttack("Dagger", 3, 2);
		String expexted = "     Properties : Finesse Light Thrown (range 20/60) ";
		assert(sut.propertyString().equals(expexted));
	}
}
