
package ProyetoParcial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Bienvenida extends JFrame implements ActionListener {
    private JLabel ETitulo;
    private JTextField nombreField;
    private JButton continuarBtn;
    private JLabel pie;

    public Bienvenida() {
        setTitle("Bienvenida");
        setBounds(730, 250, 500, 600); 
        setLayout(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setResizable(false);

        Image icon = Toolkit.getDefaultToolkit().getImage("logo1.jpg");
        setIconImage(icon);
        getContentPane().setBackground(Color.BLACK  );
        agregarComponentes();
    }

    // Método para agregar componentes al formulario
    public void agregarComponentes() {
       
        ETitulo = new JLabel("BIENVENIDO AL SISTEMA VACACIONAL");
        ETitulo.setBounds(70, 10, 500, 50); 
        ETitulo.setFont(new Font("Times", Font.BOLD, 18));
        ETitulo.setForeground(Color.YELLOW);
        add(ETitulo);
        
        ImageIcon Logo = new ImageIcon("logo1.jpg");
        Image Original = Logo.getImage(); 
        Image imagendimensionada = Original.getScaledInstance(400, 300, Image.SCALE_SMOOTH); 
        ImageIcon logodimensionado = new ImageIcon(imagendimensionada); 

        JLabel logoLabel = new JLabel(logodimensionado);
        logoLabel.setBounds(50, 40, 400, 300); 
        add(logoLabel); 

        
        JLabel etiqueta = new JLabel("Ingresa tu nombre:");
        etiqueta.setBounds(60, 340, 150, 20); 
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        etiqueta.setForeground(Color.yellow);
        add(etiqueta);

        nombreField = new JTextField();
        nombreField.setBounds(60, 370, 400, 35); 
        nombreField.setForeground(Color.BLACK);
        nombreField.setFont(new Font("Times", Font.BOLD, 16));
        add(nombreField);

        continuarBtn = new JButton("Continuar");
        continuarBtn.setBounds(60, 420, 100, 30); 
        continuarBtn.setBackground(Color.yellow);
        continuarBtn.setForeground(Color.BLACK);
        add(continuarBtn);

        pie = new JLabel("Tienda de ropa 'MARIAS' | Odalis Cajbón | Ingeniería en Sistemas 'D'");
        pie.setBounds(55, 530, 400, 20); 
        pie.setForeground(Color.YELLOW);
        add(pie);

        continuarBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == continuarBtn) {
            String nombre = nombreField.getText().trim();
            if (!nombre.isEmpty()) {
                TerminosCondiciones terminosCondiciones = new TerminosCondiciones(nombre);
                terminosCondiciones.setVisible(true);

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingresa tu nombre.");
            }
        } 
    }

    public static void main(String[] args) {
        Bienvenida ventana = new Bienvenida();
        ventana.setVisible(true); 
    }
}
