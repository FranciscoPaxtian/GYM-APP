package MetodosVO;

public class SociosVO {
    private String id_socio;
    private String nombre;
    private String apellido;
    private String genero;
    private String edad;
    private String telefono;
    private String email;

    public SociosVO() {
    }

    public SociosVO(String id_socio, String nombre, String apellido, String genero, String edad, String telefono, String email) {
        this.id_socio = id_socio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * @return the id_socio
     */
    public String getId_socio() {
        return id_socio;
    }

    /**
     * @param id_socio the id_socio to set
     */
    public void setId_socio(String id_socio) {
        this.id_socio = id_socio;
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

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad= edad;
    }

        /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
        /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
    
