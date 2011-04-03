package com.vibrunazo.viboard.client;

public class Player {
	private String name;
	private String control;
	
	public Player(String name, String control) {
		this.name = name;
		this.control = control;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}
}
