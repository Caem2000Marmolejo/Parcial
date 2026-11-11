package vista;
import logica.Parcial;


import javax.swing.*;
import java.awt.*;

public class FPrincipal extends JFrame {

	    private JTextField txtA;
	    private JTextField txtB;
	    private JTextField txtC;
	    private JTextArea txtResultado;
	    private JButton botonCalcular;

	    public FPrincipal() {
	        setTitle("Examen Carlos Espinosa");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(5, 2, 5, 5));

	        panel.add(new JLabel("Valor de a:"));
	        txtA = new JTextField();
	        panel.add(txtA);

	        panel.add(new JLabel("Valor de b:"));
	        txtB = new JTextField();
	        panel.add(txtB);

	        panel.add(new JLabel("Valor de c:"));
	        txtC = new JTextField();
	        panel.add(txtC);

	        botonCalcular = new JButton("Calcular");
	        panel.add(botonCalcular);

	        panel.add(new JLabel(""));

	        txtResultado = new JTextArea();
	        txtResultado.setEditable(false);

	        add(panel, BorderLayout.NORTH);
	        add(new JScrollPane(txtResultado), BorderLayout.CENTER);

	        botonCalcular.addActionListener(e -> calcular());

	        setVisible(true);}
	    

	    private void calcular() {
	        try {
	            double a = Double.parseDouble(txtA.getText());
	            double b = Double.parseDouble(txtB.getText());
	            double c = Double.parseDouble(txtC.getText());

	            Parcial p = new Parcial();
	            String resultado = p.calcularRaices(a, b, c);

	            txtResultado.setText(resultado);

	        } 
	        	catch (Exception ex) {
	        	    JOptionPane.showMessageDialog(
	        	            this,
	        	            ex.getMessage(),
	        	            "Error",
	        	            JOptionPane.ERROR_MESSAGE);
	        	}
	    }
	    public static void main(String[] args) {
	        new FPrincipal();
	    }
}


