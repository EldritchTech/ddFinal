package edu.century.finalProject;

public class Class implements Constants{
	private int baseHP;
	private Dice hitDice;
	private int numHitDie;
	private int [] spellSlots;
	private Proficiency [] classProficiences;
	private Feature [] classFeatures;
	private int classLvl;
	
	public Class() {
		this.baseHP = 8;
		this.hitDice = d8;
		this.numHitDie = 1;
		this.spellSlots = null;
		this.classProficiences = null;
		this.classFeatures = null;
		this.classLvl = 1;
	}

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

	public int[] getSpellSlots() {
		return spellSlots;
	}

	public void setSpellSlots(int[] spellSlots) {
		this.spellSlots = spellSlots;
	}

	public Proficiency[] getClassProficiences() {
		return classProficiences;
	}

	public void setClassProficiences(Proficiency[] classProficiences) {
		this.classProficiences = classProficiences;
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
	
	
}
