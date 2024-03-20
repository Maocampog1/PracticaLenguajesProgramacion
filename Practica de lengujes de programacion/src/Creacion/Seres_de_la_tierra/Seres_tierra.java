package Creacion.Seres_de_la_tierra;

import Creacion.Ser_viviente;

public class Seres_tierra extends Ser_viviente implements Ser_terrestre{

    private boolean estado;
    private String nombre;

    public Seres_tierra(boolean estado, String nombre) {
        this.estado = estado;
        this.nombre= nombre;
    }

    @Override
    protected void nacer() {
        if (estado == true){
        System.out.println(nombre+ " en la tierra");
    }
    else {
        System.out.println(nombre + " está muerto, no puede naacer");
        }
    }

    @Override
    protected void crecer() {
        if (estado == true) {
            System.out.println(nombre + " crece en la tierra");
        }
        else {
            System.out.println(nombre +" está muerto, no puede crecer");
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
    protected void morir() {
        System.out.println(nombre + "muere en la tierra");
        this.estado = false;
    }

    public void caminar() {
        if (estado == true) {
            System.out.println(nombre + " camina en la tierra");
        } else {
            System.out.println(nombre + " está muerto, no puede caminar");
        }
    }

    public void correr() {
        if (estado == true) {
            System.out.println(nombre+ " corre en la tierra");
        } else {
            System.out.println(nombre+  " esta muerto, no puede correr");
        }

    }

    public
    void saltar() {
        if (estado == true) {
            System.out.println(nombre + " salta en la tierra");
        } else {
            System.out.println(nombre + " esta muerto, no puede saltar");
        }

    }
}
