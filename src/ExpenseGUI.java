import java.awt.event.*;
import javax.swing.*;

public class ExpenseGUI extends JFrame {
    public ExpenseGUI(){
        //initializing frame
        setTitle("Button GUI");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel to hold buttons
        JPanel panel = new JPanel();

        //Buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton ("Button 3");

        //Acton listeners for buttons
        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());
        button3.addActionListener(new ButtonClickListener());

        //Add buttons to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        //Add panel to frame
        add(panel);

        //make frame visable
        setVisible(true);
    }
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Add code here to handle button clicks
            System.out.println(((JButton) e.getSource()).getText() + " clicked!");
        }
    }
}

