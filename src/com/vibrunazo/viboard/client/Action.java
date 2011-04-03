package com.vibrunazo.viboard.client;

import com.google.gwt.user.client.ui.Grid;

public class Action {
	// TODO should action be a class?
	private String name;
	private Grid gameGrid;

	/**
	 * @param name
	 * @param gameGrid 
	 */
	public Action(String name, Grid gameGrid) {
		this.name = name;
		this.gameGrid = gameGrid;
	}


	public void newUnit(String unit, int cell, int row) {
		// TODO Auto-generated method stub
		gameGrid.setText(row, cell, unit);
		
	}
	
	
}
