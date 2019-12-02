package Minesweeper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Minesweeper extends JFrame{
    private JPanel optionsPanel;
    private JPanel playPanel;
    private JButton resetButton;
    private JButton[][] matrix;
    private JMenuBar mb;
    private JMenu m1;
    private JMenuItem mi1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    
    private ImageIcon ico1 = new ImageIcon(
        new ImageIcon("Smiley.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private ImageIcon ico2 = new ImageIcon(
        new ImageIcon("Dead.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)
    );
    
    private boolean[][] bombs;
    private int dimM;
    private int dimN;
    private int casuteRamase;
     
    
    
    public Minesweeper(){
        super("Minesweeper");
        initComponents();
        
        setSize(600, 600);
        setLocationRelativeTo(null);
    }
    
    private void initComponents(){
        optionsPanel = new JPanel();
        playPanel = new JPanel();
        resetButton = new JButton(ico1);
        mb = new JMenuBar();
        m1 = new JMenu("Optiuni de joc");
        mi1 = new JMenuItem("10 x 10");
        mi2 = new JMenuItem("15 x 15");
        mi3 = new JMenuItem("17 x 17");
        
        mb.add(m1);
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        
        setJMenuBar(mb);
        
        //TODO Events on menu items
        mi1.addActionListener(ev -> initGame(10,10));
        mi2.addActionListener(ev -> initGame(15,15));
        mi3.addActionListener(ev -> initGame(17,17));
        
        //Setup optionsPanel
        resetButton.addActionListener(ev -> initGame(dimM, dimN));
        
        optionsPanel.setLayout(new FlowLayout());
        optionsPanel.add(resetButton);
        add(optionsPanel, BorderLayout.NORTH);
        
        
        //Setup playPanel
        initGame(10, 10);
        add(playPanel); //in centru
        
        
    }
    
    private void initGame(int m, int n){
        dimM = m;
        dimN = n;
        
        playPanel.setLayout(new GridLayout(m,n));
        playPanel.removeAll();
        matrix = new JButton[m][n];
        bombs = new boolean[m][n];
        resetButton.setIcon(ico1);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = new JButton();
                
                //TODO: Set event on matrix[i][j]
                final int I = i;
                final int J = j;
                matrix[i][j].addActionListener(ev -> buttonPressed(I, J));
                playPanel.add(matrix[i][j]);
            }
        }
        
        generateBombs(m,n);
        showBombs();
        playPanel.revalidate();
    }
    
    private void buttonPressed(int x, int y){
        if(bombs[x][y]){
            gameOver();
            return;
        }
        
        int nearBombs = getNearBombs(x, y);
        
        if(nearBombs != 0){
            matrix[x][y].setEnabled(false);
            matrix[x][y].setText(String.valueOf(nearBombs));
            
            casuteRamase--;
            checkVictory();
            return;
        }
        
        discover(x, y);
    }
    
    private void discover(int x, int y){
        
        if(x < 0 || x >= dimM){
            return;
        }

        if(y < 0 || y >= dimN){
            return;
        }

        if(!matrix[x][y].isEnabled()){
            return;
        }
        matrix[x][y].setEnabled(false);
        
        casuteRamase--;
        checkVictory();
        
        int bombsCount = getNearBombs(x, y);
        if(bombsCount != 0 ){
            matrix[x][y].setText(String.valueOf(bombsCount));
            return;
        }

        for(int index = 0; index < I_Move.length; index++){
            int newX = x + I_Move[index];
            int newY = y + J_Move[index];
            
            discover(newX, newY);
        }
    }
    
    private void checkVictory(){
        if(casuteRamase == 0){
            showBombs();
            JOptionPane.showMessageDialog(null, "You Won!");
            initGame(dimM, dimN);     
        }
    }
    
    //indicii cu care iteram in jurul unei pozitii pentru a numara bombele
    private final static int I_Move[] = {-1, -1,  0,  1,  1,  1,  0, -1};
    private final static int J_Move[] = { 0,  1,  1,  1,  0, -1, -1, -1};
    
    private int getNearBombs(int x, int y){
        int bombsCount = 0;
        
        for(int index = 0; index < I_Move.length; index++){
            int newX = x + I_Move[index];
            int newY = y + J_Move[index];
            
            if(newX < 0 || newX >= dimM){
                continue;
            }
            
            if(newY < 0 || newY >= dimN){
                continue;
            }
            
            if(bombs[newX][newY]){
                bombsCount++;
            }
        }
        return bombsCount;
    }
    
    private void generateBombs(int m, int n){
        int bombsCount = m * n / 7;
        casuteRamase = m * n - bombsCount;
        int generatedBombs = 0;
        
        Random rand = new Random();
        while(generatedBombs < bombsCount){
            int x = rand.nextInt(m);
            int y = rand.nextInt(n);
            
            if(!bombs[x][y]){
                bombs[x][y] = true;
                generatedBombs++;
            }
        }
        
    }
    
    private void showBombs(){
        for(int i=0; i<dimM; i++){
            for(int j=0; j<dimN; j++){
                if(bombs[i][j] == true){
                    matrix[i][j].setBackground(Color.red);
                }
            }
        }
    }
    
    private void gameOver(){
        showBombs();
        resetButton.setIcon(ico2);
        JOptionPane.showMessageDialog(null, "Game Over!");
        initGame(dimM, dimN);
    }
}