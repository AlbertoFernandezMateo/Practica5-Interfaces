package Ejercicio3;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MoverOArrastrar extends JFrame{

    public MoverOArrastrar(){
        this.setTitle("Ventana para ser clickeada");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,10,500,350);
        this.setVisible(true);

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Estas arrastrando el ratón");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Estas moviendo el ratón");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


    }


}