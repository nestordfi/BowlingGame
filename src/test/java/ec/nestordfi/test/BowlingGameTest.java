package ec.nestordfi.test;

import java.util.Iterator;

import org.junit.Test;

import ec.nestordfi.controller.BowlingGame;

public class BowlingGameTest {
	
	@Test
	public void testGutterGame() {
		BowlingGame bowlingGame = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			bowlingGame.roll();
		}
	}

}
