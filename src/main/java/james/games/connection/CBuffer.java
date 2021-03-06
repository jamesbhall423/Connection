/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;

public interface CBuffer {
	public static final int ECHO = 1;
	public static final int NORMAL = 0;
	/**
	 * Method hasObjects
	 *
	 *
	 * @return
	 *
	 */
	public boolean hasObjects();

	/**
	 * Method getObject
	 *
	 *
	 * @return
	 *
	 */
	public ChannelledObject getObject();

	/**
	 * Method newBuffer
	 *
	 *
	 * @param o
	 *
	 * @return
	 *
	 */
	public CBuffer newBuffer(ChannelledObject o);

	/**
	 * Method sendObject
	 *
	 *
	 * @param o
	 *
	 * @return
	 *
	 */
	public int sendObject(ChannelledObject o);
	/**
	 * Method sendObject
	 *
	 *
	 * @param o
	 * @param channel
	 *
	 * @return
	 *
	 */
	public int sendObject(Object o, int channel);
	public int recieveObject(ChannelledObject o);
}
