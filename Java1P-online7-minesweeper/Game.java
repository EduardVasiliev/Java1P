package Minesweeper1;
import java.util.*;

public class Game {
    private static int MINE = -1;
    private int m[][] = new int[10][10];    //matricea minelor

    private Game(){
        
    }
    
    private static final class SingletonHolder{
        private static final Game SINGLETON = new Game();
    }
    
    public static Game getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
    public void startGame(){
        init();
        generateMines(20);
        calculateEmptySpaces();
    }
    
    public int getCellValue(int i, int j){
        return m[i][j];
    }
    
    //Initializam matricea cu 0
    private void init(){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = 0;
            }
        }
    }
    
    //Generam aleator minele
    private void generateMines(int n){
        Random rand = new Random();
        for(int i=0; i<n; i++){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            
            if(m[x][y] != MINE){
                m[x][y] = MINE;
            }else{
                i--;
            }   
        }
    }
    
    private void calculateEmptySpaces(){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                
                int NoOfMines = 0;
                
                if(m[i][j] != MINE){
                    NoOfMines += isMine(i-1, j-1) ? 1 : 0;  //verific daca am mine
                    NoOfMines += isMine(  i, j-1) ? 1 : 0;  //in jurul fiecarei pozitii
                    NoOfMines += isMine(i+1, j-1) ? 1 : 0;  
                    NoOfMines += isMine(i-1,   j) ? 1 : 0;
                    NoOfMines += isMine(i+1,   j) ? 1 : 0;
                    NoOfMines += isMine(i-1, j+1) ? 1 : 0;
                    NoOfMines += isMine(  i, j+1) ? 1 : 0;
                    NoOfMines += isMine(i+1, j+1) ? 1 : 0;
                    
                    m[i][j] = NoOfMines;
                }
                
            }
        }
    }
    
    //Calculam daca este MINA pe o anumita pozitie
    private boolean isMine(int i, int j){
        try{
            return m[i][j] == MINE;
            //true sau false
        }catch(ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
    
    //Caut CASUTELE GOALE din jur si le DESCOPAR
    public void emptyCluster(){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                
                if(m[i][j] != MINE){
                    
                }
            }
        }
    }
    
    private boolean isZero(int i, int j){
        return m[i][j] == 0;
    }
}