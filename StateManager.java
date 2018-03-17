/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilegame;

/**
 *
 * @author garry
 */
public class StateManager {
    private static  State currentState=null;
    
    public void setState(State state){
   currentState=state;
    }
     public State getState(){
   return currentState;
    }
}
