package edu.century.finalProject;

import java.util.Arrays;

public class Damage {
	private int diceNumber;
	private Dice dN;
	private String dmgType;
	private boolean isDmg;
	private Dice [] dmgDice;
	private int damageTotal = 0;
	
	public Damage(int diceNumber, Dice dN, String dmgType) {
		this.diceNumber = diceNumber;
		this.dN = dN;
		this.dmgType = dmgType;
		Dice [] dice = new Dice[diceNumber];
		for(int i = 0; i < diceNumber; i++) {
			dice[i] = dN;
		}
		dmgDice = dice;
		findIsDmg();
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
			damageTotal += dmgDice[i].roll();
		}
	}

	@Override
	public String toString() {
		return "Damage [diceNumber=" + diceNumber + ", dN=" + dN + ", dmgType=" + dmgType + ", isDmg=" + isDmg
				+ ", dmgDice=" + Arrays.toString(dmgDice) +  ", Damage=" +  damageTotal + "]";
	}
	
	
}
