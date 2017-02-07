package foobar.spam.org.game;

import java.util.*;


public class Yatzy {

	protected int[] dice = new int[5];
	
	public Yatzy(int d1, int d2, int d3, int d4, int d5) {
		this.dice = new int[] {d1, d2, d3, d4, d5};
	}
	
	
	public static int chance(int... dice) {
		
		int total_points = 0;
		for (int i = 0; i < dice.length; i++) {
			total_points += dice[i];
		}
		return total_points;
	}
	
	public static int yatzy(int... dice) {

		for (int die : dice) {
			if (die != dice[0]) {
				return 0;
			}
		}
		return 50;
	}
	
	public static int ones(int... dice){
		
		int total_points = 0;
		final int value_ones = 1;
		
		for (int die:dice) {
			if (die == value_ones) {
				total_points += value_ones;
			}
		}
		return total_points;
	}
	
	public static int twos(int... dice){
		
		int total_points = 0;
		final int value_twos = 2;
		
		for (int die:dice) {
			if (die == value_twos) {
				total_points += value_twos;
			}
		}
		return total_points;
	}
	
	public static int threes(int... dice){
		
		int total_points = 0;
		final int value_threes = 3;
		
		for (int die:dice) {
			if (die == value_threes) {
				total_points += value_threes;
			}
		}
		return total_points;
	}
	
	public static int fours(int... dice){
		
		int total_points = 0;
		final int value_fours = 4;
		
		for (int die:dice) {
			if (die == value_fours) {
				total_points += value_fours;
			}
		}
		return total_points;
	}
	
	public static int fives(int... dice){
		
		int total_points = 0;
		final int value_fives = 5;
		
		for (int die:dice) {
			if (die == value_fives) {
				total_points += value_fives;
			}
		}
		return total_points;
	}
	
	public static int sixes(int... dice){
		
		int total_points = 0;
		final int value_sixes = 6;
		
		for (int die:dice) 
			if (die == value_sixes) 
				total_points += value_sixes;
			
		
		return total_points;
	}
	
	public static int pair(int...dice){
		int score = 0;
		Arrays.sort(dice);
		for (int i = 4; i > 0; i--){
			if (dice[i] == dice[i-1]){
				return score = dice[i]*2;
			}
		}
		return score;
	}
	
	public static int double_pair(int...dice){
		int score = 0;
		int pairsFound = 0;
		Arrays.sort(dice);
		for (int i = 4; i > 0; i--){
			if(dice[i] == dice[i-1]){
				score += dice[i] * 2;
				pairsFound += 1;
				i -= 1;
			}
			if(pairsFound == 2){
				return score;
			}
		}
		return 0;
	}
	
	public static int three_of_a_kind(int... dice) {
		
		int score = 0;
		Arrays.sort(dice);
		
		for (int i = 4; i>1; i--){
			
			if ((dice[i] == dice[i-2])){
				return score = dice[i] * 3;
			}
		}		
		return score;
	}
	
	public static int four_of_a_kind(int... dice) {
		
		int score = 0;
		Arrays.sort(dice);
		
		for (int i = 4; i>2; i--){
			
			if ((dice[i] == dice[i-3])){
				return score = dice[i] * 4;
			}
		}		
		return score;
	}
	
	public static int small_straight(int...dice){
		int score = 15;
		Arrays.sort(dice);
		if (dice[0] != 1){
			return 0;
		}
		for (int i = 0; i < dice.length - 1; i++){
			if (dice[i+1] != (dice[i] + 1)){
				return 0;
			}
		}
		return score;
	}
	
	public static int large_straight(int...dice){
		int score = 20;
		Arrays.sort(dice);
		if (dice[0] == 1){
			return 0;
		}
		for (int i = 0; i < dice.length - 1; i++){
			if (dice[i+1] != (dice[i] + 1)){
				return 0;
			}
		}
		return score;
	}
		
	
	public static int full_house(int...dice){
		int score = 0;
		int pairFound = 0;
		int threeFound = 0;
		Arrays.sort(dice);
		ArrayList<Integer> dices = new ArrayList<Integer>();
		
		for (int i = 0; i< dice.length; i++){
			dices.add(dice[i]);
		}
		
		Collection<Integer> d = dices;
		
		for (Integer die : dices){
			
			int freq = Collections.frequency(d, die);
			
			if (freq == 3 && threeFound != 1){
				score += die * freq;
				threeFound +=1;
				
			} else if (freq == 2 && pairFound != 1){
				score += die * freq;
				pairFound += 1;
			}
		}
		
		if (pairFound == 1 && threeFound == 1){
			return score;
		}
		return 0;
	}

}

	
