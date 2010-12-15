package com.vibrunazo.viboard.client;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Game {
	private VerticalPanel panel;
	private Grid gameGrid = new Grid(3, 3);
	private Label alabel = new Label(); 
	
	public Game(VerticalPanel panel) {
		this.panel = panel;
	}
	
	public void show() {	
		this.panel.add(alabel);
		this.panel.add(gameGrid);
		
		alabel.setText("This is the panel text");
		
		gameGrid.setText(0, 0, "00");
		gameGrid.setText(0, 1, "01");
		gameGrid.setText(0, 2, "02");
		gameGrid.setText(1, 0, "10");
		gameGrid.setText(1, 1, "11");
		gameGrid.setText(1, 2, "12");
		gameGrid.setText(2, 0, "20");
		gameGrid.setText(2, 1, "21");
		gameGrid.setText(2, 2, "22");
	}
	
}
