package interfaz;

import dominio.*;
import java.awt.event.*;
import javax.swing.*;

public class Interfaz extends JFrame {

	private JTextField tournament_id, court, surface, round_imp, best_of, player0, player1; 
	private JButton boton;
	private JLabel winner;

	public Interfaz() {
    	super("Aplicación Aprendizaje Automático");
        setLayout(null);

        JLabel t = new JLabel("TOURNAMENT ID");
        t.setBounds(20, 20, 220, 40);
        add(t);

        tournament_id = new JTextField(15);
        tournament_id.setBounds(140, 20, 300, 40);
        add(tournament_id);
       
        JLabel c = new JLabel("COURT");
        c.setBounds(20, 60, 220, 40);
        add(c);
        
        court = new JTextField(10);
        court.setBounds(90, 60, 350, 40);
        add(court);
        
        JLabel s = new JLabel("SURFACE");
        s.setBounds(20, 100, 220, 40);
        add(s);
        
        surface = new JTextField(15);
        surface.setBounds(90, 100, 350, 40);
        add(surface);
        
        JLabel r = new JLabel("ROUND IMPORTANCE");
        r.setBounds(20, 140, 220, 40);
        add(r);
        
        round_imp = new JTextField(1);
        round_imp.setBounds(170, 140, 270, 40);
        add(round_imp);
        
        JLabel b = new JLabel("BEST OF");
        b.setBounds(20, 180, 220, 40);
        add(b);
        
        best_of = new JTextField(1);
        best_of.setBounds(90, 180, 350, 40);
        add(best_of);
        
        JLabel p0 = new JLabel("PLAYER 0");
        p0.setBounds(20, 220, 220, 40);
        add(p0);
        
        player0 = new JTextField(80);
        player0.setBounds(90, 220, 350, 40);
        add(player0);

        JLabel p1 = new JLabel("PALYER 1");
        p1.setBounds(20, 260, 220, 40);
        add(p1);
        
        player1 = new JTextField(80);
        player1.setBounds(90, 260, 350, 40);
        add(player1);

        boton = new JButton("REALIZAR CONSULTA");
        boton.setBounds(190, 305, 150, 40);
        add(boton);

        boton.addActionListener(new OyenteBoton());

        JLabel w = new JLabel("El GANADOR ES EL JUGADOR:");
        w.setBounds(600, 100, 220, 40);
        add(w);

        winner = new JLabel();
        winner.setBounds(690, 125, 180, 40);
        add(winner);

        setSize(950, 375);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

  	private class OyenteBoton implements ActionListener {
    	@Override
        public void actionPerformed(ActionEvent e) {
            Consulta c1 = new Consulta(Integer.parseInt(tournament_id.getText()), court.getText(), surface.getText(), 
            	Integer.parseInt(round_imp.getText()), Integer.parseInt(best_of.getText()),
            	Integer.parseInt(player0.getText()), Integer.parseInt(player1.getText()));
            	System.out.println(c1);
            	Modelo modelo = new Modelo();
				modelo.aprenderModelo();
				String resultado = modelo.aplicarModelo(c1);
            if(resultado.isEmpty()) {
                winner.setText("ERROR");
            }
            else {
                winner.setText(resultado);              
            }
        }
    }
}
