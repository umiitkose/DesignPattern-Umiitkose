
package com.umiitkose.structural.flyweight.circles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String command = button.getActionCommand();
		switch(command){
		case "Start":
			break;
		case "Stop":
			break;
		}
	}
}
