package src.main.java.Classes;

import java.util.ArrayList;

import src.main.java.DnDCharacter;
import src.main.java.DnDCharacter.DnDClass;

public class ClassBarbarian implements DnDCharacter.DnDClass {

	@Override
	public ArrayList<String> classFeatures() {
		ArrayList<String> classFeatures = new ArrayList<>();
		classFeatures.add("Rage x2");
        classFeatures.add("Unarmored Defense");
		return classFeatures;
	}

	@Override
	public ArrayList<String> proficiencies() {
		ArrayList<String> proficiencies = new ArrayList<>();
		proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        proficiencies.add("Strength Saving Throw");
        proficiencies.add("Constitution Saving Throw");
		return proficiencies;
	}

	@Override
	public String getDnDClass() {
		return "Barbarian";
	}

	@Override
	public void classChanges() {
		DnDCharacter.setStrengthST(DnDCharacter.getStrMod() + DnDCharacter.getProfBonus());
		DnDCharacter.setConstitutionST(DnDCharacter.getConMod() + DnDCharacter.getProfBonus());
		DnDCharacter.setMaximumHP(12 + DnDCharacter.getConMod());
	}

}
