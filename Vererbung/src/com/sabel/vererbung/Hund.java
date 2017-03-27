package com.sabel.vererbung;

public class Hund extends Tier {

	private boolean istStubenrein;
	
	public Hund(String name) {
		super(name);
		this.setAlter(0);
		this.istStubenrein = false;
	}

	public Hund(String name, int alter) {
		super(name, alter);
		this.istStubenrein = false;
	}

	public Hund(String name, boolean istStubenrein) {
		super(name);
		this.istStubenrein = istStubenrein;
	}

	public Hund(String name, int alter, boolean istStubenrein) {
		super(name, alter);
		this.istStubenrein = istStubenrein;
	}

	public boolean isIstStubenrein() {
		return istStubenrein;
	}

	public void setIstStubenrein(boolean istStubenrein) {
		this.istStubenrein = istStubenrein;
	}
	
	public void bellen() {
		System.out.println("Wau\0007 Wau\0007");
	}
	
	@Override
	public void geraeuschMachen() {
		bellen();
	}
}
