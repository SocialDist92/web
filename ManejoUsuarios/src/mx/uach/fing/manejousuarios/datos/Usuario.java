package mx.uach.fing.manejousuarios.datos;

/**
 * Clase que se encarga de manejar los usuarios del sistema
 * @author Armando Rios
 * @version 1.0
 */
public class Usuario {
    
    private Integer id;
    private Integer edad;
    private String nombre;
    private String primerApellido;

    /**
     * Metodo que regresa el identificador unico de cada usuario
     * @throws NullPointerException cuando no exista el usuario en la base de
     * datos.
     * @return the id
     */
    public Integer getId()throws NullPointerException{
        if (this.id == null) {
            /* Forma Incorrecta de concatenar
                throw new NullPointerException(
                    "El usuario" +this.nombre+ 
                            "no ha sido guardado en bd");*/
            throw new NullPointerException(
                String.format(
                        "El usuario %s no existe.", this.nombre));
            
        }
        return id;
    }

    /**
     * @param id que se asignara al usuario al ser guardado en la bd
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
