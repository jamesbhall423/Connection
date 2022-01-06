/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;


import james.games.connection.CAction;

public class Save extends CAction {
	public static final Save SAVE = new Save();	
	/**
	 * Method Save
	 *
	 *
	 */
	private Save() {
		super(0,0,"save",true);
	}	
}
