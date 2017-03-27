package com.sabel.vererbung;

public class Testklasse {

	public static void main(String[] args) {
		Tier tier = new Tier("Karlo");
		tier.laufen();
		tier.setAlter(23);
		System.out.println(tier.getName());

		Hund hund = new Hund("Bello", 15, true);
		hund.laufen();
		hund.bellen();

		Katze katze = new Katze("Mautzi", 3);
		katze.laufen();
		katze.miau();

		// Polymorphie I
		tier = hund;
		tier.laufen();
		tier.geraeuschMachen();
		if (tier instanceof Hund) {
			((Hund) tier).bellen();
		}

		tier = katze;
		tier.laufen();
		tier.geraeuschMachen();
		((Hund) tier).bellen(); // Achtung!
	}
}
