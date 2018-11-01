package edu.century.finalProject;

public class Feature {
	private String name;
	private String description;
	private int uses;
	private int lvl;
	private boolean lrReset;
	private boolean srReset;
	
	public Feature() {
		this.name = "";
		this.description = "";
		this.uses = 1;
		this.lrReset = true;
		this.srReset = false;
	}
	
	public Feature(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Feature(String name, String description, int uses, boolean sr, boolean lr, int lvl) {
		this.name = name;
		this.description = description;
		this.uses = uses;
		this.srReset = sr;
		this.lrReset = lr;
		this.lvl = lvl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
