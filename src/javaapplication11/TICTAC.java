package javaapplication11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TICTAC extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count;
    TICTAC()
    {
        JFrame f = new JFrame("TICTACTOE");
        f.setSize(1000, 1000);
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b1.setBounds(100,100,50,100);
        b2.setBounds(300,100,50,100);
        b3.setBounds(500,100,50,100);
        b4.setBounds(100,300,50,100);
        b5.setBounds(300,300,50,100);
        b6.setBounds(500,300,50,100);
        b7.setBounds(100,500,50,100);
        b8.setBounds(300,500,50,100);
        b9.setBounds(500,500,50,100);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener) this);
        b4.addActionListener((ActionListener) this);
        b5.addActionListener((ActionListener) this);
        b6.addActionListener((ActionListener) this);
        b7.addActionListener((ActionListener) this);
        b8.addActionListener((ActionListener) this);
        b9.addActionListener((ActionListener) this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            b1.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b2)
        {
            b2.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b3)
        {
            b3.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b4)
        {
            b4.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b5)
        {
            b5.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b6)
        {
            b6.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b7)
        {
            b7.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b8)
        {
            b8.setLabel("X");
            checkuser();
        }
        if(e.getSource()==b9)
        {
            b9.setLabel("X");
            checkuser();
        }
    }
    public void checkuser()
    {
        if(b1.getText().equalsIgnoreCase("x") && b2.getText().equalsIgnoreCase("x") && b3.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b1.getText().equalsIgnoreCase("x") && b4.getText().equalsIgnoreCase("x") && b7.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b4.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b6.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b7.getText().equalsIgnoreCase("x") && b8.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b2.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b8.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b3.getText().equalsIgnoreCase("x") && b6.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b1.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b9.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
        
        else if(b3.getText().equalsIgnoreCase("x") && b5.getText().equalsIgnoreCase("x") && b7.getText().equalsIgnoreCase("x"))
            JOptionPane.showMessageDialog(this, "USER WINS !!!!!!");
    }
    
    public static void main(String args[])
    {
        new TICTAC();
        
        
    }
}
