/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgit;

/**
 *
 * @author Sebastien Stebenne
 */
public class TestGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Je suis senser travailler sur une seconde branch");
        
       Integer[] t = new Integer[10];
        
        for(int i = 0; i < t.length; i++){
            
            t[i] = i + 2;
        }
        
        for(int i = 0; i < t.length ; i++){
            
            System.out.println("Un nombre : " + t[i]);
        }
        
        
    }
    
    private void Deux(){
        
        System.out.println("Je s le branch de seb");

    }
    
    private void Changement(){
        
        System.out.println("Je suis un changement dans le branch de seb");
       
    }
    
}
