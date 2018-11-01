package edu.century.finalProject;

public class Proficency extends Skill{
	private Skill skillName;
	
	public Proficency(Skill skill) {
		this.skillName = skill;
		setProficency();
	}

	private void setProficency() {
		skillName.setProf(true);
		
		
		
		skillName.setBonus(getBonus());
	}
}
