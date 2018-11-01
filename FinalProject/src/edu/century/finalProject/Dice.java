package edu.century.finalProject;
import java.util.Random;

public class Dice {
	private int sides;
	
	public Dice(int sides) {
		this.sides = sides;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		Random dN = new Random();
		int diceRoll = dN.nextInt(sides) + 1;
		return diceRoll;
	}

	@Override
	public String toString() {
		return "Dice [sides=" + sides + "]";
	}
	
	
	
}
