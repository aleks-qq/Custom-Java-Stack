/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drank
 */


public class Noppa {
public int heitto;
private int nopanheitto;

  public int annaSilm�luku() {
      nopanheitto = (1 + (int) (Math.random() *6));
      heitto++;
     
     
      return nopanheitto;
   
  }
  public int yhteens�(){
      return heitto;
  }
}


