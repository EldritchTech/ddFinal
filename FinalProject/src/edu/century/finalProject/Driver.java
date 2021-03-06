package edu.century.finalProject;

public class Driver implements Constants, PHB{
	public static void main(String [] args) {
		//Test damage
		Damage test = new Damage(4, d8, 8, "Necrotic");
		test.dmgRoll();
		System.out.println(test.toString());
		
		//Test proficiency
		Skill Charisma = new Skill(15);
		Proficiency test1 = new Proficiency(Charisma, 2);
		System.out.println(Charisma.isProf());
		
		//Test Armor proficiency
		Armor Light = new Armor(15, false, "Light");
		Proficiency test2 = new Proficiency(Light, 5);
		System.out.println(Light.isProf());
		
		//Test Skill toString
		System.out.println("\nCharisma: \n" + Charisma.toString());
		
		//Test BaseSkills
		int [] skills = {12, 15, 8, 17, 13, 11};
		BaseSkills test3 = new BaseSkills(skills);
		System.out.println(test3.toString());
		
		//Test Weapon
		boolean [] daggerProperties = {false, true, true, false, true, false, false};
		int [] daggerRange = {20, 60};
		Weapon Dagger = new Weapon("Dagger", daggerRange, daggerProperties, 0, new Attack());
		System.out.println(Dagger.toString());
		
		//Test Extended Skills
		ExtendedSkills test4 = new ExtendedSkills(test3);
		System.out.println(test4.toString());
		
		//Test Character
		Character newCharacter = new Character();
		System.out.println(Bard.toString());
		Bard.levelUp();
		System.out.println(Bard.toString());

		
	}
}
