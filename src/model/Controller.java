package model;

import model.Persona;

public class Controller {

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
        
    }

    public Persona crearPersona1(String nombre, int edad) {
        Persona persona1;
        persona1 = new Persona(nombre, edad);
        return persona1;
    }

    public String retornarNombreDePersona(Persona persona) {
        return persona.getNombre();
    }


}
