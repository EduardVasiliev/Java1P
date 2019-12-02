package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra1 extends JFrame{
    private JButton button;
    
    public Fereastra1(){
        super("Titlul ferestrei");
        
        button = new JButton("Apasa!");
        this.add(button);
        this.setLayout(new FlowLayout());
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLUE);
        
//        ActionListener a1 = new ActionListener(){     // Actiunea butonului
//            @Override
//            public void actionPerformed(ActionEvent ev){
//                evenimentButon();
//            }
//        };
//        
//        button.addActionListener(a1);

        button.addActionListener(ev -> evenimentButon());
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void evenimentButon(){
        if(button.getText().equals("HELLO")){
            button.setText("WORLD");
        }else{
            button.setText("HELLO");
        }
    }
}