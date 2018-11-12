package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceHillDwarf implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
        raceFeatures.add("Darkvision");
        raceFeatures.add("Dwarven Resilience");
        raceFeatures.add("Dwarven Combat Training (prof w/ battleaxe,handaxe,throwing hammer,warhammer)");
        raceFeatures.add("Stonecutting");
        raceFeatures.add("Dwarven Toughness");
		return raceFeatures;
	}
	
	@Override
	public String getRace() {
		return "Hill Dwarf";
	}

	@Override
	public void setSpeed() {
		DnDCharacter.setSpeed(30);
	}

	@Override
	public void setMaximumHP() {
		DnDCharacter.setMaxHP(DnDCharacter.getMaxHP()+1);
	}

	@Override
	public void addStrengthBonus() {
	}

	@Override
	public void addDexterityBonus() {
	}

	@Override
	public void addConstitutionBonus() {
		DnDCharacter.setConstitution(DnDCharacter.getConstitution() + 2);
	}

	@Override
	public void addIntelligenceBonus() {
	}

	@Override
	public void addWisdomBonus() {
		DnDCharacter.setWisdom(DnDCharacter.getWisdom() + 1);
	}

	@Override
	public void addCharismaBonus() {
	}

	@Override
	public void setSize() {
		DnDCharacter.setSize("Medium");
	}
}
