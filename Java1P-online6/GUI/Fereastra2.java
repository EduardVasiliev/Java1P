package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra2 extends JFrame{
    private JButton button;
    private int i = 0;

    public Fereastra2(){
        super("Incrementare");
        this.setLayout(new FlowLayout());
        
        button = new JButton(String.valueOf(i));
        this.add(button);
        button.setBackground(Color.white);
        button.setForeground(Color.blue);
        
        button.addActionListener(ev -> evenimentButon());
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void evenimentButon(){
        i++;
        button.setText(String.valueOf(i));
    }
}