package edu.century.finalProject;

public class Attack implements Constants{
	int attackBonus;
	Damage damage;
	
	//No args constructor
	public Attack() {
		attackBonus = 0;
		damage = new Damage(1, d4, 0, "Piercing");		
	}
	
	//Constructor
	public Attack(int bonus, Damage dmg) {
		this.attackBonus = bonus;
		this.damage = dmg;
	}

	//Getters + Setters
	public int getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(int attackBonus) {
		this.attackBonus = attackBonus;
	}

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage damage) {
		this.damage = damage;
	}
	
	//To String
	@Override
	public String toString() {
		String att = "Attack Bonus: " + attackBonus + "\n" + damage.getDiceNumber() + damage.getdN();
		return att;
	}
	
	
}
