/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;

import james.games.connection.CAction;

public class StartNotification extends CAction {
	private String message;
	/**
	 * Method StartAction
	 *
	 *
	 * @param player
	 * @param message
	 *
	 */
	public StartNotification(int player, String message) {
		super(player,0,"StartMessage",false);
		this.message=message;
	}	
	public String toString() {
		String out = super.toString();
		out += message+LN;
		return out;
	}
}
