package edu.century.finalProject;

public class Driver implements Constants{
	public static void main(String [] args) {
		Damage test = new Damage(4, d8, "Necrotic");
		System.out.println(test.toString());
		
		Skill Charisma = new Skill(15);
		Proficency test1 = new Proficency(Charisma);
		System.out.println(Charisma.isProf());
		
	}
}
