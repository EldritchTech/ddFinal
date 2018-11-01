package edu.century.finalProject;

public class Class implements Constants{
	private int baseHP;
	private Dice hitDice;
	private int numHitDie;
	private int [] spellSlots;
	private Proficency [] classProficiences;
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
}
