/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;

import james.games.connection.CAction;

public class DeclareVictory extends CAction {
	public static final DeclareVictory DECLARE = new DeclareVictory();	
	/**
	 * Method DeclareVictory
	 *
	 *
	 */
	private DeclareVictory() {
		super(0,0,"declare win",true);
	}	
}
