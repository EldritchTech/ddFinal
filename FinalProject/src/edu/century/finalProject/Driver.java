package edu.century.finalProject;

public class Driver implements Constants{
	public static void main(String [] args) {
		//Test damage
		Damage test = new Damage(4, d8, "Necrotic");
		System.out.println(test.toString());
		
		//Test proficiency
		Skill Charisma = new Skill(15);
		Proficiency test1 = new Proficiency(Charisma);
		System.out.println(Charisma.isProf());
		
		//Test Armor proficiency
		Armor Light = new Armor(15, false, "Light");
		Proficiency test2 = new Proficiency(Light);
		System.out.println(Light.isProf());
		
		//Test Skill toString
		System.out.println(Charisma.toString());
		
	}
}
