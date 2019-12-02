package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra4 extends JFrame{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    
    public Fereastra4(){
        super("LAYOUT");
        this.setLayout(new BorderLayout());
        
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.WEST);
        this.add(button3, BorderLayout.SOUTH);
        this.add(button4, BorderLayout.EAST);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

// BorderLayout