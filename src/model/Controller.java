package model;

import model.Persona;
import model.Estudiante;

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

    public Estudiante crearEstudiante1(String nombre, int edad, String codigoEstudiante, String carrera) {
        Estudiante estudiante1;
        estudiante1 = new Estudiante(nombre, edad, codigoEstudiante, carrera);
        return estudiante1;
    }


}
