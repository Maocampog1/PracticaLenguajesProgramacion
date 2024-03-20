package Creacion.Seres_de_la_tierra;

import Creacion.Seres_del_aire.Ser_aereo;

import Creacion.Ser_viviente;

import java.awt.desktop.AboutEvent;
import java.io.FilterOutputStream;


public class Humano extends Ser_viviente implements Ser_terrestre, Ser_aereo {


    private boolean estado;
    private String nombre;
    public Humano(boolean estado, String nombre){
        this.estado = estado;
        this.nombre = nombre;
    }

    @Override
    public void caminar() {
        if (estado == true) {
            System.out.println(nombre + " está caminando");
        }
        else {
            System.out.println(nombre + " está muerto, no puede caminar");
        }
    }

    @Override
    public void correr() {
        if (estado == true) {
            System.out.println(nombre + " está corriendo");
        }
        else {
            System.out.println(nombre + " está muerto, no puede correr");
        }
    }

    @Override
    public void saltar() {
        if (estado == true) {
            System.out.println(nombre + " está saltando");
        }
        else {
            System.out.println(nombre + " está muerto, no puede saltar");
        }

    }

    @Override
    public void volar() {
        if (estado==true) {

            System.out.println(nombre + " vuela en avion");
        }
        else{

            System.out.println(nombre + " vuela con alas");

        }
    }

    @Override
    public void planear() {
        if (estado == true){
            System.out.println(nombre + " está planeando en avion");
        }
        else{
            System.out.println(nombre + " está planeando con alas");
        }
    }


    @Override
    public void cambiar_de_dimension() {

            System.out.println(nombre + " está cambiando de dimensión");

    }


    @Override
    public void nacer() {
        if (estado == true) {
            System.out.println(nombre + " está naciendo");
        }
        else {
            System.out.println(nombre + " está muerto, no puede nacer");
        }
    }

    @Override
    public  void crecer() {
        if (estado == true) {
            System.out.println(nombre + " está creciendo");
        }
        else {
            System.out.println(nombre + " está muerto, no puede crecer");
        }
    }

    @Override
    protected void reproducirse() {
        if (estado == true) {
            System.out.println(nombre + " se reprodujo");
        }
        else {
            System.out.println(nombre + " está muerto, no puede reproducirse");
        }
    }


    @Override
     public void morir() {
        System.out.println("Murió " + nombre);

        this.estado=false;



    }
}
