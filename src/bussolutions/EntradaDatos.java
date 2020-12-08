/*
Universidad fidélitas
Cristopher Navarro Guevara
Introducción a la programación
BusSolutions main
11/11/2020
 */
package bussolutions;

import javax.swing.JOptionPane;

public class EntradaDatos 
{
    
    private int cedula;
    private String nombre = "";
    private int NoTelefono;
    private String correo = "";
    private double salario = 450000;
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoTelefono() {
        return NoTelefono;
    }

    public void setNoTelefono(int NoTelefono) {
        this.NoTelefono = NoTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        //Entrada de datos
    public void EntradaDatos(){
               
    nombre = JOptionPane.showInputDialog(null,"Digite su nombre completo: ");
    cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su cédula de identidad: "));
    NoTelefono = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su número de telefono: "));
    correo = JOptionPane.showInputDialog(null,"Digite su correo electrónico: ");
       
}
      public void SalidaDatos(){
   
    
    JOptionPane.showMessageDialog(null,"\nSus datos: "
            + "\nNombre: "+nombre+""
                    + "\nCédula: "+cedula+""
                            + "\nTeléfono: "+NoTelefono+""
                                    + "\nCorreo: "+correo+""
                                            + "\nSalario: "+salario);
    
    
    
    
    }
    }
      

