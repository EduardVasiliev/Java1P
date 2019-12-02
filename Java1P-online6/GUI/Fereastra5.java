package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra5 extends JFrame{
    private JPanel panel1, panel2;
    private JButton button1, button2, button3;
    
    public Fereastra5(){
        super("Exemplu JPanel");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton("RED");
        button2 = new JButton("GREEN");
        button3 = new JButton("BLUE");
        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        
        this.add(panel1, BorderLayout.SOUTH);
        this.add(panel2, BorderLayout.CENTER);
        
        button1.addActionListener(ev -> setCenterRed());
        button2.addActionListener(ev -> setCenterGreen());
        button3.addActionListener(ev -> setCenterBlue());
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void setCenterRed(){
        panel2.setBackground(Color.RED);
    }
    
    private void setCenterGreen(){
        panel2.setBackground(Color.GREEN);
    }
    
    private void setCenterBlue(){
        panel2.setBackground(Color.BLUE);
    }
}

// JPanel