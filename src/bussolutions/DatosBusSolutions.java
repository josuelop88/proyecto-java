/*
Universidad fidélitas
Cristopher Navarro Guevara
Introducción a la programación
BusSolutions main
11/11/2020
 */
package bussolutions;

import javax.swing.JOptionPane;

public class DatosBusSolutions 
{
       //menu principal
public void menuPrincipal(){

int opcion;
do{

opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\n¡BusSolutionsCompany!"
        + "\nDigite su ruta"
        + "\n1. "+origen1+""
                + "\n2. "+origen2+""
                        + "\n3. "+origen3+""
                                + "\n4. "+origen4+""
                                        + "\n0. Siguiente"));

switch (opcion){

    case 1:
       JOptionPane.showMessageDialog(null,"\nSu ruta es: "+origen1+""
               + "\nSu autobus es: MC2077"
               + "\nLa capacidad es: +52 pasajeros"
               + "\nEl precio por persona es de: 525.00 colones");
       break;
    case 2:
               JOptionPane.showMessageDialog(null,"\nSu ruta es: "+origen2+""
               + "\nSu autobus es: MC200"
               + "\nLa capacidad es: +50 pasajeros"
               + "\nEl precio por persona es de: 575.00 colones");
               break;
    case 3:
               JOptionPane.showMessageDialog(null,"\nSu ruta es: "+origen3+""
               + "\nSu autobus es: MC255"
               + "\nLa capacidad es: +53 pasajeros"
               + "\nEl precio por persona es de: 625.00 colones");
               break;
    case 4:
               JOptionPane.showMessageDialog(null,"\nSu ruta es: "+origen4+""
               + "\nSu autobus es: MC278"
               + "\nLa capacidad es: +57 pasajeros"
               + "\nEl precio por persona es de: 725.00 colones");
         break;

}
}while(opcion!=0);





}
   //atributos
    private String origen1 = "Cartago-San José";
    private String origen2 = "San José-Heredia";
    private String origen3 = "Agua Caliente-Cartago";
    private String origen4 = "Guanacaste-Puntarenas";


//sets y gets 
    public String getOrigen1() {
        return origen1;
    }

    public void setOrigen1(String origen1) {
        this.origen1 = origen1;
    }

    public String getOrigen2() {
        return origen2;
    }

    public void setOrigen2(String origen2) {
        this.origen2 = origen2;
    }

    public String getOrigen3() {
        return origen3;
    }

    public void setOrigen3(String origen3) {
        this.origen3 = origen3;
    }

    public String getOrigen4() {
        return origen4;
    }

    public void setOrigen4(String origen4) {
        this.origen4 = origen4;
    }
    
    

}
