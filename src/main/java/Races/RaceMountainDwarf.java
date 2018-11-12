package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceMountainDwarf implements DnDCharacter.DnDRace {
	
	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
        raceFeatures.add("Darkvision");
        raceFeatures.add("Dwarven Resilience");
        raceFeatures.add("Dwarven Combat Training (prof w/ battleaxe,handaxe,throwing hammer,warhammer)");
        raceFeatures.add("Stonecutting");
        raceFeatures.add("Dwarven Armor Training (prof w/ light and medium armor)");
		return raceFeatures;
	}
	
	@Override
	public String getRace() {
		return "Mountain Dwarf";
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
		DnDCharacter.setConstitution(DnDCharacter.getConstitution() + 2);
	}

	@Override
	public void addIntelligenceBonus() {
	}

	@Override
	public void addWisdomBonus() {
	}

	@Override
	public void addCharismaBonus() {
	}

	@Override
	public void setSize() {
		DnDCharacter.setSize("Medium");
	}
	
}
