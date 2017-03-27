package com.sabel.vererbung;

public class Tier {

	private String name;
	private int alter;

	public Tier(String name) {
		super();
		this.name = name;
	}

	public Tier(String name, int alter) {
		this(name);
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public void laufen() {
		System.out.println("Das Tier läuft!");
	}
	
	public void geraeuschMachen() {
		System.out.println("Tier gibt Laut!");
	}

}
