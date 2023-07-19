interface Persona {
    void setNombre(String nombre);
    String getNombre();
    void setEdad(int edad);
    int getEdad();
    void setDireccion(String direccion);
    String getDireccion();
    void setTelefono(String telefono);
    String getTelefono();
}



class Estudiante implements Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String universidad;
    private String carrera;

    
    public Estudiante(String nombre, int edad, String direccion, String telefono, String universidad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.universidad = universidad;
        this.carrera = carrera;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}


class Docente implements Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String universidad;
    private String especialidad;

    
    public Docente(String nombre, int edad, String direccion, String telefono, String universidad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.universidad = universidad;
        this.especialidad = especialidad;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}

