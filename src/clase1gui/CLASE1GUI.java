/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1gui;


/**
 *
 * @author PERSONAL
 */
public class CLASE1GUI {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        JFrame ventana1 = new JFrame();
        ventana1.setVisible(true);
        ventana1.setSize(400,400);
        ventana1.setLocation(100, 100);
        ventana1.setTitle("Ventana 1");
        //ventana1.dispose();
        //ventana1.setLayout(new FlowLayout());
        ventana1.setLayout(new GridLayout(3,3));
        for(int i = 1 ; i<=9; i++)
        {
            ventana1.add(new JButton(""+i));
        }
        JTextField texto1 = new JTextField();
        texto1.setBounds(10, 40, 10, 10);
        JButton b1 = new JButton();
        b1.setText("ACEPTAR");
        ventana1.add(texto1, BorderLayout.NORTH);
        ventana1.add(b1, BorderLayout.SOUTH);
        
        ventana1.add(b1);
         */
        new VentanaSuma();

    }

}
