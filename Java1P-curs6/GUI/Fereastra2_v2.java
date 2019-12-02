package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra2_v2 extends JFrame{
    private JButton button1, button2, button3;
    private JPanel buttonPanel, colorPanel;
    
    public Fereastra2_v2(){
        super("Fereastra 2");
        
        initComponents();
        
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents(){
        buttonPanel = new JPanel();
        colorPanel = new JPanel();
        button1 = new JButton("RED");
        button2 = new JButton("GREEN");
        button3 = new JButton("BLUE");
        
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(colorPanel, BorderLayout.CENTER);
        
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        
        button1.setForeground(Color.red);
        button2.setForeground(Color.green);
        button3.setForeground(Color.blue);
        
        button1.addActionListener(ev -> colorCenterRed());
        button2.addActionListener(ev -> colorCenterGreen());
        button3.addActionListener(ev -> colorCenterBlue());
    }
    
    private void colorCenterRed(){
        colorPanel.setBackground(Color.red);
    }
    
    private void colorCenterGreen(){
        colorPanel.setBackground(Color.green);
    }
    
    private void colorCenterBlue(){
        colorPanel.setBackground(Color.blue);
    }
}