package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Fereastra1 extends JFrame {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    public Fereastra1(){
        super("Titlu fereasta");
        
        b1 = new JButton();
        b1.setText("Apasa");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        
        add(b1);
        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.EAST);
        
        b1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        JOptionPane.showMessageDialog(null, "Buton Apasat");
                    }
                }
        );
        
        setSize(500, 500);
        setLocationRelativeTo(null);        //centru
        setVisible(true);
        //setResizable(false);
        
    }
    
}

/*
    (0,0) este stanga sus
*/