package model;

import model.Persona;

public class Controller {

    private Persona persona1;
    private Persona persona2;

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
        
    }

    public void crearPersona1(String nombre, int edad) {
        this.persona1 = new Persona(nombre, edad);
        System.out.println(persona1.getNombre());
    } 


}
