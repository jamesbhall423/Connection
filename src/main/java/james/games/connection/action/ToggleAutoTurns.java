/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;

import james.games.connection.CAction;

public class ToggleAutoTurns extends CAction {
	public static final ToggleAutoTurns TOGGLE_TURNS = new ToggleAutoTurns();	
	/**
	 * Method ToggleAutoTurns
	 *
	 *
	 */
	private ToggleAutoTurns() {
		super(0,1,"toggle turns",false);
	}	
}
