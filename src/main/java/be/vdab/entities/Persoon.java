package be.vdab.entities;

import java.util.ArrayList;
import java.util.List;

public class Persoon {
	private final String[] voornamen;

	public Persoon(String[] voornamen) {
//		throw new UnsupportedOperationException();
//		String vorigeNaam = "";
		List<String> vorigeNamen = new ArrayList<String>();
		if (voornamen.length == 0) {
			throw new NullPointerException("Geen voornamen gevonden");
		}
		for (int index = 0; index != voornamen.length; index++) {
			if (voornamen[index].length() == 0 || voornamen[index].equals(" ")) {
				throw new IllegalArgumentException("Voornaam is leeg");
			}
			if (vorigeNamen.contains(voornamen[index])) {
				throw new IllegalArgumentException("Mag geen twee dezelfe voornamen hebben");
			}
			vorigeNamen.add(voornamen[index]);
//			if (voornamen[index].equals(vorigeNaam)) {
//				throw new IllegalArgumentException("Mag geen twee dezelfe voornamen hebben");
//			}
//			vorigeNaam = voornamen[index];
		}
		this.voornamen = voornamen;
	}

	@Override
	public String toString() {
//		throw new UnsupportedOperationException();
		StringBuilder stringNamen = new StringBuilder();
		for (int index = 0; index != voornamen.length; index++) {
			stringNamen.append(voornamen[index]);
			if (index != voornamen.length-1) {
				stringNamen.append(' ');
			}
		}
		return stringNamen.toString();
	}
	
}
