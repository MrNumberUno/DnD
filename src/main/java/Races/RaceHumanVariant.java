package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceHumanVariant implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Choose 1 Feat");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Human (Variant)";
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
	}

	@Override
	public void setSize() {
		DnDCharacter.setSize("Medium");
	}
}
