/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;


import james.games.connection.*;
import james.games.connection.mapmaker.*;
import james.games.connection.action.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.net.*;
public class Driver2 implements Runnable {
	private static final int IN_PORT=4111;
	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SwingUtilities.invokeLater(new Driver2());
	}
	public void run() {
		//MapMaker.open(null);
		testProgram();
	}
	public void testProgram() {
		try {
			CMap map;
			int player;
			ServerSocket welcomeSocket = new ServerSocket(IN_PORT);
			Socket inSocket;
			Socket outSocket;
                        System.out.println("Hello 0.8");
			if (JOptionPane.showConfirmDialog(null,"Connect to other host?")==JOptionPane.YES_OPTION) {
				player=1;
				String ip = JOptionPane.showInputDialog("Enter IP address you wish to connect to.");
				outSocket = new Socket(ip,IN_PORT);
				inSocket = welcomeSocket.accept();
				ObjectInputStream istream = new ObjectInputStream(outSocket.getInputStream());
				map=(CMap)istream.readObject();
			} else {
				player=0;
				String load = JOptionPane.showInputDialog("Enter the file you wish to load.");
				map = CMap.read(CMap.expand(load));
				inSocket=welcomeSocket.accept();
				outSocket = new Socket(inSocket.getInetAddress(),IN_PORT);
				ObjectOutputStream ostream = new ObjectOutputStream(inSocket.getOutputStream());
				ostream.writeObject(map);
			}
                        System.out.println("Hello 1");
			SelfBuffer[] bs = new SelfBuffer[map.players.length];
			bs[player]=new SelfBuffer();
			bs[1-player]=new InetBuffer(outSocket);
                        System.out.println("Hello 1.5");
			SelfBuffer.setLinks(bs);
			new Thread(new InetReciever(inSocket,bs[player],bs[1-player])).start();
                        System.out.println("Hello 2");
			new IBox((CMap)map.clone(),player,player==0,bs[player]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	public void loadServer() {
	}
}