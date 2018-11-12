package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceDragonBorn implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Draconic Ancestry");
        raceFeatures.add("Breath Weapon");
        raceFeatures.add("Damage Resistance");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Dragon Born";
	}

	@Override
	public void setSpeed() {
		DnDCharacter.setSpeed(30);
		
	}

	@Override
	public void setMaximumHP() {
	}

	@Override
	public void addStrengthBonus() {
		DnDCharacter.setStrength(DnDCharacter.getStrength() + 2);
	}

	@Override
	public void addDexterityBonus() {
	}

	@Override
	public void addConstitutionBonus() {
	}

	@Override
	public void addIntelligenceBonus() {
	}

	@Override
	public void addWisdomBonus() {
	}

	@Override
	public void addCharismaBonus() {
		DnDCharacter.setCharisma(DnDCharacter.getCharisma() + 1);
	}

	@Override
	public void setSize() {
		DnDCharacter.setSize("Medium");
	}

}
