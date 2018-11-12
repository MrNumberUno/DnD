package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceWoodElf implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Elf Weapon Training (prof w/ longsword,shortsword,shortbow,longbow)");
        raceFeatures.add("Fleet of Foot");
        raceFeatures.add("Mask of the Wild");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Wood Elf";
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
