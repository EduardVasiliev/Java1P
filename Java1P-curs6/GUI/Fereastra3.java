package GUI;
import javax.swing.*;
import java.awt.*;
public class Fereastra3 extends JFrame{
    
    public Fereastra3(){
        
        setLayout(new GridLayout(3, 4));
        
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                add(new JButton(i + " " + j));
            }
        }
        
        setSize(500, 500);
        setVisible(true);
    }
}