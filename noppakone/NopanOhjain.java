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
  private NopanGUI näkymä;

  public NopanOhjain(Noppa malli, NopanGUI näkymä) {
    this.malli = malli;
    this.näkymä = näkymä;
  }

  public static void main(String[] args) {
    Noppa malli = new Noppa();
    NopanGUI näkymä = new NopanGUI();
    NopanOhjain ohjain = new NopanOhjain(malli, näkymä);
    näkymä.rekisteröiOhjain(ohjain);
  }

  public void heitto() {
    int asd = malli.annaSilmäluku();
     
    näkymä.asetaSilmäluku(asd);
    näkymä.asetaHeitot(malli.yhteensä());
    näkymä.muutaKuva(asd);
  }

}

