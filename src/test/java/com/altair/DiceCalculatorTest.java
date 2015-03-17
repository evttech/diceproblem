package com.altair;

import junit.framework.Assert;

import org.junit.Test;

public class DiceCalculatorTest {

	@Test
	public void testCalculateScoreCase1() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1,1,1,1};
		Assert.assertEquals(820, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase2() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1, 1, 1, 2};
		Assert.assertEquals(800, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase3() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {4, 4, 4, 4};
		Assert.assertEquals(400, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase4() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {6, 6, 6, 6};
		Assert.assertEquals(1030, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase5() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {2, 1, 2, 2};
		Assert.assertEquals(220, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase6() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {3, 6, 3, 3};
		Assert.assertEquals(330, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase7() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {5, 6, 5, 5};
		Assert.assertEquals(530, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase8() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {6, 1, 6, 6};
		Assert.assertEquals(1020, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase9() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {2, 3, 4, 5};
		Assert.assertEquals(0, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase10() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {2, 3, 4, 6};
		Assert.assertEquals(30, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase11() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {2, 3, 4, 1};
		Assert.assertEquals(20, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testCalculateScoreCase12() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {2, 2, 1, 1};
		Assert.assertEquals(0, diceCalculator.calculateScore(diceOutcome));
	}
	
	@Test
	public void testCalculateScoreCase13() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1, 1, 1, 6};
		Assert.assertEquals(830, diceCalculator.calculateScore(diceOutcome));
	}
	
	@Test
	public void testCalculateScoreCase14() {
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1, 1, 1, 2};
		Assert.assertEquals(800, diceCalculator.calculateScore(diceOutcome));
	}

	@Test
	public void testFindDigitCountCase1(){
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1,1,1,1};
		int[] digitCount = diceCalculator.findDigitCount(diceOutcome);
		Assert.assertEquals(4, digitCount[0]);
	}

	@Test
	public void testFindDigitCountCase2(){
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1,2,3,4};
		int[] digitCount = diceCalculator.findDigitCount(diceOutcome);
		Assert.assertEquals(1, digitCount[0]);
		Assert.assertEquals(1, digitCount[1]);
		Assert.assertEquals(1, digitCount[2]);
		Assert.assertEquals(1, digitCount[3]);
	}

	@Test
	public void testFindDigitCountCase3(){
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1,2,5,6};
		int[] digitCount = diceCalculator.findDigitCount(diceOutcome);
		Assert.assertEquals(1, digitCount[0]);
		Assert.assertEquals(1, digitCount[1]);
		Assert.assertEquals(1, digitCount[4]);
		Assert.assertEquals(1, digitCount[5]);
	}

	@Test
	public void testFindDigitCountCase4(){
		DiceCalculator diceCalculator = new DiceCalculator();
		int[] diceOutcome = {1,2,1,3};
		int[] digitCount = diceCalculator.findDigitCount(diceOutcome);
		Assert.assertEquals(2, digitCount[0]);
		Assert.assertEquals(1, digitCount[1]);
		Assert.assertEquals(1, digitCount[2]);
	}

}
