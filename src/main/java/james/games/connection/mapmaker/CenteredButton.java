/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.games.connection.mapmaker;

import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.JToggleButton;

public class CenteredButton extends Panel {
	private static final long serialVersionUID = 1L;
	private final JToggleButton button;	
	/**
	 * Method CenteredButton
	 *
	 *
	 * @param button
	 *
	 */
	public CenteredButton(JToggleButton button) {
		this.button=button;
		setLayout(new GridLayout(1,0));
		add(new Panel());
		add(button);
		add(new Panel());
	}
	public boolean isSelected() {
		return button.isSelected();
	}
	public void setSelected(boolean selected) {
		button.setSelected(selected);
	}
}
