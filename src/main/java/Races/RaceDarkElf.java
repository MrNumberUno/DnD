package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceDarkElf implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
        raceFeatures.add("Fey Ancestry");
        raceFeatures.add("Trance");
        raceFeatures.add("Keen Senses");
        raceFeatures.add("Superior Darkvision");
        raceFeatures.add("Sunlight Sensitivity");
        raceFeatures.add("Drow Magic");
        raceFeatures.add("Drow Weapon Training (prof w/ rapiers,shortswords,hand crossbows)");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Elf";
	}
	public void setSize() {
		DnDCharacter.setSize("Medium");
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
	}

	@Override
	public void addCharismaBonus() {
		DnDCharacter.setCharisma(DnDCharacter.getCharisma() + 1);
	}
	
}
