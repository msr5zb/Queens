/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queensai;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Mike
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Test Case 1
//        StateSpace startingStateSpace = new StateSpace(5,5);
//        startingStateSpace.board[4][0].setTileMark("0");
//        startingStateSpace.board[4][0].available = false;
//        startingStateSpace.board[3][2].setTileMark("1");
//        startingStateSpace.board[3][2].available = false;
//        startingStateSpace.findInitialZero();
         
        //Test Case 2
//        StateSpace startingStateSpace = new StateSpace(6,6);
//        startingStateSpace.board[5][1].setTileMark("0");
//        startingStateSpace.board[5][1].available = false;
//        startingStateSpace.board[4][3].setTileMark("2");
//        startingStateSpace.board[4][3].available = false;
//        startingStateSpace.findInitialZero();

        //Test Case 3
//        StateSpace startingStateSpace = new StateSpace(6,6);
//        startingStateSpace.board[2][3].setTileMark("1");
//        startingStateSpace.board[2][3].available = false;
//        startingStateSpace.board[5][0].setTileMark("1");
//        startingStateSpace.board[5][0].available = false;
//        startingStateSpace.board[3][5].setTileMark("2");
//        startingStateSpace.board[3][5].available = false;
//        startingStateSpace.findInitialZero();
        
        
        //Test Case 4
        StateSpace startingStateSpace = new StateSpace(7,7);
        startingStateSpace.board[0][4].setTileMark("2");
        startingStateSpace.board[0][4].available = false;
        startingStateSpace.board[6][0].setTileMark("1");
        startingStateSpace.board[6][0].available = false;
        startingStateSpace.board[5][3].setTileMark("0");
        startingStateSpace.board[5][3].available = false;
        startingStateSpace.findInitialZero();

        Search start = new Search();
        start.runAlgorithm(startingStateSpace);
        
    }    
    
}
