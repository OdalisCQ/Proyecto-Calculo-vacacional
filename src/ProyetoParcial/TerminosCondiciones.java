package ProyetoParcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerminosCondiciones extends JFrame implements ActionListener {
    private JLabel ETitulo;
    private JTextArea terminos;
    private JCheckBox aceptarTerminos;
    private JButton continuarBtn;
    private JButton noAceptarBtn;
    private final String nombreUsuario;
    

    public TerminosCondiciones(String nombreUsuario) {
     this.nombreUsuario = nombreUsuario;
        setTitle("Terminos Y Condiciones");
        setBounds(700, 300, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
      
        Image icon = Toolkit.getDefaultToolkit().getImage("logo1.jpg");
        setIconImage(icon);

        ingresar(nombreUsuario);

        continuarBtn.addActionListener(this);
        noAceptarBtn.addActionListener(e -> volverBienvenida());
    }

        void ingresar(String nombreUsuario) {
            
            
        ETitulo = new JLabel("TERMINOS Y CONDICIONES");
        ETitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ETitulo.setForeground(Color.BLACK);
        getContentPane().setBackground(Color.WHITE);
        ETitulo.setBounds(150, 30, 300, 30); 
        add(ETitulo);

        terminos = new JTextArea("\n\n\tBienvenido a Marias. Estos términos y condiciones describen las reglas\n\t y regulaciones para el uso del sitio web Marías.\n\n "
                               + "     1. Estos terminos y condiciones son con fines educativos\n"
                               + "      2. Debe leer detenidamente cada termino antes de aceptar\n"
                               + "      3. Puede volver a la pantalla anterior si no acepta"
                               + "                                       ");
        terminos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(terminos);
        terminos.setFont(new Font("Arial", Font.BOLD, 12));
        scrollPane.setBounds(20, 80, 540, 150);
        add(scrollPane);

        aceptarTerminos = new JCheckBox("Yo " + nombreUsuario + " acepto los terminos y condiciones");
        aceptarTerminos.setBounds(20, 260, 350, 20);
        add(aceptarTerminos);

        continuarBtn = new JButton("Continuar");
        continuarBtn.setBackground(Color.GREEN);
        continuarBtn.setForeground(Color.BLACK);
        continuarBtn.setBounds(20, 300, 100, 30);
        continuarBtn.setEnabled(false); 
        add(continuarBtn);

        noAceptarBtn = new JButton("No aceptar");
        noAceptarBtn.setBackground(Color.RED);
        noAceptarBtn.setForeground(Color.BLACK);
        noAceptarBtn.setBounds(150, 300, 100, 30);
        add(noAceptarBtn);

        aceptarTerminos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            continuarBtn.setEnabled(aceptarTerminos.isSelected());
            noAceptarBtn.setEnabled(!aceptarTerminos.isSelected());
            
            }
        });
    }

     void volverBienvenida() {

        new Bienvenida().setVisible(true);
        dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continuarBtn) {
        new PantallaPrincipal(nombreUsuario).setVisible(true); 
        dispose();
        }
    }

    public static void main(String[] args) {
        TerminosCondiciones ventana = new TerminosCondiciones("Usuario");
        ventana.setVisible(true);
    }
}
