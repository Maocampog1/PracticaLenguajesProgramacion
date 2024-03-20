package Creacion;

import Creacion.Creador_seres_vivos;
import Creacion.Ser_viviente;
import Creacion.Seres_de_la_tierra.Humano;
import Creacion.Seres_del_aire.Ser_aire;
import Creacion.Seres_de_la_tierra.Seres_tierra;


import java.util.Scanner;







public class Main {
    public static void main(String[] args) {


/*
        Ser_viviente ser1 = Creador_seres_vivos.createLivingbeings("Humano", "niña", true);
        Ser_viviente ser2 = Creador_seres_vivos.createLivingbeings("Tierra", "tigre", true);
        Ser_viviente ser3 = Creador_seres_vivos.createLivingbeings("Aire", "Angelito", true);
        Ser_viviente ser4 = Creador_seres_vivos.createLivingbeings("Tierra", "Perrito", false);

        ser1.nacer();
        ((Humano) ser1).volar(); // se hace casting para poder acceder a los metodos específicos
        ser1.morir();

        ((Humano)ser1).volar();
        ((Humano) ser1).caminar();

        System.out.println("----------------------------");
        System.out.println(" ");
        ser2.nacer();
        ser2.crecer();
        ser2.morir();
        ((Seres_tierra)ser2).caminar();
        ((Seres_tierra)ser2).saltar();
        ((Seres_tierra)ser2).correr();
        ser2.reproducirse();
        System.out.println("----------------------------");
        System.out.println(" ");
        ser3.nacer();
        ser3.crecer();
        ser3.morir();
        ((Ser_aire)ser3).volar();

        System.out.println("----------------------------" + "\n");
        ser4.nacer();
        ser4.crecer();
        ((Seres_tierra)ser4).caminar();
        ser4.morir();
*/

        Scanner sc = new Scanner(System.in);



        int opcion=0;
        do {

            System.out.println("1. Crear seres vivos");
            System.out.println("2. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();



            if (opcion == 1){

                System.out.println("Ingrese el nombre del ser vivo: ");
                String nombre = sc.next();
                System.out.println("Ingrese el tipo de ser vivo: 1. Humano 2. Terrestre 3. Aereo");
                int tipo = sc.nextInt();




                if (tipo == 1){
                    String ser = "Humano";
                    condicion(ser, nombre);

                }
                else if (tipo == 2){

                    String ser = "Tierra";

                    condicion(ser, nombre);


                }
                else if (tipo == 3){

                    String ser = "Aire";

                    condicion(ser, nombre);

                }
                else{
                    System.out.println("Opcion no valida");
                }

            }

        }while (opcion != 0);

    }


    public static void condicion(String ser, String nombre){


        Ser_viviente ser1 = Creador_seres_vivos.createLivingbeings(ser, nombre,true);

        if (ser.equals("Humano")){

                ser1.nacer();
                ser1.crecer();
                ((Humano) ser1).caminar();
                ((Humano) ser1).correr();
                ((Humano) ser1).saltar();
                ser1.reproducirse();
                ((Humano) ser1).volar();
                ser1.morir();
                ((Humano) ser1).cambiar_de_dimension();
                ((Humano)ser1).volar();
                ((Humano) ser1).planear();
                ((Humano) ser1).caminar();

        }
        else if (ser.equals("Tierra")){
            ser1.nacer();
            ser1.crecer();
            ((Seres_tierra)ser1).caminar();
            ((Seres_tierra)ser1).correr();
            ((Seres_tierra)ser1).saltar();
            ser1.reproducirse();
            ser1.morir();
            ((Seres_tierra)ser1).caminar();
            ((Seres_tierra) ser1).saltar();
            ((Seres_tierra)ser1).correr();

        }
        else if (ser.equals("Aire")){
            ser1.nacer();
            ser1.crecer();
            ser1.reproducirse();
            ((Ser_aire)ser1).volar();
            ((Ser_aire)ser1).cambiar_de_dimension();
            ((Ser_aire)ser1).planear();

        }
        else{
            System.out.println("Opcion no valida");
        }

    }
}