/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;

import java.io.* ;
import java.net.* ;
public class InetReciever implements Runnable {
	private ObjectInputStream istream;
	private ObjectOutputStream ostream;
	private CBuffer buffer;
	private CBuffer other;
	public InetReciever(Socket socket, CBuffer buffer, CBuffer other) throws IOException {
		this.buffer=buffer;
                this.other=other;
		istream = new ObjectInputStream(socket.getInputStream());
		ostream = new ObjectOutputStream(socket.getOutputStream());
	}
	@Override
	public void run() {
		try {
			while (true) {
                            //System.out.println("Start Reciever 0");
                            Object in = istream.readObject();
                            //System.out.println("Reciever 1");
                            ChannelledObject next = new ChannelledObject(other,in);
                            //System.out.println("Reciever 2");
                            int ret = buffer.recieveObject(next);
                            //System.out.println("Reciever 3");
                            ostream.writeInt(ret);
                            ostream.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}