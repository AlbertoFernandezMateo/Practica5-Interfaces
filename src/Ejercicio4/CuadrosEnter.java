package Ejercicio4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuadrosEnter extends JFrame implements ActionListener {

    private JTextField campoTexto;
    private JPasswordField campoPassword;

    public CuadrosEnter() {

        this.setTitle("Detectar Enter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 10, 500, 400);
        this.setLayout(null);
        this.setVisible(true);


        campoTexto = new JTextField();
        campoPassword = new JPasswordField();

        campoTexto.setBounds(100, 100, 250, 30);
        campoPassword.setBounds(100, 180, 250, 30);

        campoTexto.addActionListener(this);
        campoPassword.addActionListener(this);

        this.add(campoTexto);
        this.add(campoPassword);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "cuadro1: " + campoTexto.getText() +
                        "\ncuadro2: " + new String(campoPassword.getPassword()));
    }

}
