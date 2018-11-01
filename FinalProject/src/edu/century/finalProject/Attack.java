package edu.century.finalProject;

public class Attack implements Constants{
	int attackBonus;
	Damage damage;
	String damageType;
	int diceNum;
	Dice dice;
	
	public Attack() {
		attackBonus = 0;
		damageType = "Slashing";
		diceNum = 1;
		dice = d8;
		damage = new Damage(diceNum, dice, damageType);		
	}
}
