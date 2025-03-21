package autonoma.biblioteca.models;


/**
 *Modelo que permite representar una persona
 * 
 * @author Santiago Furque Osorio
 * @since 2025-14-03
 * @version 1.0.0
 */
public class Autor {

//////////////////////////////////////////atributos ////////////////////////////////////

    
        /**
     * nombre de la editorial...3 lines*/
    private String editorial;
    
    /**profesion */
    private String profesion ;
    
    
    //
    public Autor(String editorial , String profesion ) {
        this.editorial= editorial;
        this.profesion = profesion;
       
    }
    //obtener editorial
    
    public String getEditorial() {
        return editorial;
    }
    //establecer editorial
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    //obtener el documento de identidlad
    public String getProfesion() {
        return profesion;
    }
    // establecer el documento de identidad
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    //retorno de datos 
    @Override
    public String toString() {
        return "Autor{" + "editorial=" + editorial + ", profesion='" + profesion  + '\'' + '}';
    }

}

