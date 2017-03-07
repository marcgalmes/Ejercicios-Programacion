package org.foobarspam.bowling.test;

import static org.junit.Assert.*;

import org.foobarspam.bowling.game.ScoreCard;
import org.junit.Test;

/* http://junit.sourceforge.net/javadoc/org/junit/package-summary.html */

public class ScoreCardTest {
	
	private void calculateScore(ScoreCard scoreCard){
		
		for(int i=0; i < scoreCard.getScoreCard().length(); i++){
			char pin = scoreCard.getScoreCard().charAt(i);
			scoreCard.roll(pin);
		}		
	}

	@Test
	public void getSymbolValueTest(){
		
		String symbols = "-123456789X/";	
		
		for(int index=0; index<symbols.length(); index++){
			assertEquals(index , ScoreCard.getSymbolValue(symbols.charAt(index)));			
		}		
	}
	
	@Test
	public void TotalScoreHittingPinsTest(){
		
		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;
		
		ScoreCard scoreCard = new ScoreCard(pins);
		
		calculateScore(scoreCard);
		
		assertEquals(total, scoreCard.getTotalScore());			
	}
	
	@Test
	public void TotalScoreHittingPinsFailTest(){
		
		// test symbol -
		
		String pins = "9-9-9-9-9-9-9-9-9-9-";
		int total = 90;		
		ScoreCard scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		pins = "9-3561368153258-7181";         
		total = 82;
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
	}
	
	@Test
	public void TotalScoreSpareTest(){
		/* 	
		 * If in two tries he knocks them all down, this is called
		 * a �spare� and his score for the frame is ten plus the
		 * number of pins knocked down on his next throw (in
		 * his next turn).
		 * If he gets a spare or strike in the last (tenth) frame,
		 * the bowler gets to throw one or two more bonus balls,
		 * respectively. - These bonus throws are taken as part of
		 * the same turn. If the bonus throws knock down all the
		 * pins, the process does not repeat: the bonus throws are
		 * only used to calculate the score of the final frame.
		 */

		String pins = "5/5/5/5/5/5/5/5/5/5/5";
		int total = 150;		
		ScoreCard scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());	
		
		pins = "9-3/613/815/-/8-7/8/8";    
		total = 131;
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
	}
	
	@Test
	public void TotalScoreStrikeTest(){
		/* If on his first try in the frame he knocks down all the
		 * pins, this is called a �strike�. His turn is over, and his
		 * score for the frame is ten plus the simple total of the
		 * pins knocked down in his next two rolls.
		 * If he gets a spare or strike in the last (tenth) frame,
		 * the bowler gets to throw one or two more bonus balls,
		 * respectively. - These bonus throws are taken as part of
		 * the same turn. If the bonus throws knock down all the
		 * pins, the process does not repeat: the bonus throws are
		 * only used to calculate the score of the final frame.
		 */
		
		String pins = "X9-9-9-9-9-9-9-9-9-";
		int total = 100;		
		ScoreCard scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		// two extra final rolls
		pins = "9-9-9-9-9-9-9-9-9-X9-";
		total = 100;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		pins = "X9-X9-9-9-9-9-9-9-";
		total = 110;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		// two strikes in a row is a double
		pins = "XX9-9-9-9-9-9-9-9-";
		total = 120;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		// three strikes in a row is a triple
		pins = "XXX9-9-9-9-9-9-9-";
		total = 141;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		// two strikes in extra rolls
		pins = "9-9-9-9-9-9-9-9-9-XXX";
		total = 111;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());
		
		// 12 strikes is a �Thanksgiving Turkey�.
		pins = "XXXXXXXXXXXX";
		total = 300;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());	
		
		// spare in extra roll
		pins = "8/549-XX5/53639/91X";
		total = 149;		
		scoreCard = new ScoreCard(pins);		
		calculateScore(scoreCard);		
		assertEquals(total, scoreCard.getTotalScore());	
	}
}
