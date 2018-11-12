package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceHighElf implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
        raceFeatures.add("1 Wizard Cantrip");
        raceFeatures.add("Extra Language");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "High Elf";
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
	}

	@Override
	public void addDexterityBonus() {
		DnDCharacter.setDexterity(DnDCharacter.getDexterity() + 2);
	}

	@Override
	public void addConstitutionBonus() {
	}

	@Override
	public void addIntelligenceBonus() {
		DnDCharacter.setIntelligence(DnDCharacter.getIntelligence() + 1);
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
