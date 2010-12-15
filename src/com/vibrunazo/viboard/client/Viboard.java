package com.vibrunazo.viboard.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Viboard implements EntryPoint {
	
	private VerticalPanel mainPanel = new VerticalPanel();
	private VerticalPanel gamePanel = new VerticalPanel();
	private Label someLabel = new Label();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		
		Game newGame = new Game(gamePanel);		
		newGame.show();
		
		someLabel.setText("Some text here");

		
		mainPanel.add(someLabel);
		mainPanel.add(gamePanel);
		RootPanel.get("viboardDiv").add(mainPanel);
		
		

	}
}
