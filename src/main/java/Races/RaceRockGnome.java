package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceRockGnome implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
	    raceFeatures.add("Gnome Cunning");
	    raceFeatures.add("Artificer's Lore");
        raceFeatures.add("Tinker");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Rock Gnome";
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
	}

	@Override
	public void addConstitutionBonus() {
		DnDCharacter.setConstitution(DnDCharacter.getConstitution() + 1);
	}

	@Override
	public void addIntelligenceBonus() {
		DnDCharacter.setIntelligence(DnDCharacter.getIntelligence() + 2);
	}

	@Override
	public void addWisdomBonus() {
	}

	@Override
	public void addCharismaBonus() {
	}

	@Override
	public void setSize() {
		DnDCharacter.setSize("Small");
	}
}
