package Ejercicio2;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DetectorClicks extends JFrame implements MouseListener {
    public DetectorClicks() {
        this.setTitle("Click Izquierdo o Derecho");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,10,500,350);
        this.addMouseListener(this);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            JOptionPane.showMessageDialog(null, "Has presionado el boton Izquierdo");
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            JOptionPane.showMessageDialog(null, "Has presionado el boton Derecho");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
