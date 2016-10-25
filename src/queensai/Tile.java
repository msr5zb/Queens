/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queensai;

/**
 *
 * @author Mike
 */
public class Tile {
   //Tile Mark can be Empty, X, or O
    
    int row;
    int column;
    String tileMark;
    //Note, A Tile Mark can be a "empty" "queen" "numberMine"
    
    public Tile(){}
    public Tile(int row, int column, String mark){
        this.row = row;
        this.column = column;
        this.tileMark = mark;
    }
    
    public void setTileMark(String mark){this.tileMark = mark;}  
}