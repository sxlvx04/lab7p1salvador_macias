package com.mycompany.lab7p1_salvador_macias;

import java.util.Scanner;

public class Lab7p1_salvador_macias {

   
public static void main(String[] args){
    boolean bool = true;
    do{
    Scanner entrada = new Scanner(System.in);
    System.out.println("--------------------------------------------");
    System.out.println("Bienvenido al menu!");
    System.out.println("Estas son las opciones dispobles del menu: ");
    System.out.println("1.El calamar pablo\n2.Torre de control");
    System.out.println("Ingrese una opcion: ");
    int opc = entrada.nextInt();
    switch (opc){
        case 1:{
            System.out.println("Ingrese una seleccion:1.Espana\n.2Alemania\n3.Costa Rica\n4.Japon\n5.Belgica\n6.Croacia\n7.Canada\n8.Marruecos");
            int sele = entrada.nextInt();
            if(sele==1){
                seleccion alemania = new seleccion();
                //alemania.entrenador ="Hansi flick";
            
            
            
            }
            
            
            
            
            
            
            
            
            
    }
    break;
        case 2:{ 
    
    
    
    }
    break;
    default: 
    bool = false; 
    System.out.println("La opcion ingresada es invalida,se abandonara el menu");
    
    
    }
    }while (bool!=false);

}






}

    

