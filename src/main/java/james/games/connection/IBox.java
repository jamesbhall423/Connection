/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection;

import javax.swing.JOptionPane;
import james.games.connection.action.*;
public class IBox extends CBox {
	private ActionPipeline line;
	private boolean host;
	private static CAction[] gActions = {CAction.MESSAGE};
	public IBox(CMap map, int playerNum,boolean host, CBuffer buffer) {
		super(map,playerNum,false,gActions);
		line = new ActionPipeline(this,buffer);
		setVisible(true);
		this.host=host;
	}
	public void proccessAction(CAction action) {
		//System.out.println("proccess1: "+action);
		if (action.getClass()==Message_Action.class) ((Message_Action)action).setMessage(JOptionPane.showInputDialog(this,"Enter the message you want to send."));
		line.distribute(action);
	}
	public void extraAction(CAction action) {
            Class clazz = action.getClass();
		if (clazz==Exit.class) {
                    System.exit(0);
                }
	}
        @Override
	public void save() {
		System.out.println("save "+(player()+1));
	}
        @Override
	public void exit() {
		line.distribute(Exit.EXIT);
                System.exit(0);
	}
        @Override
	public void win() {
            showAll();
            JOptionPane.showMessageDialog(this,"You have won!");
	}
        @Override
	public void loss() {
            showAll();
            JOptionPane.showMessageDialog(this,"You have lost!");
	}
        @Override
	public void blocked() {
            showAll();
            JOptionPane.showMessageDialog(this,"Draw");
	}
        public void showAll() {
            Square[][] board = board();
            for (int y = 0; y < board.length; y++) for (int x = 0; x < board[y].length; x++) board[y][x].setView(board[y][x].player());
        }
}
