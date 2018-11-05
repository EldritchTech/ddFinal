package edu.century.finalProject;

public class Proficiency extends Skill{
	private Skill skillName;
	
	public Proficiency(Skill skill) {
		this.skillName = skill;
		setProficiency();
	}

	private void setProficiency() {
		skillName.setProf(true);
	}
}
