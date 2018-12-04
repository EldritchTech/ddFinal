package edu.century.finalProject;

public class Proficiency extends Skill{
	private Skill skillName;
	
	public Proficiency(Skill skill, int lvl) {
		this.skillName = skill;
		setProficiency(lvl);
	}

	private void setProficiency(int lvl) {
		skillName.setProf(true, lvl);
	}
}
