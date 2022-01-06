/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.action;


import james.games.connection.CAction;

public abstract class Request extends CAction {
	public Request(String name) {
		super(0,0,name,false);
	}
}
