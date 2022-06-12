/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author PERSONAL
 */
public class VentanaSuma extends JFrame implements ActionListener {

    private JLabel etiqueta1, etiqueta2;
    private JTextField numero1, numero2, respuesta;
    private JButton suma;

    public VentanaSuma() {
       

        etiqueta1 = new JLabel();
        etiqueta1.setText("Ingrese un Numero");
        numero1 = new JTextField();
        etiqueta2 = new JLabel("Ingrese un Numero");
        numero2 = new JTextField();
        suma = new JButton("SUMA");
        respuesta = new JTextField();
        
        etiqueta1.setBounds(10, 20, 200, 30);
        numero1.setBounds(130, 20, 200, 30);
        etiqueta2.setBounds(10, 50, 200, 30);
        numero2.setBounds(130, 50, 200, 30);
        suma.setBounds(130, 80, 200, 30);
        respuesta.setBounds(130, 110, 200, 30);

        this.add(etiqueta1);
        this.add(numero1);
        this.add(etiqueta2);
        this.add(numero2);
        this.add(suma);
        this.add(respuesta);
        suma.addActionListener(this);

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == suma) {
            suma();
        }
     
    }
    public void suma() {
        respuesta.setText(String.valueOf(Integer.valueOf(numero1.getText())
                +Integer.valueOf( numero2.getText())));
    }

}
