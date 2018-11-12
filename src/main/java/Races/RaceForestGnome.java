package src.main.java.Races;

import java.util.ArrayList;

import src.main.java.DnDCharacter;

public class RaceForestGnome implements DnDCharacter.DnDRace {

	@Override
	public ArrayList<String> RaceFeatures() {
		ArrayList<String> raceFeatures = new ArrayList<>();
		raceFeatures.add("Darkvision");
	    raceFeatures.add("Gnome Cunning");
	    raceFeatures.add("Natural Illusionist");
        raceFeatures.add("Speak with Small Beasts");
		return raceFeatures;
	}

	@Override
	public String getRace() {
		return "Forest Gnome";
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
		DnDCharacter.setDexterity(DnDCharacter.getDexterity() + 1);
	}

	@Override
	public void addConstitutionBonus() {	
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
