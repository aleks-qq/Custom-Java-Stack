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

  public int annaSilmäluku() {
      nopanheitto = (1 + (int) (Math.random() *6));
      heitto++;
     
     
      return nopanheitto;
   
  }
  public int yhteensä(){
      return heitto;
  }
}


