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
	
	/* Desc: initializes base skills with given scores
	 * Param: int [] scores, must be >3 && <20
	 * Preconditions: scores.length = 6, skill order alphabetical
	 * Postcondition: Base Skills initialized with desired score 3 < x <= 20
	 * 
	 */
	
	public BaseSkills(int [] scores){
		if(scores.length < 7 && scores.length > 5) {
			this.Charisma = new Skill(scores[0]);
			this.Constitution = new Skill(scores[1]);
			this.Dexterity = new Skill(scores[2]);
			this.Intelligence = new Skill(scores[3]);
			this.Strength = new Skill(scores[4]);
			this.Wisdom = new Skill(scores[5]);
		}
	}
	
	/*
	 *  Getters & Setters
	 */

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
	
	/* Adds Racial Bonus from Race class to Skill scores
	 * Param: int [] racialBonus (from Race class)
	 * 
	 */
	
	public void addRacialBonus(int [] bonus) {
		Charisma.addPoints(bonus[0]);
		Constitution.addPoints(bonus[1]);
		Dexterity.addPoints(bonus[2]);
		Intelligence.addPoints(bonus[3]);
		Strength.addPoints(bonus[4]);
		Wisdom.addPoints(bonus[5]);
	}
	
	/* To String Method
	 * Returns formatted scores
	 */
	@Override
	public String toString() {
		String Cha = String.format("%-15s %4d (%2d)\n", "Charisma:", Charisma.getScore(), Charisma.getBonus());
		String Con = String.format("%-15s %4d (%2d)\n", "Constitution:", Constitution.getScore(), Constitution.getBonus());
		String Dex = String.format("%-15s %4d (%2d)\n", "Dexterity:", Dexterity.getScore(), Dexterity.getBonus());
		String Int = String.format("%-15s %4d (%2d)\n", "Intelligence:", Intelligence.getScore(), Intelligence.getBonus());
		String Str = String.format("%-15s %4d (%2d)\n", "Strength:", Strength.getScore(), Strength.getBonus());
		String Wis = String.format("%-15s %4d (%2d)\n", "Wisdom:", Wisdom.getScore(), Wisdom.getBonus());
		
		String str = Cha + Con + Dex + Int + Str + Wis;
		
		return str;
	}
	
}