package edu.century.finalProject;

public class BaseSkills {
	private Skill Charisma;
	private Skill Constitution;
	private Skill Dexterity;
	private Skill Intelligence;
	private Skill Strength;
	private Skill Wisdom;
	
	public BaseSkills() {
		this.Charisma = new Skill();
		this.Constitution = new Skill();
		this.Dexterity = new Skill();
		this.Intelligence = new Skill();
		this.Strength = new Skill();
		this.Wisdom = new Skill();
	}

	public Skill getCharisma() {
		return Charisma;
	}

	public void setCharisma(Skill charisma) {
		Charisma = charisma;
	}

	public Skill getConstitution() {
		return Constitution;
	}

	public void setConstitution(Skill constitution) {
		Constitution = constitution;
	}

	public Skill getDexterity() {
		return Dexterity;
	}

	public void setDexterity(Skill dexterity) {
		Dexterity = dexterity;
	}

	public Skill getIntelligence() {
		return Intelligence;
	}

	public void setIntelligence(Skill intelligence) {
		Intelligence = intelligence;
	}

	public Skill getStrength() {
		return Strength;
	}

	public void setStrength(Skill strength) {
		Strength = strength;
	}

	public Skill getWisdom() {
		return Wisdom;
	}

	public void setWisdom(Skill wisdom) {
		Wisdom = wisdom;
	}
	
	public void addRacialBonus(int [] bonus) {
		Charisma.addPoints(bonus[0]);
		Constitution.addPoints(bonus[1]);
		Dexterity.addPoints(bonus[2]);
		Intelligence.addPoints(bonus[3]);
		Strength.addPoints(bonus[4]);
		Wisdom.addPoints(bonus[5]);
	}
	
}