package Minesweeper1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Minesweeper extends JFrame{
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem mi1, mi2;
    
    private JPanel optionsPanel;
    private JButton resetButton;
    
    private JPanel centerPanel;
    private JButton[][] button = new JButton[10][10];
    
    private ImageIcon smileyIcon = new ImageIcon(
        new ImageIcon("Smiley.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private ImageIcon mineIcon = new ImageIcon(
        new ImageIcon("mine.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private ImageIcon deadIcon = new ImageIcon(
        new ImageIcon("Dead.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    public Minesweeper(){
        super("Minesweeper");
        
        initComponents();
        Game.getInstance().startGame();
       
        
        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        //Bara de meniuri
        menuBar = new JMenuBar();
        menu = new JMenu("Optiuni");
        mi1 = new JMenuItem("New game");
        mi2 = new JMenuItem("Exit");
        
        this.setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(mi1);
        menu.add(mi2);
        
        //Panoul de optiuni
        optionsPanel = new JPanel();
        resetButton = new JButton(smileyIcon);
        
        optionsPanel.add(resetButton);
        this.add(optionsPanel, BorderLayout.NORTH);
        
        //Panoul central
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(10, 10));
        this.add(centerPanel);
        
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                button[i][j] = new JButton();
                centerPanel.add(button[i][j]);
            }
        }   
        
        //ActionListener pentru apasarea unui buton
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                button[i][j].addActionListener(ev -> buttonPressed(ev));
            }
        }
        
        resetButton.addActionListener(ev -> newGame());
        mi1.addActionListener(ev -> newGame());
        mi2.addActionListener(ev -> System.exit(0));  //Mesaj de confirmare ???
    }
    
    private void buttonPressed(ActionEvent ev){
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                
                if(ev.getSource() == button[i][j]){                             //Gasesc pozitia
                    int v = Game.getInstance().getCellValue(i, j);              //Stochez valoarea
                    
                    if(v < 0){
                        gameOver();
                    }else if(v > 0){
                        button[i][j].setEnabled(false);                         //Dezactivez butonul
                        button[i][j].setText(String.valueOf(v));                //Afisez valoarea (Numarul minelor vecine)
                    }else if(v == 0){
                        //Caut CASUTELE GOALE din jur si le DESCOPAR      
                    }
                }
            }
        }
    }
      
    private void gameOver(){
        enableAllButtons(false);
        ShowMineOnButtons();
        resetButton.setIcon(deadIcon);
        JOptionPane.showMessageDialog(this, "Game Over!");
    }
    
    private void enableAllButtons(boolean enable){
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                button[i][j].setEnabled(enable);
            }
        }
    }
    
    private void ShowMineOnButtons(){
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                int v = Game.getInstance().getCellValue(i, j);
                
                if(v < 0){
                    button[i][j].setIcon(mineIcon);                             //afisam minele
                    button[i][j].setBackground(Color.RED);
                }else{
                    button[i][j].setText(String.valueOf(v));                    //afisam toate valorile
                }
            }
        }
    }
    
    private void newGame(){
        enableAllButtons(true);
        clearAllButtons();
        resetButton.setIcon(smileyIcon);
        Game.getInstance().startGame();      
    }
    
    
    
    private void clearAllButtons(){
        for(int i=0; i<button.length; i++){
            for(int j=0; j<button[i].length; j++){
                button[i][j].setIcon(null);
                button[i][j].setText(null);
                button[i][j].setBackground(null);
            }
        }
    }
    
}