
package stackprojekti;

public class Stack {

    private ListItem top, apu;
    private int size;

    //muodostetaan uusi alkio ja viedään pinon huipulle

    public void push(String data) {
        ListItem newItem = new ListItem();
        newItem.setData(data);
        newItem.setNext(top);// kytketään uusi alkio aikasempaan huippualkioon
        top = newItem;//uusi alkio on pinon huippualkio
        size++;
    }
    //poistetaan alkio pinon huipulta, jos pinossa ei ole alkoita palautetaan null

    public ListItem pop() {
        if (size>0) size--;
        if (top.getNext() == null) {
            return null;
        }
        apu = top;
        top = top.getNext();   
        return apu;
    }

    public int getSize() {
        return size;
    }
    
    //listataan pinon sisältö
    public void printItems() {
        apu = top;
        for (int i = 0; i < this.size; i++) {
            System.out.println(top.getData());
            if (top.getNext() != null) {
                top = top.getNext();
            }
        }
        top = apu;
    }
}
