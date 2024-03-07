import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frases_iconicas_Joji extends JFrame {

    private Frases_de_Joji interfazFrasesJoji;

    public Frases_iconicas_Joji() {
        setTitle("Las frases icónicas de: Joji");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Las frases icónicas de: Joji");
        ImageIcon imagenJoji = new ImageIcon("C:\\Users\\Phoen\\Desktop\\Joji\\91mDjSqe2kL._UF1000,1000_QL80_.jpg"); // Reemplaza con la ruta correcta

        JLabel etiquetaImagen = new JLabel(imagenJoji);
        etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

        JButton botonMostrarFrases = new JButton("Mostrar Frases");
        botonMostrarFrases.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInterfazFrases();
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titulo, BorderLayout.NORTH);
        panel.add(etiquetaImagen, BorderLayout.CENTER);
        panel.add(botonMostrarFrases, BorderLayout.SOUTH);

        add(panel);
    }

    private void mostrarInterfazFrases() {
        if (interfazFrasesJoji == null) {
            interfazFrasesJoji = new Frases_de_Joji();
        }
        interfazFrasesJoji.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frases_iconicas_Joji().setVisible(true);
            }
        });
    }
}
