/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class Horarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingresar un hora");
       int Horas = entrada.nextInt();
       int clase = 0;
       
       if(Horas == 6){
           clase = Horas;
           System.out.println("Me levanto a las " + clase + " de la mañana, para prepararme a tomar mis clases");
           
       } else if(Horas == 7){
           clase = Horas;
           System.out.println("Clases de administracion " + clase + " de la mañana");
           
       } else if (Horas >= 8 && Horas < 10 ){
           clase = Horas;
           System.out.println("Clases de Organizacion " + clase + " de la mañana");
           
       }else if (Horas >= 10 && Horas < 12){
           clase = Horas;
           System.out.println("Clases de Física, a las " + clase + " de la mañana");
           
       }else if (Horas >= 12 && Horas < 13){
           clase = Horas;
           System.out.println("Clases Herramienta de la computación, a las " + clase + " del medio día");
           
       }else if (Horas >= 13 && Horas < 15){
           clase = Horas;
           System.out.println("A las " + clase + " de la tarde, almuerso con mis padres");
           
       }else if (Horas >= 15 && Horas < 17){
           clase = Horas;
           System.out.println("A las " + clase + " de la tarde, me pongo hacer mi tarea");
           
       }else if (Horas >= 17 && Horas < 20 ){
           clase = Horas;
            System.out.println("A las " + clase + " de la tarde noche, salgo hacer ejercicio o a jugar futbol con los panas");
           
       }else if (Horas >= 20 && Horas < 21 ){
           clase = Horas;
            System.out.println("A las " + clase + " de la noche, me baño");
           
       }else if (Horas >= 21 && Horas < 22 ){
           clase = Horas;
            System.out.println("A las " + clase + " de la noche, ceno viendo una seri o pelicula");
           
       }else if (Horas >= 22 && Horas < 23 ){
           clase = Horas;
            System.out.println("A las " + clase + " me acuesto a dormir");
           
       }else if (Horas >= 1 && Horas <= 5 ){
           clase = Horas;
            System.out.println("A la(s)" + clase + " de la madrugada, aun sigo durmiendo");
           
       }
        System.out.println("Ingresar un numero de la semana");
       int NumDia = entrada.nextInt();
       int Dias = 0;
       
       if (NumDia == 1){
           NumDia = Dias;
           System.out.println("Es lunes día habil");
       }else if (NumDia == 2){
           NumDia = Dias;
           System.out.println("Es martes día habil");
       }else if (NumDia == 3){
           NumDia = Dias;
           System.out.println("Es miercoles día habil");
       }else if (NumDia == 4){
           NumDia = Dias;
           System.out.println("Es jueves día habil");
       }else if (NumDia == 5){
           NumDia = Dias;
           System.out.println("Es viernes día habil");
       }else if (NumDia == 6){
           NumDia = Dias;
           System.out.println("Es sabado día inhabil");
       }else if (NumDia == 7){
           NumDia = Dias;
           System.out.println("Es domingo día inhabil");
           
       }
       
       
       System.out.println("Ingresa el numero del mes");
       int NumMes = entrada.nextInt();
       switch (NumMes)
       {
        case 1: case 2: case 3:
          System.out.println("Primer trimestre");
          break;
        
        case 4: case 5: case 6:
          System.out.println("Segundo trimestre");
          break;
        
        case 7:  case 8: case 9:
          System.out.println("Trecer trimestre");
          break;
        
        case 10: case 11: case 12:
          System.out.println("Cuarto trimestre");
          break;
        
        default:  
            System.out.println("Error de valor " + NumMes);
       }
    }
    
}
