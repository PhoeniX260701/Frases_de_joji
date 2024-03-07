import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Frases_de_Joji extends JFrame {

    private List<String> frasesJoji;
    private int indiceFraseActual;

    private JLabel etiquetaFrase;
    private JButton botonCambiarFrase;
    private JButton botonCerrar;

    public Frases_de_Joji() {
        setTitle("Frases de Joji");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializa las frases y las mezcla
        frasesJoji = obtenerFrasesJoji();
        Collections.shuffle(frasesJoji);
        indiceFraseActual = 0;

        etiquetaFrase = new JLabel("Frase " + (indiceFraseActual + 1) + ": " + frasesJoji.get(indiceFraseActual));
        botonCambiarFrase = new JButton("Cambiar Frase");
        botonCerrar = new JButton("Cerrar");

        botonCambiarFrase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarFraseAleatoria();
            }
        });

        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana
            }
        });

        JPanel panel = new JPanel();
        panel.add(etiquetaFrase);
        panel.add(botonCambiarFrase);
        panel.add(botonCerrar);

        add(panel);
    }

    private List<String> obtenerFrasesJoji() {
        List<String> frases = new ArrayList<>();
        // Agrega tus frases de Joji aquí
        frases.add("No.1: Eres el único que puede entender mi corazón. - Canción: Sanctuary.");
        frases.add("No.2: Dices que lo sientes, pero no te creo. - Canción: Demons.");
        frases.add("No.3: Me quedo con los demonios que ya conozco. - Canción: Demons.");
        frases.add("No.4: Te extraño en el silencio de la noche. - Canción: Your Man.");
        frases.add("No.5: Me dices que estoy loco, pero eso no es noticia. - Canción: Run.");
        frases.add("No.6: Caminamos por la línea delgada entre el amor y el odio. - Canción: Run");
        frases.add("No.7: Me preguntas por qué estoy solo, pero tú ya lo sabes. - Canción: Yeah Right");
        frases.add("No.8: Todas las noches, lloro en la bañera. - Canción: Will He");
        frases.add("No.9: Dices que la vida es una broma, pero yo no estoy riendo. - Canción: Yeah Right");
        frases.add("No.10: ¿Por qué te fuiste? No lo entiendo. - Canción: Will He");
        frases.add("No.11: Mis lágrimas caen como la lluvia en noviembre. - Canción: Will He");
        frases.add("No.12: Tu amor es una jaula, necesito ser liberado. - Canción: SLOW DANCING IN THE DARK");
        frases.add("No.13: Me ahogo en las lágrimas que nunca derramé. - Canción: Will He");
        frases.add("No.14: Te vi en un sueño, ahora eres mi pesadilla. - Canción: SLOW DANCING IN THE DARK");
        frases.add("No.15: Estoy atrapado en el pasado, pero tú eres mi futuro. - Canción: Ew");
        return frases;
    }

    private void cambiarFraseAleatoria() {
        Random random = new Random();
        indiceFraseActual = random.nextInt(frasesJoji.size());
        etiquetaFrase.setText("Frase " + (indiceFraseActual + 1) + ": " + frasesJoji.get(indiceFraseActual));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frases_de_Joji().setVisible(true);
            }
        });
    }
}
