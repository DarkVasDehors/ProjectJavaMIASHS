package JaugeTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JaugeNaturelTest {

	JaugeNaturel jauge;
	
	@Before
	public void setUp() throws Exception {
		jauge = new JaugeNaturel(10,20,11);
	}

	@After
	public void tearDown() throws Exception {
		jauge = null;
	}

	@Test
	public void testJaugeNaturel() {
		assertNotNull("Jauge bien cr�e",jauge);
	}

	@Test
	public void testEstRouge() {
		assertTrue("Jauge rouge",jauge.estRouge());
	}

	@Test
	public void testEstVert() {
		assertTrue("Jauge verte",jauge.estVert());
	}

	@Test
	public void testEstBleu() {
		assertTrue("Jauge bleu",jauge.estBleu());
	}

	@Test
	public void testIncrementer() {
		long currentVal = jauge.getValeur();
		jauge.incrementer();
		assertTrue("Jauge incr�ment�e",jauge.getValeur() == currentVal + 1 );
	}

	@Test
	public void testDecrementer() {
		long currentVal = jauge.getValeur();
		jauge.decrementer();
		assertTrue("Jauge decr�ment�e",jauge.getValeur() == currentVal - 1 );
	}

	@Test
	public void testToString() {
		String monToString = "<"+jauge.getValeur()+" ["+jauge.getMin()+"," + jauge.getMax() + "]>";
		assertTrue("Jauge toString",monToString.equals(jauge.toString()));
	}

}
