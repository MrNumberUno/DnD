package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceHuman implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Choose 1 Feat");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Human";
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
		DnDCharacter.setStrength(DnDCharacter.getStrength() + 1);
	}

	@Override
	public void addDexterityBonus() {
		DnDCharacter.setDexterity(DnDCharacter.getDexterity() + 1);
	}

	@Override
	public void addConstitutionBonus() {
		DnDCharacter.setConstitution(DnDCharacter.getConstitution() + 1);
	}

	@Override
	public void addIntelligenceBonus() {
		DnDCharacter.setIntelligence(DnDCharacter.getIntelligence() + 1);
	}

	@Override
	public void addWisdomBonus() {
		DnDCharacter.setWisdom(DnDCharacter.getWisdom() + 1);
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
