
   import java.util.Scanner;  // LIBRERIAS
public class Modularidad 
{

    
    public static void main(String[] args) 
   
    {
        int opciones;// VARIABLE
        do//HACE UN BUCLE EN TODA LA SECCION HASTA QUE LLEGO AL WHILE DONDE SE DETIENE
        { 
       Scanner keyboard=new Scanner(System.in);//LEE LOS DATOS QUE INGRESARE PARA LAS OPCIONES
       System.out.println("\n EJEMPLO MODULARIDAD");//LOS SYSTEM.OUT NOS VAN A PERMITIR IMPRIMIR COSAS EN PANTALLA EN LA CONSOLA
       System.out.println("\n Por favor vaya del numero 1 al 3 en ese orden");
       System.out.println("\n 1.-Suma");
       System.out.println("\n 2.-Cuestionario");
       System.out.println("\n 3.-Final");
       System.out.println("\n 4.-SALIR");
      
       
       opciones=keyboard.nextInt(); //AQUI ESCOGEMOS LA OPCION 
       switch(opciones) //EL SWITCH NOS PERMITIRA HACER EL MENU
       {
           case 1://y LOS CASE TENDRA TODA LA INFORMACION QUE METAMOS SEPARADA MOSTRANDO LO DE LA MODULARIDAD
           {
           Scanner ejemplo1=new Scanner(System.in); //LEERE MI EJEMPLO 1 AQUI
           int x,y; //MAS VARIABLES
           System.out.println("\n En la modularidad  se resuelve un problema particular");
           System.out.println("\n Cada modulo contiene toda la informacion para cumplir su finalidad");
           System.out.println("\n Este se puede modificar sin que se afecte a todo lo demas");
           System.out.println("\n Ahora para demostrar su funcionalidad: ");
           System.out.println("\n Intenta sumar dos numeros diferentes");
           System.out.println("\nIngresa el primer numero: ");
           x=ejemplo1.nextInt(); //AQUI PIDO INGRESAR UN  NUMERO
           System.out.println("\nIngresa el segundo numero: ");
           y=ejemplo1.nextInt(); //EL OTRO NUMERO
           int z=x+y; //DECLARO UNA VARIABLE QUE CONTENDRA UNA OPERACION
           System.out.println("\nEl resultado de la suma es: "+z); //Y AQUI MUESTRO EL RESULTADO DE ESTA OPERACION
           }
           break; //EL BREAK CIERRA EL CASE
           
           case 2:
           {
               Scanner ejemplo2=new Scanner(System.in);//LEERE EL EJEMPLO 2
               String x,y,z; //EN EL STRING GUARDAREMOS UNA CADENA DE CARACTERES
               System.out.println("\n El segundo ejemplo se tratara de un cuestionario");
               System.out.println("\n Demostrando que lo que hicimos en el caso 1 no afecta al segundo por ser");
               System.out.println("\n Particular");
               System.out.println("\n Por favor ingresa los datos que se te piden");
               System.out.println("\n De que color es su cabello: ");
               x=ejemplo2.nextLine();//PIDO INGRESAR EL NOMBRE Y LO LEE HASTA EL FINAL DE LA LINEA
               System.out.println("\n Cual es su estatura: ");
               y=ejemplo2.nextLine();// PIDO LO MISMO QUE ARRIBA
               System.out.println("\n Cuantos años tiene: ");
               z=ejemplo2.nextLine();//AQUI TAMBIEN
               
               System.out.println("Su cabello es de color: "+x);//EN LOS ULTIMOS TRES MUESTRO LOS DATOS QUE PEDI ANTERIORMENTE
               System.out.println("Usted mide: "+y);
               System.out.println("Su edad es: "+z);
           }   
          
           break;
           case 3:
           {
               Scanner ejemplo3=new Scanner(System.in);
               System.out.println("\n En este punto vemos que sea lo que sea que ingrese en el case 1 o 2");
               System.out.println("\n no afecta este apartado");
               System.out.println("\n Pero si muevo algo en case 1 afectara al case 1 y lo mismo con el 2");
           }
           break;
       
       }
       }
       while(opciones!=4);//TERMINO AQUI E¿MI CICLO WHILE DICIENDOLE QUE AL INGRESAR 4 EN MI APARTADO DE OPCIONES SALGA DEL PROGRAMA
    }
    
}