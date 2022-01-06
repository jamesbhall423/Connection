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
public class Driver implements Runnable {
	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SwingUtilities.invokeLater(new Driver());
	}
	public void run() {
		//MapMaker.open(null);
		testProgram();
	}
	public void testProgram() {
		try {
			String load = JOptionPane.showInputDialog("Enter the file you wish to load.");
			CMap map = CMap.read(CMap.expand(load));
			SelfBuffer[] bs = new SelfBuffer[map.players.length];
			for (int i = 0; i < bs.length; i++) bs[i]=new SelfBuffer();
			SelfBuffer.setLinks(bs);
			IBox[] boxes = new IBox[map.players.length];
			for (int i = 0; i < boxes.length; i++) boxes[i]=new IBox((CMap)map.clone(),i,i==0,bs[i]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
