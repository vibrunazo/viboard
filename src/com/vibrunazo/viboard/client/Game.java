package com.vibrunazo.viboard.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Game {
	private VerticalPanel panel;
	private Grid gameGrid = new Grid(3, 3);
	private Label alabel = new Label();
	private int gameType = 0;
	private int turn = 0;
	private Action action;
	private Player[] players = new Player[2];

	public Game(VerticalPanel panel) {
		this.panel = panel;
	}

	public void start() {
		ini();
		show();
		mouseListen();

	}

	private void ini() {
		turn = 1;
		
		
		players[0] = new Player("Player 1", "mouse");
		players[1] = new Player("Player 2", "mouse");
		
	}

	private void show() {	
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

	private void mouseListen() {
		// Listen for mouse events
		gameGrid.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				mouseClicked(event);

			}
		});
	}

	private void mouseClicked(ClickEvent event) {
		int cell = gameGrid.getCellForEvent(event).getCellIndex();
		int row = gameGrid.getCellForEvent(event).getRowIndex();

		alabel.setText(cell+", "+row);
		
		if (gameType == 0) {
			// turn based game
			if (turn == 1) {
				String unit = "X";
				action = new Action("new", gameGrid);
				action.newUnit(unit, cell, row);
				turn = 2;
			}
			else {
				String unit = "O";
				action = new Action("new", gameGrid);
				action.newUnit(unit, cell, row);
				turn = 1;
			}
		}
		
//		if (!turn) {
//			gameGrid.setText(row, cell, "X");
//			turn = true;
//		}
//		else {
//			gameGrid.setText(row, cell, "O");
//			turn = false;
//		}
	}

	
}
