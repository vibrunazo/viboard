package com.vibrunazo.viboard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Viboard implements EntryPoint {
	
	private VerticalPanel mainPanel = new VerticalPanel();
	private Label someLabel = new Label();
	private Grid gameGrid = new Grid(3, 3);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		
				
		
		someLabel.setText("Some text here");
		
		gameGrid.setText(0, 0, "00");
		gameGrid.setText(0, 1, "01");
		gameGrid.setText(0, 2, "02");
		gameGrid.setText(1, 0, "10");
		gameGrid.setText(1, 1, "11");
		gameGrid.setText(1, 2, "12");
		gameGrid.setText(2, 0, "20");
		gameGrid.setText(2, 1, "21");
		gameGrid.setText(2, 2, "22");
		
		mainPanel.add(someLabel);
		mainPanel.add(gameGrid);
		RootPanel.get("viboardDiv").add(mainPanel);
		
		

	}
}
