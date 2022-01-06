/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;



public class ChannelledObject {
	public Object channel;
	public Object message;
	public ChannelledObject() {
		
	}	
	public ChannelledObject(Object channel, Object message) {
		this.channel=channel;
		this.message=message;
	}
}
