import junit.framework.Assert;

import org.junit.Assert.*;
import org.junit.Test;

public class BruchTest {

	@Test
	public void testAddiere() {

		Assert.assertEquals(new Bruch(-5),
				new Bruch(-2, 8, 3).addiere(new Bruch(1, 1, 3)));
		Assert.assertEquals(new Bruch(-1, 30),
				new Bruch(-1, 6).addiere(new Bruch(2, 15)));
		// echte + echte
		Assert.assertEquals(new Bruch(3, 10),
				new Bruch(1, 6).addiere(new Bruch(2, 15)));
		// echte + echte, mit gleichem Nenner
		Assert.assertEquals(new Bruch(2, 5),
				new Bruch(1, 5).addiere(new Bruch(1, 5)));
		//
		Assert.assertEquals(new Bruch(4, 5),
				new Bruch(2, 10).addiere(new Bruch(3, 5)));
		// echte + ganzeZahl und echte
		Assert.assertEquals(new Bruch(5, 6),
				new Bruch(1, 6).addiere(new Bruch(1, 2, 3)));
		// echte + unechte
		Assert.assertEquals(new Bruch(2, 2, 3),
				new Bruch(1, 3).addiere(new Bruch(7, 3)));
		// ganzeZahl echte + ganzeZahl echte (selbe bruch)
		Assert.assertEquals(new Bruch(1, 1, 3),
				new Bruch(1, 2, 3).addiere(new Bruch(1, 2, 3)));
		// ganzeZahl echte + ganzeZahl echte (verschiedene brüche)
		Assert.assertEquals(new Bruch(3, 2, 3),
				new Bruch(7, 3).addiere(new Bruch(8, 6)));
		// ganzeZahl unechter + echte (verschiedene nenner)
		Assert.assertEquals(new Bruch(5, 1, 2),
				new Bruch(1, 6).addiere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + echte (gleiche nenner)
		Assert.assertEquals(new Bruch(5, 2, 3),
				new Bruch(1, 3).addiere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + unecht
		Assert.assertEquals(new Bruch(7, 2, 3),
				new Bruch(7, 3).addiere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl echte
		Assert.assertEquals(new Bruch(6),
				new Bruch(1, 2, 3).addiere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl unechter (gleicher Bruch)
		Assert.assertEquals(new Bruch(10, 2, 3),
				new Bruch(2, 8, 3).addiere(new Bruch(2, 8, 3)));
	}

	@Test
	public void testGetDezimalzahl() {

		// Dezimalzahl mit echtem Bruch
		Assert.assertEquals(0.33, new Bruch(1, 3).getDezimalzahl());
		// Dezimalzahl mit ganzer Zahl und echtem Bruch
		Assert.assertEquals(0.33, new Bruch(1, 1, 3).getDezimalzahl());
		// Dezimalzahl mit unechtem Bruch
		Assert.assertEquals(2.33, new Bruch(7, 3).getDezimalzahl());
		// Dezimalzahl mit ganzer Zahl und unechtem Bruch
		Assert.assertEquals(5.33, new Bruch(2, 8, 3).getDezimalzahl());
		// Dezimalzahl mit normalem negativen Bruch
		Assert.assertEquals(-0.17, new Bruch(-1, 6).getDezimalzahl());
		// Dezimalzahl mit negativer ganzer Zahl und unechtem Bruch
		Assert.assertEquals(-5.33, new Bruch(-2, 8, 3).getDezimalzahl());
		// Dezimalzahl mit negativer ganzen Zahl und echtem Bruch
		Assert.assertEquals(-1.33, new Bruch(-2, 2, 3).getDezimalzahl());

	}

	@Test
	public void testUnechterBruch() {

		// echte Bruch mit ganzer Zahl in unechten umwandeln
		Assert.assertEquals(new Bruch(1, 3), new Bruch(1, 1, 3).unechterBruch());
		// echte Bruch mit ganzer negativen Zahl in unechten umwandeln
		Assert.assertEquals(new Bruch(-16, 3),
				new Bruch(-2, 8, 3).unechterBruch());
	}

	@Test
	public void testEchterBruch() {

		// //unechter Bruch in echten umwandeln mit ganzer Zahl
		// Assert.assertEquals(new Bruch (2,1,3),new Bruch(7, 3).echterBruch());
		// //negativer unechter Bruch in echten umwandeln mit ganzer Zahl
		// Assert.assertEquals(new Bruch (-2,1,3),new Bruch(-7,
		// 3).echterBruch());
		// //ganze Zahl und unechten Bruch in echten Bruch umwandeln
		// Assert.assertEquals(new Bruch (5,1,3), new Bruch(2, 8,
		// 3).echterBruch());
		// //negative ganze Zahl und unechten Bruch in echten Bruch umwandeln
		// Assert.assertEquals(new Bruch (-5,1,3), new Bruch(-2, 8,
		// 3).echterBruch());
	}

	@Test
	public void testSubtrahiere() {
		Bruch result = new Bruch(1, 30);
		Bruch result2 = new Bruch(0);
		Bruch result3 = new Bruch(-1, 1, 2);
		Bruch result4 = new Bruch(-5, 2, 3);

		// Assert.assertEquals("FEHLER", result4,
		// bruchadd13.subtrahiere(bruchadd14));

		// echte + echte
		// Assert.assertEquals("FEHLER", result,
		// bruchadd1.subtrahiere(bruchadd2));
		// echte + echte, mit gleichem Nenner
		// Assert.assertEquals("FEHLER", result2,
		// bruchadd3.subtrahiere(bruchadd3));
		// //
		// Assert.assertEquals("FEHLER", result3, bruchadd4.addiere(bruchadd5));
		// echte + ganzeZahl und echte
		// Assert.assertEquals("FEHLER", result3,
		// bruchadd1.subtrahiere(bruchadd6));
		// // echte + unechte
		// Assert.assertEquals("FEHLER", result5, bruchadd7.addiere(bruchadd8));
		// // ganzeZahl echte + ganzeZahl echte (selbe bruch)
		// Assert.assertEquals("FEHLER", result6, bruchadd6.addiere(bruchadd6));
		// // ganzeZahl echte + ganzeZahl echte (verschiedene brüche)
		// Assert.assertEquals("FEHLER", result8, bruchadd8.addiere(bruchadd9));
		// // ganzeZahl unechter + echte (verschiedene nenner)
		// Assert.assertEquals("FEHLER", result9,
		// bruchadd1.addiere(bruchadd10));
		// // ganzeZahl unechter + echte (gleiche nenner)
		// Assert.assertEquals("FEHLER", result10,
		// bruchadd7.addiere(bruchadd10));
		// // //ganzeZahl unechter + unecht
		// Assert.assertEquals("FEHLER", result11,
		// bruchadd8.addiere(bruchadd10));
		// // ganzeZahl unechter + ganzeZahl echte
		// Assert.assertEquals("FEHLER", result12,
		// bruchadd6.addiere(bruchadd10));
		// // ganzeZahl unechter + ganzeZahl unechter (gleicher Bruch)
		// Assert.assertEquals("FEHLER", result13,
		// bruchadd10.addiere(bruchadd10));

	}

	@Test
	public void testMultipliziere() {

		// echte + echte
		Assert.assertEquals(new Bruch(1, 45),
				new Bruch(1, 6).multipliziere(new Bruch(2, 15)));
		// echte + negative echte
		Assert.assertEquals(new Bruch(-1, 45),
				new Bruch(1, 6).multipliziere(new Bruch(-2, 15)));
		// echte + echte, mit gleichem Nenner
		Assert.assertEquals(new Bruch(1, 25),
				new Bruch(1, 5).multipliziere(new Bruch(1, 5)));
		// echte + ganzeZahl und echte
		Assert.assertEquals(new Bruch(1, 9),
				new Bruch(1, 6).multipliziere(new Bruch(1, 2, 3)));
		// echte + negative ganzeZahl und echte
		Assert.assertEquals(new Bruch(-1, 9),
				new Bruch(1, 6).multipliziere(new Bruch(-1, 2, 3)));
		// echte + unechte
		Assert.assertEquals(new Bruch(7, 9),
				new Bruch(1, 3).multipliziere(new Bruch(7, 3)));
		// ganzeZahl echte + ganzeZahl echte (selbe bruch)
		Assert.assertEquals(new Bruch(4, 9),
				new Bruch(1, 2, 3).multipliziere(new Bruch(1, 2, 3)));
		// ganzeZahl echte + ganzeZahl echte (verschiedene brüche)
		Assert.assertEquals(new Bruch(3, 1, 9),
				new Bruch(7, 3).multipliziere(new Bruch(8, 6)));
		// ganzeZahl unechter + echte (verschiedene nenner)
		Assert.assertEquals(new Bruch(8, 9),
				new Bruch(1, 6).multipliziere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + echte (gleiche nenner)
		Assert.assertEquals(new Bruch(1, 7, 9),
				new Bruch(1, 3).multipliziere(new Bruch(2, 8, 3)));
		// //ganzeZahl unechter + unecht
		Assert.assertEquals(new Bruch(12, 4, 9),
				new Bruch(7, 3).multipliziere(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl echte
		Assert.assertEquals(new Bruch(3, 5, 9),
				new Bruch(1, 2, 3).multipliziere(new Bruch(2, 8, 3)));
		// negative ganzeZahl unechter + negative ganzeZahl echte
		Assert.assertEquals(new Bruch(3, 5, 9),
				new Bruch(-1, 2, 3).multipliziere(new Bruch(-2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl unechter (gleicher Bruch)
		Assert.assertEquals(new Bruch(28, 4, 9),
				new Bruch(2, 8, 3).multipliziere(new Bruch(2, 8, 3)));
	}

	@Test
	public void testDividieren() {

		// echte + echte
		Assert.assertEquals(new Bruch(1, 1, 4),
				new Bruch(1, 6).dividieren(new Bruch(2, 15)));
		// echte + negative echte
		// Assert.assertEquals(new Bruch(-1,1,4), new Bruch(1, 6).dividieren(new
		// Bruch(-2, 15)));
		// echte + echte, mit gleichem Nenner
		Assert.assertEquals(new Bruch(1),
				new Bruch(1, 5).dividieren(new Bruch(1, 5)));
		// echte + ganzeZahl und echte
		Assert.assertEquals(new Bruch(1, 4),
				new Bruch(1, 6).dividieren(new Bruch(1, 2, 3)));
		// echte + negative ganzeZahl und echte
		Assert.assertEquals(new Bruch(-1, 4),
				new Bruch(1, 6).dividieren(new Bruch(-1, 2, 3)));
		// echte + unechte
		Assert.assertEquals(new Bruch(1, 7),
				new Bruch(1, 3).dividieren(new Bruch(7, 3)));
		// ganzeZahl echte + ganzeZahl echte (selbe bruch)
		Assert.assertEquals(new Bruch(1),
				new Bruch(1, 2, 3).dividieren(new Bruch(1, 2, 3)));
		// ganzeZahl echte + ganzeZahl echte (verschiedene brüche)
		Assert.assertEquals(new Bruch(1, 3, 4),
				new Bruch(7, 3).dividieren(new Bruch(8, 6)));
		// ganzeZahl unechter + echte (verschiedene nenner)
		Assert.assertEquals(new Bruch(1, 32),
				new Bruch(1, 6).dividieren(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + echte (gleiche nenner)
		Assert.assertEquals(new Bruch(1, 16),
				new Bruch(1, 3).dividieren(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + unecht
		Assert.assertEquals(new Bruch(7, 16),
				new Bruch(7, 3).dividieren(new Bruch(2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl echte
		Assert.assertEquals(new Bruch(1, 8),
				new Bruch(1, 2, 3).dividieren(new Bruch(2, 8, 3)));
		// negative ganzeZahl unechter + negative ganzeZahl echte
		Assert.assertEquals(new Bruch(1, 8),
				new Bruch(-1, 2, 3).dividieren(new Bruch(-2, 8, 3)));
		// ganzeZahl unechter + ganzeZahl unechter (gleicher Bruch)
		Assert.assertEquals(new Bruch(1),
				new Bruch(2, 8, 3).dividieren(new Bruch(2, 8, 3)));

	}

	@Test
	public void testPotenzieren() {
	
		Assert.assertEquals(new Bruch(1, 1).toString(),
				new Bruch(2, 3).potenzieren(0).toString());
		Assert.assertEquals(new Bruch(2, 3).toString(),
				new Bruch(2, 3).potenzieren(1).toString());
		Assert.assertEquals(new Bruch(4, 9).toString(),
				new Bruch(2, 3).potenzieren(2).toString());
		Assert.assertEquals(new Bruch(8, 27).toString(),
				new Bruch(2, 3).potenzieren(3).toString());
		Assert.assertEquals(new Bruch(-8, 27).toString(), new Bruch(-2, 3)
				.potenzieren(3).toString());
	}

}
