/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drank
 */


public class NopanOhjain {

  private Noppa malli;
  private NopanGUI n�kym�;

  public NopanOhjain(Noppa malli, NopanGUI n�kym�) {
    this.malli = malli;
    this.n�kym� = n�kym�;
  }

  public static void main(String[] args) {
    Noppa malli = new Noppa();
    NopanGUI n�kym� = new NopanGUI();
    NopanOhjain ohjain = new NopanOhjain(malli, n�kym�);
    n�kym�.rekister�iOhjain(ohjain);
  }

  public void heitto() {
    int asd = malli.annaSilm�luku();
     
    n�kym�.asetaSilm�luku(asd);
    n�kym�.asetaHeitot(malli.yhteens�());
    n�kym�.muutaKuva(asd);
  }

}

