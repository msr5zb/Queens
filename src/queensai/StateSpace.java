/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queensai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mike
 */
public class StateSpace {
    
    int rows;
    int columns;
    Tile[][] board;
    
    StateSpace parent;
    int currentColumn = 0;
    List<StateSpace> children = new ArrayList<StateSpace>();
    List <Integer> blacklistedRows = new ArrayList<Integer>();
    List <Integer> blacklistedColumns = new ArrayList<Integer>();
    
    
    
    //Constructor
    public StateSpace(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.board = new Tile[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                this.board[i][j] = new Tile(i,j,"empty");
            }
        }
    }
    
    //Prints out the Board StateSpace
    public void printBoard(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.print(this.board[i][j].tileMark + " ");
            }
            System.out.print("\n");
        }        
    }    
    
    
    //Clones a Board
    public void cloneBoard(Tile[][] boardToClone){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                this.board[i][j].tileMark = new String(boardToClone[i][j].tileMark);
            }
        }
    }
    
    //Generates Current Board State Space's Children 
    public void generateChildrenStateSpaces(String mark){
        this.children.clear();
        //Potential Children States
        //Will be in the next column over only... check bounds!
        for(int i = 0; i < this.columns; i++){
            //Check Every One in the Column Ahead
            
            if(!blacklistedRows.contains(i) && !blacklistedColumns.contains(j) && j == (this.currentColumn+1)){

            }
            
            
            StateSpace childBoard = new StateSpace(this.rows, this.columns);
            
        }
        
        
        
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                if(this.board[i][j].tileMark.equals("empty")){
                    //Make it a Child State
                    StateSpace childBoard = new StateSpace(this.rows, this.columns);
                    childBoard.cloneBoard(this.board);
                    childBoard.board[i][j].setTileMark(mark);
                    childBoard.parent = this;
                    this.children.add(childBoard);
                }
            }
        }
    }    
    
    
    
}
