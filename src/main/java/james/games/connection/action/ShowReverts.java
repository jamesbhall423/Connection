/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;


import james.games.connection.CAction;

public class ShowReverts extends CAction {
	public static final ShowReverts SHOW_REVERTS = new ShowReverts();	
	/**
	 * Method ShowReverts
	 *
	 *
	 */
	private ShowReverts() {
		super(0,0,"show filps",false);
	}	
}
