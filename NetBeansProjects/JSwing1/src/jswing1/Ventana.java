/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswing1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author FP
 */
public class Ventana {
    
    JFrame ventana = new JFrame(); //objeto tipo jframe
    JPanel panel = new JPanel(); //Objeto tipo Jpanel
    
    public Ventana(){//constructor vacio
    
        ventana.setVisible(true); //para que la ventana sea visible
        ventana.setSize(500, 500); //para cambiar el tamaño de la pantalla
        //ventana.setResizable(false); para permitir que cambie el tamaño de la pantalla
        
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //No funciona el cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Se cierra al darle a la X, default
        ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Se minimiza al darle a la X
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Elimina al darle a la X (solo una ventana)
        
        ventana.setLocation(0, 0);//Ubicación de la pantalla
        
        ventana.getContentPane().setBackground(Color.red); //getcontentpane para acceder al contenido de la ventana
        }
        public void Panel(){
        panel.setBackground(Color.blue); //color azul de fondo
        ventana.add(panel); //Para añadir un elemento a otro
        panel.setMinimumSize(new Dimension(50, 50)); //Tamaño minimo
        panel.setLayout(new FlowLayout()); //Alinea de arriba abajo hacia la izquierda (el más normal)
        panel.setLayout(new BorderLayout()); //Norte sur este oeste centro
        panel.setLayout(new GridLayout()); //Una cuadrícula predefinida
        panel.setLayout(new GridBagLayout()); //Cuadrícula flexible
        panel.setLayout(new BoxLayout(panel, 0)); //Por coordenadas
        }
    
    
}
