package edu.century.finalProject;

public class Race {
	private String raceName;
	private String subrace;
	private int [] racialBonus;
	private int [] subraceBonus;
	private String [] resistances;
	private String [] racialLanguages;
	private int speed;
	private int darkVision;
	private Feature [] racialFeatures;
	private Feature [] subraceFeatures;
	private Proficiency [] racialProficencies;
	private Proficiency [] subracialProficiencies;
	
	public Race(String raceName, String subrace, int [] racialBonus, int [] subraceBonus, String [] resistances, 
			String [] racialLanguages, int speed, int darkVision, Feature [] racialFeatures, Feature [] subraceFeatures,
			Proficiency [] racialProficencies, Proficiency [] subracialProficencies) {
		this.raceName = raceName;
		this.subrace = subrace;
		this.racialBonus = racialBonus;
		this.subraceBonus = subraceBonus;
		this.resistances = resistances;
		this.racialLanguages = racialLanguages;
		this.speed = speed;
		this.darkVision = darkVision;
		this.racialFeatures = racialFeatures;
		this.subraceFeatures = subraceFeatures;
		this.racialProficencies = racialProficencies;
		this.subracialProficiencies = subracialProficencies;
	}
	
	public Race() {
		this.raceName = "";
		this.subrace = "";
		this.racialBonus = null;
		this.subraceBonus = null;
		this.resistances = null;
		this.racialLanguages = null;
		this.speed = 0;
		this.darkVision = 0;
		this.racialFeatures = null;
	}
	
	
	public String getRaceName() {
		return raceName;
	}
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	public String getSubrace() {
		return subrace;
	}
	public void setSubrace(String subrace) {
		this.subrace = subrace;
	}
	public int[] getRacialBonus() {
		return racialBonus;
	}
	public void setRacialBonus(int[] racialBonus) {
		this.racialBonus = racialBonus;
	}
	public int[] getSubraceBonus() {
		return subraceBonus;
	}
	public void setSubraceBonus(int[] subraceBonus) {
		this.subraceBonus = subraceBonus;
	}
	public String[] getResistances() {
		return resistances;
	}
	public void setResistances(String[] resistances) {
		this.resistances = resistances;
	}
	public String[] getRacialLanguages() {
		return racialLanguages;
	}
	public void setRacialLanguages(String[] racialLanguages) {
		this.racialLanguages = racialLanguages;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDarkVision() {
		return darkVision;
	}
	public void setDarkVision(int darkVision) {
		this.darkVision = darkVision;
	}
	public Feature[] getRacialFeatures() {
		return racialFeatures;
	}
	public void setRacialFeatures(Feature[] racialFeatures) {
		this.racialFeatures = racialFeatures;
	}

	public Feature[] getSubraceFeatures() {
		return subraceFeatures;
	}

	public void setSubraceFeatures(Feature[] subraceFeatures) {
		this.subraceFeatures = subraceFeatures;
	}

	public Proficiency[] getRacialProficencies() {
		return racialProficencies;
	}

	public void setRacialProficencies(Proficiency[] racialProficencies) {
		this.racialProficencies = racialProficencies;
	}

	public Proficiency[] getSubracialProficiencies() {
		return subracialProficiencies;
	}

	public void setSubracialProficiencies(Proficiency[] subracialProficiencies) {
		this.subracialProficiencies = subracialProficiencies;
	}
	
	
	
	
}
