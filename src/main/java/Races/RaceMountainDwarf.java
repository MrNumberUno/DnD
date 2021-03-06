package Races;

import java.util.ArrayList;

public class RaceMountainDwarf implements DnDRace {
	
	@Override
	public ArrayList<String> raceFeatures() {
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
	public int getSpeed() {
		return 25;
	}
	
	@Override
	public String getSize() {
		return "Medium";
	}
	
	@Override
	public int getMaximumHPBonus() {
		return 0;
	}

	@Override
	public int getStrengthBonus() {
		return 2;
	}

	@Override
	public int getDexterityBonus() {
		return 0;
	}

	@Override
	public int getConstitutionBonus() {
		return 2;
	}

	@Override
	public int getIntelligenceBonus() {
		return 0;
	}

	@Override
	public int getWisdomBonus() {
		return 0;
	}

	@Override
	public int getCharismaBonus() {
		return 0;
	}
	
}
