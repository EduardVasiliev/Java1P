package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra6 extends JFrame{
    private JButton[] button = new JButton[12];
    
    public Fereastra6(){
        super("Grid Layout");
        this.setLayout(new GridLayout(4,3));
        
        for(int i=0; i<button.length; i++){
            button[i] = new JButton(String.valueOf(i+1));
            this.add(button[i]);
        }
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

// Grid Layout