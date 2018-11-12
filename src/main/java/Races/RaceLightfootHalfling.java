package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceLightfootHalfling implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Brave");
        raceFeatures.add("Lucky");
        raceFeatures.add("Halfling Nimbleness");
        raceFeatures.add("Naturally Stealthy");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Lightfoot Halfling";
	}

	@Override
	public void setSpeed() {
		DnDCharacter.setSpeed(25);
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

	@Override
	public void setSize() {
		DnDCharacter.setSize("Small");
	}

}
