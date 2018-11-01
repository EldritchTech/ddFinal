package edu.century.finalProject;

public class Spell {
	private String name;
	private int level;
	private boolean verbal;
	private boolean somatic;
	private boolean material;
	private String components;
	private String castingTime;
	private String duration;
	private int range;
	private String description;
	
	private boolean bardSpell;
	private boolean clericSpell;
	private boolean druidSpell;
	private boolean paladinSpell;
	private boolean rangerSpell;
	private boolean sorcererSpell;
	private boolean warlockSpell;
	private boolean wizardSpell;
	
	public Spell(String name, boolean verbal, boolean somatic, boolean material, String components, String castingTime,
			String duration, int range, String description) {
		this.name = name;
		this.verbal = verbal;
		this.somatic = somatic;
		this.material = material;
		this.components = components;
		this.castingTime = castingTime;
		this.duration = duration;
		this.range = range;
		this.description = description;
	}
	
	public Spell() {
		this.name = null;
		this.verbal = false;
		this.somatic = false;
		this.material = false;
		this.components = "";
		this.castingTime = "";
		this.duration = "";
		this.range = 0;
		this.description = "";
	}

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

	public boolean isVerbal() {
		return verbal;
	}

	public void setVerbal(boolean verbal) {
		this.verbal = verbal;
	}

	public boolean isSomatic() {
		return somatic;
	}

	public void setSomatic(boolean somatic) {
		this.somatic = somatic;
	}

	public boolean isMaterial() {
		return material;
	}

	public void setMaterial(boolean material) {
		this.material = material;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getCastingTime() {
		return castingTime;
	}

	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setBard() {
		bardSpell = true;
	}
	
	public void setCleric() {
		clericSpell = true;
	}
	
	public void setDruid() {
		druidSpell = true;
	}
	
	public void setPaladin() {
		paladinSpell = true;
	}
	
	public void setRanger() {
		rangerSpell = true;
	}
	
	public void setSorcerer() {
		sorcererSpell = true;
	}
	
	public void setWarlock() {
		warlockSpell = true;
	}
	
	public void setWizard() {
		wizardSpell = true;
	}
}
