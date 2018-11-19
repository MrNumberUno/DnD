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
	public void givenDagger_whenMod3andProf2_thenProperties() {
		WeaponAttack sut = new WeaponAttack("Dagger", 3, 2);
		String expexted = "     Properties : Finesse Light Thrown (range 20/60) ";
		assert(sut.propertyString().equals(expexted));
	}
	
	@Test
	public void givenHandaxe_whenSetMod3andProf2_thenAttackBonus() {
		WeaponAttack sut = new WeaponAttack("Handaxe", 0, 0);
		sut.setAttack(3, 2);
		assert(sut.getAttackBonus() == 5);
	}
	
	@Test
	public void givenGreatclub_whenSetMod3_thenDamage() {
		WeaponAttack sut = new WeaponAttack("Greatclub", 0, 0);
		sut.setDamage(3);
		assert(sut.getDamage().equals("1d8 + 03"));
	}
	
	@Test
	public void givenJavalin_whenSetMod3Prof2_thenDamage() {
		WeaponAttack sut = new WeaponAttack("Javalin", 3, 2);
		assert(sut.attackString().equals("     Attack Bonus : +5"));
	}
}
