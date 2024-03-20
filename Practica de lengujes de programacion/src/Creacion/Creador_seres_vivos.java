package Creacion;


import Creacion.Seres_de_la_tierra.Humano;
import Creacion.Seres_de_la_tierra.Seres_tierra;
import Creacion.Seres_del_aire.Ser_aire;

public class Creador_seres_vivos implements Creador {


    //metodo factory para crear seres vivos

    public static Ser_viviente createLivingbeings(String type, String nombre, boolean estado) { //Método factory, que recibe un tipo de ser vivo y lo crea




        if (type.equals("Aire")) {
            return new Ser_aire(nombre);
        } else if (type.equals("Tierra")) {
            return new Seres_tierra(estado, nombre);
        } else if (type.equals("Humano")) {
            return new Humano(estado, nombre);
        } else {
            return null;
        }

    }





}

