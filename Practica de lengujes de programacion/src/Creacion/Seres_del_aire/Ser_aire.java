package Creacion.Seres_del_aire;

import Creacion.Ser_viviente;

public class Ser_aire extends Ser_viviente implements Ser_aereo{
    String nombre;
    public Ser_aire(String nombre) {
        this.nombre = nombre;
    }

    public void volar(){
            System.out.println(nombre + " vuela con alas");
    }

    @Override
    public void planear() {
        System.out.println(nombre + "está planeando");
    }


    @Override
    public void cambiar_de_dimension(){
        System.out.println(nombre + " está cambiando de dimension");
    }

    protected void nacer(){
        System.out.println(nombre + " está naciendo en el aire");
    }

    protected void crecer(){
        System.out.println(nombre + " está creciendo");
    }

    @Override
    protected void reproducirse() {
        System.out.println(nombre + " se reprodujo");
    }


    protected void morir(){
        System.out.println(nombre + " esta muriendo en el aire");
    }


}
