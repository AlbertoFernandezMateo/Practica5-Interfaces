package Ejercicio7;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Calculadora del ejercicio 7.
 * Método de eventos: FocusListener, con focusGained y focusLost en los dos campos.
 */
public class Calculadora extends JFrame implements FocusListener {

    private final JTextField campoPrimerNumero;
    private final JTextField campoSegundoNumero;
    private final JTextField campoResultado;

    public Calculadora() {
        setTitle("Ejercicio 7 - Suma al cambiar el foco");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 420, 220);
        setLayout(null);
        this.setVisible(true);

        campoPrimerNumero = new JTextField();
        campoSegundoNumero = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);

        campoPrimerNumero.setBounds(30, 30, 150, 30);
        campoSegundoNumero.setBounds(220, 30, 150, 30);
        campoResultado.setBounds(125, 100, 150, 30);

        campoPrimerNumero.setToolTipText("Primer número");
        campoSegundoNumero.setToolTipText("Segundo número");
        campoResultado.setToolTipText("Resultado de la suma");

        campoPrimerNumero.addFocusListener(this);
        campoSegundoNumero.addFocusListener(this);

        add(campoPrimerNumero);
        add(campoSegundoNumero);
        add(campoResultado);
    }

    private void sumar() {
        String primerTexto = campoPrimerNumero.getText().trim();
        String segundoTexto = campoSegundoNumero.getText().trim();

        if (primerTexto.isEmpty() || segundoTexto.isEmpty()) {
            campoResultado.setText("");
            return;
        }

        try {
            double primerNumero = Double.parseDouble(primerTexto);
            double segundoNumero = Double.parseDouble(segundoTexto);
            campoResultado.setText(String.valueOf(primerNumero + segundoNumero));
        } catch (NumberFormatException e) {
            campoResultado.setText("");
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        sumar();
    }

    @Override
    public void focusLost(FocusEvent e) {
        sumar();
    }


}
