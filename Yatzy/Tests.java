package foobar.spam.org.game;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {

	
	@Test
	public void chance_test() {
		
		assertEquals(15, Yatzy.chance(1,2,3,4,5));
		assertEquals(15, Yatzy.chance(3,2,3,2,5));
		assertEquals(16, Yatzy.chance(1,6,3,1,5));
	}
	
	@Test
	public void yatzy_test() {
		
		assertEquals(50, Yatzy.yatzy(1,1,1,1,1));
		assertEquals(50, Yatzy.yatzy(2,2,2,2,2));
		assertEquals(0, Yatzy.yatzy(1,1,3,1,5));
	}
	
	@Test
	public void ones_test() {
		
		assertEquals(4, Yatzy.ones(1,6,1,1,1));
		assertEquals(0, Yatzy.ones(3,2,3,2,5));
		assertEquals(3, Yatzy.ones(1,1,3,1,5));
	}
	
	@Test
	public void twos_test() {
		
		assertEquals(0, Yatzy.twos(1,1,6,1,1));
		assertEquals(4, Yatzy.twos(3,2,3,2,5));
		assertEquals(10, Yatzy.twos(2,2,2,2,2));
	}
	
	@Test
	public void threes_test() {
		
		assertEquals(0, Yatzy.threes(1,2,1,5,1));
		assertEquals(6, Yatzy.threes(3,2,3,2,5));
		assertEquals(15, Yatzy.threes(3,3,3,3,3));
	}
	
	@Test
	public void fours_test() {
		
		assertEquals(4, Yatzy.fours(4,1,1,1,1));
		assertEquals(0, Yatzy.fours(3,2,3,2,5));
		assertEquals(20, Yatzy.fours(4,4,4,4,4));
	}
	
	@Test
	public void fives_test() {
		
		assertEquals(0, Yatzy.fives(1,1,1,1,1));
		assertEquals(5, Yatzy.fives(3,2,3,2,5));
		assertEquals(25, Yatzy.fives(5,5,5,5,5));
	}
	
	@Test
	public void sixes_test() {
		
		assertEquals(6, Yatzy.sixes(6,1,1,1,1));
		assertEquals(0, Yatzy.sixes(3,2,3,2,5));
		assertEquals(30, Yatzy.sixes(6,6,6,6,6));
	}
	
	@Test
	public void pair_test() {
		
		assertEquals(2, Yatzy.pair(6,1,1,1,1));
		assertEquals(6, Yatzy.pair(3,2,3,2,5));
		assertEquals(12, Yatzy.pair(6,6,6,6,6));
	}
	
	@Test
	public void double_pair_test() {
		
		assertEquals(4, Yatzy.double_pair(6,1,1,1,1));
		assertEquals(10, Yatzy.double_pair(3,2,3,2,5));
		assertEquals(24, Yatzy.double_pair(6,6,6,6,6));
	}
	
	@Test
	public void three_of_a_kind_test() {
		
		assertEquals(3, Yatzy.three_of_a_kind(6,1,1,1,2));
		assertEquals(9, Yatzy.three_of_a_kind(3,3,3,2,5));
		assertEquals(0, Yatzy.three_of_a_kind(2,3,1,4,6));
		
	}
	
	@Test
	public void four_of_a_kind_test() {
		
		assertEquals(4, Yatzy.four_of_a_kind(6,1,1,1,1));
		assertEquals(12, Yatzy.four_of_a_kind(3,3,3,2,3));
		assertEquals(0, Yatzy.four_of_a_kind(2,3,1,4,6));

	}
	
	@Test
	public void small_straight_test() {
		
		assertEquals(15, Yatzy.small_straight(1,2,3,4,5));
		assertEquals(0, Yatzy.small_straight(2,3,4,5,6));

	}
	
	@Test
	public void large_straight_test() {
		
		assertEquals(0, Yatzy.large_straight(1,2,3,4,5));
		assertEquals(20, Yatzy.large_straight(2,3,4,5,6));

	}
	
	@Test
	public void full_house_test() {
		
		assertEquals(8, Yatzy.full_house(1,1,2,2,2));
		assertEquals(0, Yatzy.full_house(2,3,4,5,6));

	}
	
	
}
