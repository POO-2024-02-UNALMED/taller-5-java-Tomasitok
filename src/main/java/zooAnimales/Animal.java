package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(){

    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public static String totalPorTipo(){
        return "Mamiferos: " + Mamifero.getListado().size() + "\n" + 
                "Aves: " + Ave.getListado().size() + "\n" + 
                "Reptiles: " + Reptil.getListado().size() + "\n" + 
                "Peces: " + Pez.getListado().size() + "\n" + 
                "Anfibios: " + Anfibio.getListado().size();
    }
    
    public String movimiento(){
        return "desplazarse";
    }

    @Override
    public String toString(){
        if (this.zona == null){
            return "Mi nombre es "+ this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }else{
            return "Mi nombre es "+ this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " 
                    + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el " + this.zona.getZoo().getNombre()+ ".";
        }
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public Zona getZona() {
        return zona;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
}
