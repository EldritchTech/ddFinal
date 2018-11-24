package edu.century.finalProject;

public class Class implements Constants{
	private String className;
	private int baseHP;
	private Dice hitDice;
	private int numHitDie;
	private Proficiency [] classProficiencies;
	private Feature [] classFeatures;
	private int classLvl;
	private static int index = 0;
	
	//Default constructor
	public Class() {
		this.className = "";
		this.baseHP = 8;
		this.hitDice = d8;
		this.numHitDie = 1;
		this.classProficiencies = null;
		this.classFeatures = null;
		this.classLvl = 1;
	}
	
	//Constructor
	public Class(String className, int baseHP, Dice hitDice, int numHitDie, int [] spellSlots, 
			Proficiency [] classProficiencies, Feature [] classFeatures, int classLvl) {
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

	public Proficiency[] getclassProficiencies() {
		return classProficiencies;
	}

	public void setclassProficiencies(Proficiency[] classProficiencies) {
		this.classProficiencies = classProficiencies;
	}

	public Feature[] getClassFeatures() {
		return classFeatures;
	}

	public void setClassFeatures(Feature[] classFeatures) {
		this.classFeatures = classFeatures;
	}

	public int getClassLvl() {
		return classLvl;
	}

	public void setClassLvl(int classLvl) {
		this.classLvl = classLvl;
	}
	
	public void addProficiency(Skill skill) {
		if(index < classProficiencies.length) {
			this.classProficiencies[index] = new Proficiency(skill);
			index++;
		} else {
			ensureCapacity();
			this.classProficiencies[index] = new Proficiency(skill);
			index++;
		}
		
	}
	
	public void ensureCapacity() {
		Proficiency [] newProficiencies = new Proficiency[(classProficiencies.length * 2)];
		for(int i = 0; i < classProficiencies.length; i++) {
			newProficiencies[i] = classProficiencies[i];
		}
		setclassProficiencies(newProficiencies);
	}
	
	public void levelUp() {
		
	}
	
	
}
