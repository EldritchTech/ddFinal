package edu.century.finalProject;

public class Character {
	private String name;
	private String gender;
	private String Campaign;
	private String playerName;
	private int level = 1;
	private Race race;
	private int proficiencyBonus;
	private int hitPoints;
	private int armorClass = 10;
	private boolean shortRest;
	private boolean longRest;
	private Barbarian barbarianClass;
	private Bard bardClass;
	
	private BaseSkills baseSkills;
	private ExtendedSkills extendedSkills;
	
	
	//Base constructor
	public Character() {
		this.name = null;
		this.level = 1;
		this.race = null;
		ProficiencyBonus();
		this.hitPoints = 0;
		this.shortRest = true;
		this.longRest = true;
		this.barbarianClass = null;
		this.bardClass = null;
		this.baseSkills = new BaseSkills();
		this.extendedSkills = new ExtendedSkills(baseSkills);
	}

	//Set proficiency bonus based on level

	private void ProficiencyBonus() {
		switch (level) {
		case 1:
			proficiencyBonus = 2;
			break;
		case 2:
			proficiencyBonus = 2;
			break;
		case 3: 
			proficiencyBonus = 2;
			break;
		case 4:
			proficiencyBonus = 2;
			break;
		case 5:
			proficiencyBonus = 3;
			break;
		case 6: 
			proficiencyBonus = 3;
			break;
		case 7: 
			proficiencyBonus = 3;
			break;
		case 8:
			proficiencyBonus = 3;
			break;
		case 9: 
			proficiencyBonus = 4;
			break;
		case 10:
			proficiencyBonus = 4;
			break;
		case 11:
			proficiencyBonus = 4;
			break;
		case 12:
			proficiencyBonus = 4;
			break;
		case 13:
			proficiencyBonus = 5;
			break;
		case 14: 
			proficiencyBonus = 5;
			break;
		case 15:
			proficiencyBonus = 5;
			break;
		case 16: 
			proficiencyBonus = 5;
			break;
		case 17:
			proficiencyBonus = 6;
			break;
		case 18: 
			proficiencyBonus = 6;
			break;
		case 19: 
			proficiencyBonus = 6;
			break;
		case 20: 
			proficiencyBonus = 6;
			break;
		}
	}

	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public boolean isShortRest() {
		return shortRest;
	}

	public void setShortRest(boolean shortRest) {
		this.shortRest = shortRest;
	}

	public boolean isLongRest() {
		return longRest;
	}

	public void setLongRest(boolean longRest) {
		this.longRest = longRest;
	}

	public BaseSkills getBaseSkills() {
		return baseSkills;
	}

	public void setBaseSkills(BaseSkills baseSkills) {
		this.baseSkills = baseSkills;
	}

	public ExtendedSkills getExtendedSkills() {
		return extendedSkills;
	}

	public void setExtendedSkills(ExtendedSkills extendedSkills) {
		this.extendedSkills = extendedSkills;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCampaign() {
		return Campaign;
	}

	public void setCampaign(String campaign) {
		Campaign = campaign;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Barbarian getBarbarianClass() {
		return barbarianClass;
	}

	public void setBarbarianClass(Barbarian barbarianClass) {
		this.barbarianClass = barbarianClass;
	}

	public Bard getBardClass() {
		return bardClass;
	}

	public void setBardClass(Bard bardClass) {
		this.bardClass = bardClass;
	}




	
	
}
