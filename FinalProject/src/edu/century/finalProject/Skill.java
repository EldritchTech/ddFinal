package edu.century.finalProject;

public class Skill {
	private int Score;
	private int Bonus;
	private boolean isProf;
	
	//Base Constructor
	public Skill() {
		this.Score = 8;
		bonus();
		isProf = false;
	}
	
	/* Constructor
	 * Param: Int score (must be over 3 and less than 20)
	 */
	public Skill(int score) {
		if(score >= 3 && score <= 20) {
			this.Score = score;
			isProf = false;
			bonus();
		} else {
			System.out.println("Score cannot be below 3 or over 20");
		}
	}

	//Getters + Setters
	
	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public int getBonus() {
		return Bonus;
	}

	public void setBonus(int bonus) {
		Bonus = bonus;
	}

	public boolean isProf() {
		return isProf;
	}

	public void setProf(boolean isProf) {
		this.isProf = isProf;
	}
	
	public void addPoints(int bonus) {
		Score += bonus;
		bonus();
	}
	
	//Set bonus (from PHB)
	public void bonus() {
		switch (Score) {
		case 3:
			Bonus = -4;
			break;
		case 4:
			Bonus = -3;
			break;
		case 5:
			Bonus = -3;
			break;
		case 6:
			Bonus = -2;
			break;
		case 7:
			Bonus = -2;
			break;
		case 8:
			Bonus = -1;
			break;
		case 9:
			Bonus = -1;
			break;
		case 10:
			Bonus = 0;
			break;
		case 11:
			Bonus = 0;
			break;
		case 12:
			Bonus = 1;
			break;
		case 13:
			Bonus = 1;
			break;
		case 14:
			Bonus = 2;
			break;
		case 15:
			Bonus = 2;
			break;
		case 16: 
			Bonus = 3;
			break;
		case 17:
			Bonus = 3;
			break;
		case 18:
			Bonus = 4;
			break;
		case 19:
			Bonus = 4;
			break;
		case 20:
			Bonus = 5;
			break;
		}
	}
	
	//toString
	@Override
	public String toString() {
		String skill = "Score: " + Score + "\n" + "Bonus: " + Bonus + "\n" + "Proficient? " + isProf + "\n";
		return skill;
	}
}
