/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *Modelo que permite representar una persona
 * 
 * @author Santiago Furque Osorio
 * @since 2025-14-03
 * @version 1.0.0
 */
public class Persona {

//////////////////////////////////////////atributos ////////////////////////////////////

    
        /**
     * nombre de las personas...3 lines*/
    private String nombre;
    
    /**Documento de identificación */
    private String documentoIdentidad;
    
    /**Emael de la persona*/
    
    private String correoElectronico;
    
    //constructor del persona
    public Persona(String nombre , String documentoIdentidad , String correoElectronico) {
        this.nombre= nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico  = correoElectronico;
    }
    //obtener nombre de Persona
    
    public String getNombre() {
        return nombre;
    }
    //establecer nombre de persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //obtener el documento de identidad
    public String getDocumentoidentidad() {
        return documentoIdentidad;
    }
    // establecer el documento de identidad
    public void setDocumentoidentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    //obtener el correo electronico
    public String getCorreoelectronico() {
        return correoElectronico;
    }
    // establecer el correo electronico
    public void setCorreoelectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    //retorno de datos 
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", documentoIdentidad='" + documentoIdentidad + ", correoElectronico='" + correoElectronico  + '\'' + '}';
    }

}

