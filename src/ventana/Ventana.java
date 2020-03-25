/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class Ventana extends JFrame implements ActionListener{
    
    JButton boton;
    JTextField cajaR,cajaG,cajaB;
    
    
    public Ventana(){
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        boton = new JButton("Hola mundo");
        this.setLayout(null);
        boton.setBounds(140, 240, 200, 100);
        this.add(boton);
        boton.addActionListener(this);
        cajaR = new JTextField();
        cajaG = new JTextField();
        cajaB = new JTextField();
        cajaR.setBounds(50,100,100,100);
        cajaG.setBounds(200,100,100,100);
        cajaB.setBounds(350,100,100,100);
        this.add(cajaR);
        this.add(cajaB);
        this.add(cajaG);
        
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(this, "Hola :D ");
        int b = Integer.valueOf(cajaB.getText());
        int r = Integer.valueOf(cajaR.getText());
        int g = Integer.valueOf(cajaG.getText());
        
        Color azulfuerte = new Color(r,g,b);
        boton.setBackground(azulfuerte);
    }
}
