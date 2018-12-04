package edu.century.finalProject;

import java.util.ArrayList;

public class Class implements Constants{
	private String className;
	private int baseHP;
	private int hp;
	private Dice hitDice;
	private int numHitDie;
	private ArrayList<Proficiency> classProficiencies;
	private ArrayList<Feature> classFeatures;
	private int classLvl;
	
	//Default constructor
	public Class() {
		this.className = "";
		this.baseHP = 8;
		this.hitDice = d8;
		this.numHitDie = 1;
		this.classProficiencies = new ArrayList<Proficiency>();
		this.classFeatures = new ArrayList<Feature>();
		this.classLvl = 1;
	}
	
	//Constructor
	public Class(String className, int baseHP, Dice hitDice, int numHitDie, 
			ArrayList<Proficiency> classProficiencies, ArrayList<Feature> classFeatures, int classLvl) {
		this.className = className;
		this.baseHP = baseHP;
		this.hitDice = hitDice;
		this.numHitDie = numHitDie;
		this.classProficiencies = classProficiencies;
		this.classFeatures = classFeatures;
		this.classLvl = classLvl;
		
	}

	//Getter setter
	public int getBaseHP() {
		return baseHP;
	}

	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	public Dice getHitDice() {
		return hitDice;
	}

	public void setHitDice(Dice hitDice) {
		this.hitDice = hitDice;
	}

	public int getNumHitDie() {
		return numHitDie;
	}

	public void setNumHitDie(int numHitDie) {
		this.numHitDie = numHitDie;
	}

	public ArrayList<Feature> getClassFeatures() {
		return classFeatures;
	}

	public void setClassFeatures(ArrayList<Feature> classFeatures) {
		this.classFeatures = classFeatures;
	}

	public void setClassProficiencies(ArrayList<Proficiency> classProficiencies) {
		this.classProficiencies = classProficiencies;
	}

	public int getClassLvl() {
		return classLvl;
	}

	public void setClassLvl(int classLvl) {
		this.classLvl = classLvl;
	}
	
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void addProficiency(Skill skill) {
		classProficiencies.add(new Proficiency(skill, classLvl));		
	}
	
	public void addFeature(Feature feature) {
		classFeatures.add(feature);
	}
	
	
	
}
