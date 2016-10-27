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
public class Search {
    
    
    public void runAlgorithm(StateSpace startStateSpace){
        
        
        StateSpace workingStateSpace = startStateSpace;
        
        List<StateSpace> fringe = new ArrayList<StateSpace>();        
        fringe.add(workingStateSpace);
        
        while(!fringe.isEmpty() && !workingStateSpace.isCompleted()){
            workingStateSpace = fringe.get(fringe.size()-1);
            fringe.remove(fringe.size()-1);
            workingStateSpace.printBoard();
            workingStateSpace.generateChildrenStateSpaces();
            System.out.println("Num of children is: " + workingStateSpace.children.size());
            for(int i = workingStateSpace.children.size()-1; i >= 0; i--){
                fringe.add(workingStateSpace.children.get(i));
            }        
        }
        workingStateSpace.printBoard();
    }
    
}
