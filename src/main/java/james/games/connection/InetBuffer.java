/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;

import java.util.concurrent.ArrayBlockingQueue;
import java.io.* ;
import java.net.* ;
public class InetBuffer extends SelfBuffer {
	private ObjectOutputStream ostream;
	private ObjectInputStream istream;
        private Socket socket;
	public InetBuffer(Socket output) throws IOException {
            this.socket=output;
            ostream = new ObjectOutputStream(output.getOutputStream());
            istream = null;//new ObjectInputStream(output.getInputStream());
	}
	@Override
	public int recieveObject(ChannelledObject o) {
            boolean err = false;
            try {
                //System.out.println("RecieveObject 1");
                if (istream==null) istream=new ObjectInputStream(socket.getInputStream());
                //System.out.println("RecieveObject 1.5");
                ostream.writeObject(o.message);
                //System.out.println("RecieveObject 2");
                int out = istream.readInt();
                //System.out.println("RecieveObject 3");
                return out;
            } catch (IOException e) {
                //System.out.println("RecieveObject Error");
                e.printStackTrace();
                return 1;
            }
	}
}