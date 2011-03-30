package com.vibrunazo.viboard.client;

import com.google.gwt.core.client.EntryPoint;
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
	private Label someLabel2 = new Label();

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		
		Game newGame = new Game(gamePanel);		
		newGame.start();
		
		someLabel.setText("Some text here");
		someLabel2.setText("Some other text here");
		

		
		mainPanel.add(someLabel);
		mainPanel.add(gamePanel);
		mainPanel.add(someLabel2);
		RootPanel.get("viboardDiv").add(mainPanel);
		
		

	}
}
