package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Fereastra7 extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu sub1;
    
    private JMenuItem mi1, mi2, mi3, mi4, mi5;
    
    public Fereastra7(){
        super("Meniuri");
        
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);              //Adaug bara de meniuri
        
        menu1 = new JMenu("Meniul 1");
        menu2 = new JMenu("Meniul 2");
        menuBar.add(menu1);                     //Adaug meniurile
        menuBar.add(menu2);
        
        sub1 = new JMenu("Submeniu");
        mi1 = new JMenuItem("MenuItem 1");      //Adaug sub/item pe meniul 1
        menu1.add(sub1);
        menu1.add(mi1);
        
        mi2 = new JMenuItem("MenuItem 2");      //Adaug item pe submeniul din meniul 1
        mi3 = new JMenuItem("MenuItem 3");
        mi4 = new JMenuItem("MenuItem 4");
        sub1.add(mi2);
        sub1.add(mi3);
        sub1.add(mi4);
        
        mi5 = new JMenuItem("MenuItem 5");      //Adaug item pe meniul 2
        menu2.add(mi5);
        
        //Actiune pe mi1
        mi1.addActionListener(ev -> sayHello());
        
        //Control tastatura
        KeyStroke ks1 = KeyStroke.getKeyStroke("control alt W");
        mi1.setAccelerator(ks1);
        menu1.setMnemonic('m');
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void sayHello(){
        JOptionPane.showMessageDialog(null, "Hello!");
    }
}