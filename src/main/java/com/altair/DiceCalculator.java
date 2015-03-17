package com.altair;

public class DiceCalculator {

	/**
	 * This method calculates the total score as per the given rules
	 * @param diceOutcome
	 * @return totalScore
	 */
	public int calculateScore(final int[] diceOutcome){
		int totalScore = 0;
		final int[] digitCount = this.findDigitCount(diceOutcome);
		final int[] ruleAllFourSameDigit = {820, 200, 300, 400, 500, 1030}; 
		final int[] ruleThreeSameDigit = {800, 200, 300, 400, 500, 1000};
		final int singleOneScore = 20;
		final int singleSixScore = 30;
		
		for(int i = 0; i < digitCount.length; i++){
			
			if(digitCount[i] == 0 || digitCount[i] == 2){
				continue;
			}
			
			if(digitCount[i] == 1){
				
				if(i == 0){
					totalScore = totalScore + singleOneScore;
				} else if(i == 5){
					totalScore = totalScore + singleSixScore;
				}
				continue;
			} 

			if(digitCount[i] == 4){
				totalScore = ruleAllFourSameDigit[i];
				break;
			}
			
			if(digitCount[i] == 3){
				totalScore = ruleThreeSameDigit[i];
				
				if(digitCount[0] == 1){
					totalScore = totalScore + singleOneScore;
				} else if(digitCount[5] == 1){
					totalScore = totalScore + singleSixScore;
				} 
				break;
			}
		}
		return totalScore;
	}
	
	/**
	 * This method finds the count of each digit which might be result of a single dice roll 
	 * @param diceOutcome
	 * @return array containing the count of each digit(1-6) 
	 */
	public int[] findDigitCount(final int[] diceOutcome){
		int[] digitCount = new int[6];
		
		for(int i : diceOutcome){
			
			digitCount[i - 1] = digitCount[i - 1] + 1;
		}
		return digitCount;
	}
}
