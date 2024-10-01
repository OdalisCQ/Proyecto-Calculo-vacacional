package Calculadoras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculadora extends JFrame implements ActionListener{
        //Atributos
        private JLabel ETitulo; //Declarar
        private JLabel ECantidad1;
        private JTextField TxtCantidad1;
        private JLabel ECantidad2;
        private JTextField TxtCantidad2;
        private JButton BtnSumar;
        private JLabel  EResultado;
        private JTextField TxtResultado;
        private JMenuBar mb;
        private JMenu menu1;
        private JMenuItem mi1,mi2,mi3;
         
        //Metodos
        public calculadora() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        mi1=new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);               
    }
        
        public void ingresar(){
               setTitle("CALCULADORA ARITMETICA");
               ETitulo = new JLabel("C a l c u l a d o r a "); //Crear el objeto e Inicializar darle valor 
               ETitulo.setBounds(300,20,500,20); //TamaÃ±o de etiqueta: CFAA
               add(ETitulo);//Agrega la etiqueta al formulario
               
               //Inicializar etiqueta ECantidad1
               ECantidad1 = new JLabel("Ingrese primera cantidad: ");
               ECantidad1.setBounds(50,50,150,20);
               add(ECantidad1);
                
               //Caja de texto TxtCantidad1
               TxtCantidad1 = new  JTextField();
               TxtCantidad1.setBounds(200,50,150,20);
               add(TxtCantidad1);   
                
               //Inicializar etiqueta ECantidad2
               ECantidad2 = new JLabel("Ingrese segunda cantidad: ");
               ECantidad2.setBounds(50,100,200,20);
               add(ECantidad2);
         
               //Caja de texto TxtCantidad2
               TxtCantidad2 = new  JTextField();
               TxtCantidad2.setBounds(200,100,150,20);
               add(TxtCantidad2);    
               
               //Caja de texto resultado
               TxtResultado= new JTextField();
               TxtResultado.setBounds(20,10,15,20);
               
               //Dibujando botones BtnSumar
                BtnSumar = new JButton("S u m a r");
                BtnSumar.setBounds(50,150,100,20);
                add(BtnSumar);
                        
                BtnSumar.addActionListener(this); 
                
                //cierra el formulario
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Container f=this.getContentPane();
        if (e.getSource()==mi1) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        } 
        
        
        if (e.getSource()==BtnSumar) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int suma=x1+x2;
            String total=String.valueOf(suma);
            //setTitle(total);
            
            
           //resultado(total);
            EResultado = new JLabel(total);
            EResultado.setBounds(200,150,150,20);
            add(EResultado); 
            
            TxtResultado = new JTextField(total);
            TxtResultado.setBounds(200,250,100,20);
            TxtResultado.setEnabled(false); //Deshabilitar caja de texto
            add(TxtResultado);
            
    }
    }    
     
        
   //Metodo principalformulario.setVisible(true); //hacerlo visible
    public static void main(String[] args) {
        calculadora formulario = new calculadora();
        //Dimensiones del formulario
        formulario.setBounds(200,10,800,600);
        
        formulario.setLayout(null);//permite poner objetos en cualquier lado del formulario
        formulario.ingresar();//llamar el metodo ingresar()
        formulario.setVisible(true); //hacerlo visible
    }
}