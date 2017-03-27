package com.sabel.vererbung;

public class Katze extends Tier{

	public Katze(String name) {
		super(name);
	}

	public Katze(String name, int alter) {
		super(name, alter);
	}
	
	public void miau() {
		System.out.println("Miau Miau");
	}

	@Override
	public void geraeuschMachen() {
//		super.geraeuschMachen();
		miau();
	}

	
}
