package tugasform;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RumahMakan extends JFrame{
    JLabel lblnama=new JLabel("Nama");
    JTextField txnama=new JTextField(20);    
    JLabel lblpesanan=new JLabel("Pesanan");    
    JTextField txpesanan=new JTextField(7);    
    JLabel lblpilih=new JLabel("Pilih");    
    JRadioButton bungkus=new JRadioButton("Bungkus");    
    JRadioButton makan=new JRadioButton("Makan Disini");    
    ButtonGroup pilihpkt=new ButtonGroup();    
    JLabel lblpaket=new JLabel("Paket");    
    JCheckBox satu=new JCheckBox("Paket 1");    
    JCheckBox dua=new JCheckBox("Paket 2");    
    JCheckBox tiga=new JCheckBox("Paket 3");    
    JButton cetak=new JButton("Pesan");    
    JTextArea hasil=new JTextArea(); 
 
   RumahMakan()    {       
       setTitle("Rumah Makan");
       setLocation(300,100);       
       setSize(300,320);       
       setDefaultCloseOperation(pbo5d2.JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblnama);       
       lblnama.setBounds(10,10,80,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(105,10,175,20);       
       getContentPane().add(lblpesanan);       
       lblpesanan.setBounds(10,33,175,20);       
       getContentPane().add(txpesanan);       
       txpesanan.setBounds(105,33,175,20);       
       getContentPane().add(lblpilih);       
       lblpilih.setBounds(10,56,80,20);       
       pilihpkt.add(bungkus);       
       pilihpkt.add(makan);      
       getContentPane().add(bungkus);      
       bungkus.setBounds(60,56,80,20);       
       getContentPane().add(makan); 
       makan.setBounds(160,56,100,20);       
       getContentPane().add(lblpaket);       
       lblpaket.setBounds(10,80,70,20);       
       getContentPane().add(satu);       
       satu.setBounds(105,80,100,20);       
       getContentPane().add(dua);       
       dua.setBounds(105,103,100,20);       
       getContentPane().add(tiga);       
       tiga.setBounds(105,126,100,20);       
       getContentPane().add(cetak);       
       cetak.setBounds(10,150,270,20);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,180,270,100);       
       setVisible(true);    
   } 
 
   void AksiReaksi(){
       cetak.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hasil.append(txnama.getText()+"\n");  
                hasil.append(txpesanan.getText()+"\n");            
                if(bungkus.isSelected()==true){                
                    hasil.append(bungkus.getText()+"\n");            
                }             
                else{                
                    hasil.append(makan.getText()+"\n");             
                }
                if(satu.isSelected()==true){               
                    hasil.append(satu.getText()+"\n");             
                }             
                if(dua.isSelected()==true){  
                    hasil.append(dua.getText()+"\n");             
                }         
                if(tiga.isSelected()==true){           
                    hasil.append(tiga.getText()+"\n");             
                } 
            }       
       });    
    }
   public static void main(String args[])    {       
       RumahMakan e5=new RumahMakan();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
    } 
    
}
