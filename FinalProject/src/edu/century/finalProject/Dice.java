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
		return "d" + sides;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sides;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dice other = (Dice) obj;
		if (sides != other.sides)
			return false;
		return true;
	}
	
	
	
}
