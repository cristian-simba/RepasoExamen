public class EstudianteNoGraduado extends Estudiante{
    int periodoAcademico;
    int anioGrado;

    public EstudianteNoGraduado(){
        super();
    }

    public EstudianteNoGraduado(String nombre, int edad, int cedula, int periodoAcademico, int anioGrado) {
        super(nombre, edad, cedula);
        this.periodoAcademico = periodoAcademico;
        this.anioGrado = anioGrado;
    }

    public int getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(int periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public int getAnioGrado() {
        return anioGrado;
    }

    public void setAnioGrado(int anioGrado) {
        this.anioGrado = anioGrado;
    }
}
