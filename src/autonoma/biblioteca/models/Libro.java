/**
 * modelo que permite representar un libro 
 * 
 * @ author Dilson Hincapie R
 * @since 2025-14-03
 * @version 1.0.0
 */
package autonoma.biblioteca.models;
 
//////////////////////////////////////////atributos ////////////////////////////////////

public class Libro{
    /**
     * id de los libros
     */
    private long id;
        /**
     * nombre o titulo del libro
     */
    private String titulo;
    
    //constructor del libro
    public Libro(long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    //obtener id 
    public long getId() {
        return id;
    }
    //establecer id del libro
    public void setId(long id) {
        this.id = id;
    }
    //obtener titulos
    public String getTitulo() {
        return titulo;
    }
    // establecer titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //retorno de datos 
    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo='" + titulo + '\'' + '}';
    }
}