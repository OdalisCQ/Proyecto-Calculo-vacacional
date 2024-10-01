
package ProyetoParcial;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PantallaPrincipal extends JFrame implements ActionListener {
    private JLabel ETitulo, ETitulo2;
    private JLabel etiquetaNombre;
    private JLabel etiquetaApellidos;
    private JLabel etiquetaDepartamento;
    private JLabel etiquetaAntiguedad;
    private JTextField nombreTrabajador;
    private JTextField apellidosTrabajador;
    private JTextField resultadoVacaciones;
    private JComboBox<String> departamentoBox;
    private JComboBox<String> antiguedadBox;
    private JButton calcularBtn;
    private JButton limpiarBtn;
    private JButton volverBtn;
    private JMenuBar mb;
    private JMenu menu1,menu2;
    private JMenuItem mi1,mi2,mi3;
    
         
    //Metodos
    public PantallaPrincipal(String nombreUsuario) {
        setTitle("Pantalla Principal");
        setBounds(700, 300, 700, 500); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null); 

        Image icon = Toolkit.getDefaultToolkit().getImage("logo1.jpg");
        setIconImage(icon);
        // Inicializar y agregar componentes
        ingresar(nombreUsuario);
        
        inicializarMenu();
        
        calcularBtn.addActionListener(this);
        limpiarBtn.addActionListener(e -> limpiarCampos());
        
        volverBtn = new JButton("VOLVER");
        volverBtn.setBounds(350,350,200,30);
        volverBtn.addActionListener(e -> volverBienvenida());
        volverBtn.setForeground(Color.BLACK);
        add(volverBtn);
    }

     public void inicializarMenu() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        mi1=new JMenuItem("Negro");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Azul");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Gris");
        mi3.addActionListener(this);
        menu1.add(mi3);    
        
        menu2 = new JMenu("Acerca de");
        mb.add(menu2);
        
        JMenuItem miAcercaDe = new JMenuItem("El Creador");
        miAcercaDe.addActionListener(e -> mostrarInformacion());
        menu2.add(miAcercaDe);
        
    }
     
     
    private void mostrarInformacion(){
        JOptionPane.showMessageDialog(this,"Esto fue desarrollado por\n" +"Odalis CAjbon\n" +"Ingenieria en Sistemas 'A'\n" ,"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        
    }
  
    public void ingresar(String nombreUsuario) {
        
        ImageIcon Logo = new ImageIcon("logo1.jpg");
        Image Original = Logo.getImage(); 
        Image imagendimensionada = Original.getScaledInstance(250, 150, Image.SCALE_SMOOTH); 
        ImageIcon logodimensionado = new ImageIcon(imagendimensionada); 

        JLabel logoLabel = new JLabel(logodimensionado);
        logoLabel.setBounds(10, 20, 250, 150); 
        add(logoLabel); 
       
        ETitulo = new JLabel("Cálculo de Vacaciones");
        ETitulo.setBounds(350, 10, 900, 20);
        ETitulo.setFont(new Font("Times", Font.BOLD, 22));
        ETitulo.setForeground(Color.YELLOW);
        add(ETitulo);

        ETitulo2 = new JLabel("Bienvenido " + nombreUsuario);
        ETitulo2.setBounds(310, 48, 500, 20);
        ETitulo2.setFont(new Font("Times", Font.BOLD, 22));
        ETitulo2.setForeground(Color.YELLOW);
        add(ETitulo2);
        
        etiquetaNombre = new JLabel("Nombre del trabajador:");
        etiquetaNombre.setBounds(50, 190, 150, 20);
        etiquetaNombre.setForeground(Color.YELLOW);
        add(etiquetaNombre);

        nombreTrabajador = new JTextField();
        nombreTrabajador.setBounds(50, 210, 150, 20);
        add(nombreTrabajador);

        etiquetaApellidos = new JLabel("Apellidos del trabajador:");
        etiquetaApellidos.setBounds(50, 260, 150, 20);
        etiquetaApellidos.setForeground(Color.YELLOW);
        add(etiquetaApellidos);

        apellidosTrabajador = new JTextField();
        apellidosTrabajador.setBounds(50, 280, 150, 20);
        add(apellidosTrabajador);

        etiquetaDepartamento = new JLabel("Departamento:");
        etiquetaDepartamento.setBounds(300, 120, 150, 20);
        etiquetaDepartamento.setForeground(Color.YELLOW);
        add(etiquetaDepartamento);

        departamentoBox = new JComboBox<>(new String[]{"","Atención al Cliente", "Logística", "Gerente"});
        departamentoBox.setBounds(400, 120, 150, 20);
        add(departamentoBox);

        etiquetaAntiguedad = new JLabel("Antigüedad:");
        etiquetaAntiguedad.setBounds(300, 170, 150, 20);
        etiquetaAntiguedad.setForeground(Color.YELLOW);
        add(etiquetaAntiguedad);

        antiguedadBox = new JComboBox<>(new String[]{"","1 año", "2 a 6 años", "7 o más años"});
        antiguedadBox.setBounds(400, 170, 150, 20);
        add(antiguedadBox);

        resultadoVacaciones = new JTextField();
        resultadoVacaciones.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoVacaciones);
        resultadoVacaciones.setFont(new Font("Arial", Font.BOLD, 12));
        scrollPane.setBounds(300, 230, 300, 100);
        add(scrollPane);
   
        

        calcularBtn = new JButton("Calcular");
        calcularBtn.setBounds(50, 350, 100, 30);
        add(calcularBtn);

        limpiarBtn = new JButton("Nuevo");
        limpiarBtn.setBounds(170, 350, 100, 30);
        add(limpiarBtn);
    }

    private void limpiarCampos() {
        nombreTrabajador.setText("");
        apellidosTrabajador.setText("");
        resultadoVacaciones.setText("");
        departamentoBox.setSelectedIndex(0);
        antiguedadBox.setSelectedIndex(0);
    }

    private void volverBienvenida() {
        Bienvenida ventanaBienvenida = new Bienvenida();
        ventanaBienvenida.setVisible(true);
        dispose(); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    if (e.getSource() == mi1) { 
        getContentPane().setBackground(Color.BLACK);
    } else if (e.getSource() == mi2) { 
        getContentPane().setBackground(Color.BLUE);
    } else if (e.getSource() == mi3) { 
        getContentPane().setBackground(Color.LIGHT_GRAY);
    } else if (e.getSource() == calcularBtn) {
        
        if (nombreTrabajador.getText().isEmpty()|| apellidosTrabajador.getText().isEmpty()|| departamentoBox.getSelectedItem().equals("")||antiguedadBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this, "Llena todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
        // Acciones para el botón Calcular
        String nombre = nombreTrabajador.getText();
        String apellidos = apellidosTrabajador.getText();
        int diasVacaciones = calcularVacaciones();
        resultadoVacaciones.setText(nombre + " " + apellidos + " tiene derecho a " + diasVacaciones + " días de vacaciones.");
    } 
}
    }

    private int calcularVacaciones() {
        String departamento = (String) departamentoBox.getSelectedItem();
        String antiguedad = (String) antiguedadBox.getSelectedItem();
        
        

        switch (departamento) {
            case "Atención al Cliente":
                switch (antiguedad) {
                    case "1 año":
                        return 6;
                    case "2 a 6 años":
                        return 14;
                    default:
                        return 20;
                }
            case "Logística":
                switch (antiguedad) {
                    case "1 año":
                        return 7;
                    case "2 a 6 años":
                        return 15;
                    default:
                        return 22;
                }
            default:
                // Gerente
                switch (antiguedad) {
                    case "1 año":
                        return 10;
                    case "2 a 6 años":
                        return 20;
                    default:
                        return 30;
                }
        }
    }

    public static void main(String[] args) {
        PantallaPrincipal ventana = new PantallaPrincipal("Usuario");
        ventana.setVisible(true);
        
    }
}

