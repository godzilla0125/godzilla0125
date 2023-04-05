package javaWed;
import javax.swing.*;
import java.awt.event.*;
public class swing1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JLabel lbl = new JLabel("sainuu uuganaa");
		lbl.setBounds(150, 20, 100,40);
		
		JButton btn = new JButton("click me");
		btn.setBounds(100, 100, 90, 40);
		
		JButton btn1 = new JButton("press me");
		btn1.setBounds(200, 100, 90, 40);
		
		
		frame.add(lbl);
		frame.add(btn);
		frame.add(btn1);
		
		
		
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.setVisible(true);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText(btn.getText());
			}});
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lbl.setText(btn1.getText());
				
			}});
		

	}

}
