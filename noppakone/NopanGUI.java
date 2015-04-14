/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drank
 */
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class NopanGUI extends JFrame {

    private NopanOhjain ohjain;
    private JPanel sis�lt�paneeli;
    private JButton heittopainike;
    private JLabel tulosselite, tulosselite2;
   
    public int a = 0;
    public NopanGUI() {
        alustaKomponentit();
    }

    public void rekister�iOhjain(NopanOhjain ohjain) {
        this.ohjain = ohjain;
    }

    private void alustaKomponentit() {
        setTitle("Konenoppa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sis�lt�paneeli = new JPanel();
        heittopainike = new JButton("Heit� noppaa");
        if (a==0) {
            tulosselite = new JLabel("0");
            tulosselite2 = new JLabel("0");
            a++;
        }
       
        sis�lt�paneeli.add(heittopainike);
        sis�lt�paneeli.add(tulosselite);
        sis�lt�paneeli.add(tulosselite2);
        setContentPane(sis�lt�paneeli);
        //
        try{
        BufferedImage nopanKuva = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_1.png"));
        BufferedImage nopanKuva2 = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_2.png"));
        BufferedImage nopanKuva3 = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_3.png"));
        BufferedImage nopanKuva4 = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_4.png"));
        BufferedImage nopanKuva5 = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_5.png"));
        BufferedImage nopanKuva6 = ImageIO.read(new File("C:\\Users\\drank\\Documents\\Javajatko\\nopatGUI\\die_face_6.png"));
       
        JLabel picLabel = new JLabel(new ImageIcon(nopanKuva));
        add(picLabel);
        remove(picLabel);
       
       
        }
        catch (IOException e){
            System.out.println("ei natsaa");
        }
        heittopainike.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                ohjain.heitto();
            }
        });

        setSize(600, 400);
        setVisible(true);
    }

    public void asetaSilm�luku(int silm�luku) {
        tulosselite.setText(String.valueOf(silm�luku));
        alustaKomponentit();
       
       
    }
    public void asetaHeitot(int silm�luku) {
        tulosselite2.setText(String.valueOf(silm�luku));
       
    }
   
    public void muutaKuva(int luku) {
       
     try{
            String juttu="";
           
            if (luku==1) {
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_1.png";
            }
            else if (luku ==2){
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_2.png";
            }
            else if (luku ==3){
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_3.png";
            }
            else if (luku ==4){
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_4.png";
            }
            else if (luku ==5){
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_5.png";
            }
            else{
                juttu = "Z:\\koodi\\javajatko\\noppakone\\die_face_6.png";
            }
        BufferedImage nopanKuva = ImageIO.read(new File(juttu));
            JLabel picLabel = new JLabel();
           
           
         
       
      
          
       
       

       
       picLabel = new JLabel(new ImageIcon());
       
                    
                picLabel = new JLabel(new ImageIcon(nopanKuva));
                    
                    
                    
                     add(picLabel);
                    
            
             
       
        
       }
        catch (IOException e){
            System.out.println("ei natsaa");
        }
    }

  
   
}


