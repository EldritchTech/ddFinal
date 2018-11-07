package edu.century.finalProject;

import java.util.Arrays;

public class Damage {
	private int diceNumber;
	private Dice dN;
	private String dmgType;
	private boolean isDmg;
	private Dice [] dmgDice;
	private int [] dmg;
	private int additionalDmg;
	private int damageTotal = 0;
	private int roll;
	
	//Constructor
	public Damage(int diceNumber, Dice dN, int addDmg, String dmgType) {
		this.diceNumber = diceNumber;
		this.dN = dN;
		this.dmgType = dmgType;
		this.additionalDmg = addDmg;
		Dice [] dice = new Dice[diceNumber];
		this.dmg = new int[diceNumber];
		for(int i = 0; i < diceNumber; i++) {
			dice[i] = dN;
		}
		dmgDice = dice;
		findIsDmg();
	}
	
	//Getters + Setters
	
	public int getDiceNumber() {
		return diceNumber;
	}

	public void setDiceNumber(int diceNumber) {
		this.diceNumber = diceNumber;
	}

	public Dice getdN() {
		return dN;
	}

	public void setdN(Dice dN) {
		this.dN = dN;
	}

	public String getDmgType() {
		return dmgType;
	}

	public void setDmgType(String dmgType) {
		this.dmgType = dmgType;
	}

	public boolean isDmg() {
		return isDmg;
	}

	public void setDmg(boolean isDmg) {
		this.isDmg = isDmg;
	}

	public Dice[] getDmgDice() {
		return dmgDice;
	}

	public void setDmgDice(Dice[] dmgDice) {
		this.dmgDice = dmgDice;
	}

	public int[] getDmg() {
		return dmg;
	}

	public void setDmg(int[] dmg) {
		this.dmg = dmg;
	}

	public int getDamageTotal() {
		return damageTotal;
	}

	public void setDamageTotal(int damageTotal) {
		this.damageTotal = damageTotal;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	/* findIsDmg Method
	 * Determines whether instance is damage or healing
	 */

	public void findIsDmg() {
		if(this.dmgType == "Healing") {
			isDmg = false;
		} else {
			isDmg = true;
		}
	}
	
	/* dmgRoll
	 * Rolls each dice, adds rolled dice to total and dmg array
	 */
	public void dmgRoll() {
		for(int i = 0; i < diceNumber; i++) {
			roll = dN.roll();
			damageTotal += roll;
			dmg[i] = roll;
		}
		damageTotal += additionalDmg;
	}
	
	//If additional Damage, returns string to add for toString method
	
	public String getAddString() {
		if(this.additionalDmg == 0) {
			return "";
		} else {
			return "+" + additionalDmg;
		}
	}
	
	//ToString method

	@Override
	public String toString() {
		String dmg = "" + diceNumber + "" + dN + getAddString() + ": \n" + 
				Arrays.toString(this.dmg) + "\n" +
				"Total: " + damageTotal + " " + dmgType + "\n";
		return dmg;
	}
	
	
	
}
