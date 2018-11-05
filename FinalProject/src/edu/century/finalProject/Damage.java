package edu.century.finalProject;

import java.util.Arrays;

public class Damage {
	private int diceNumber;
	private Dice dN;
	private String dmgType;
	private boolean isDmg;
	private Dice [] dmgDice;
	private int [] dmg;
	private int damageTotal = 0;
	private int roll;
	
	public Damage(int diceNumber, Dice dN, String dmgType) {
		this.diceNumber = diceNumber;
		this.dN = dN;
		this.dmgType = dmgType;
		Dice [] dice = new Dice[diceNumber];
		this.dmg = new int[diceNumber];
		for(int i = 0; i < diceNumber; i++) {
			dice[i] = dN;
		}
		dmgDice = dice;
		findIsDmg();
		dmgRoll();
	}
	
	public void findIsDmg() {
		if(this.dmgType == "Healing") {
			isDmg = false;
		} else {
			isDmg = true;
		}
	}
	
	public void dmgRoll() {
		for(int i = 0; i < diceNumber; i++) {
			roll = dN.roll();
			damageTotal += roll;
			dmg[i] = roll;
		}
	}

	@Override
	public String toString() {
		String dmg = "" + diceNumber + "" + dN + ": \n" + 
				Arrays.toString(this.dmg) + "\n" +
				"Total: " + damageTotal + " " + dmgType + "\n";
		return dmg;
	}
	
	
	
}
