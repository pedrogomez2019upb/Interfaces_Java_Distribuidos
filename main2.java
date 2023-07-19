interface ProgramaAcademico {
    void setNombrePrograma(String nombrePrograma);
    String getNombrePrograma();
    void setDuracion(int duracion);
    int getDuracion();
    void setUniversidad(String universidad);
    String getUniversidad();
    void setRequisitos(String requisitos);
    String getRequisitos();
    void imprimirInformacion();
}

class Derecho implements ProgramaAcademico {
    private String nombrePrograma;
    private int duracion;
    private String universidad;
    private String requisitos;

    
    public Derecho(String nombrePrograma, int duracion, String universidad, String requisitos) {
        this.nombrePrograma = nombrePrograma;
        this.duracion = duracion;
        this.universidad = universidad;
        this.requisitos = requisitos;
    }

    
    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void imprimirInformacion() {
        System.out.println("Programa académico: " + nombrePrograma);
        System.out.println("Duración: " + duracion + " años");
        System.out.println("Universidad: " + universidad);
        System.out.println("Requisitos: " + requisitos);
    }

    
    public void ofrecerBeca() {
        System.out.println("Se ofrece una beca para el programa de Derecho.");
    }

    public void realizarPracticas() {
        System.out.println("Los estudiantes de Derecho realizan prácticas en bufetes de abogados.");
    }
}

class Mecánica implements ProgramaAcademico {
    private String nombrePrograma;
    private int duracion;
    private String universidad;
    private String requisitos;

    public Mecánica(String nombrePrograma, int duracion, String universidad, String requisitos) {
        this.nombrePrograma = nombrePrograma;
        this.duracion = duracion;
        this.universidad = universidad;
        this.requisitos = requisitos;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void imprimirInformacion() {
        System.out.println("Programa académico: " + nombrePrograma);
        System.out.println("Duración: " + duracion + " años");
        System.out.println("Universidad: " + universidad);
        System.out.println("Requisitos: " + requisitos);
    }

    public void realizarPracticas() {
        System.out.println("Los estudiantes de Ingeniería Mecánica realizan prácticas en empresas de ingeniería.");
    }

    public void participarProyectosInvestigacion() {
        System.out.println("Los estudiantes de Ingeniería Mecánica pueden participar en proyectos de investigación.");
    }
}

