package be.vdab.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersoonTest {

	@Test
	public void persoonMetEnkelEenVoornaam() {
		String[] voornamen = {"Allan"};
		new Persoon(voornamen);
	}
	@Test
	public void persoonMetTweeOfMeerVoornamen() {
		String[] voornamen = {"Charlotte", "Elizabeth", "Diana"};
		new Persoon(voornamen);
	}
	@Test(expected = IllegalArgumentException.class)
	public void persoonMetTweeDezelfdeVoornamenIsVerkeerd() {
		String[] voornamen = {"Allan", "Hans", "Allan"};
		new Persoon(voornamen);
	}
	@Test(expected = IllegalArgumentException.class)
	public void eenLegeVoornaamIsVerkeerd() {
		String[] voornamen = {""};
		new Persoon(voornamen);
	}
	@Test(expected = IllegalArgumentException.class)
	public void eenVoornaamMetEenEnkeleSpatieIsVerkeerd() {
		String[] voornamen = {" "};
		new Persoon(voornamen);
	}
	@Test(expected = NullPointerException.class)
	public void eenVoornaamMetNullIsVerkeerd() {
		String[] voornamen = {null};
		new Persoon(voornamen);
	}
	@Test
	public void toStringMoetDeVoornamenTeruggeven() {
		String[] voornamen = {"Charlotte", "Elizabeth", "Diana"};
		String strVoornamen = "Charlotte Elizabeth Diana";
		assertEquals(strVoornamen, new Persoon(voornamen).toString());
	}
}
