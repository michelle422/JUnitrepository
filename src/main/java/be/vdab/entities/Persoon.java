package be.vdab.entities;


import java.util.HashSet;

import java.util.Set;


public class Persoon {
	private final String[] voornamen;

	public Persoon(String[] voornamen) {
//		throw new UnsupportedOperationException();
		Set<String> vorigeNamen = new HashSet<String>();

		for (String voornaam : voornamen) {
			if (voornaam.length() == 0 || voornaam.equals(" ")) {
				throw new IllegalArgumentException("Voornaam is leeg");
			}
			vorigeNamen.add(voornaam);
		}
		if (voornamen.length != vorigeNamen.size()) {
			throw new IllegalArgumentException("Mag geen twee dezelfe voornamen hebben");
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
