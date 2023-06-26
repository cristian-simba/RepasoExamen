public class EstudianteGraduado extends Estudiante{
    int anioGrado;
    float promedio;

    public EstudianteGraduado(){
        super();
    }

    public EstudianteGraduado(String nombre, int edad, int cedula, int anioGrado, float promedio) {
        super(nombre, edad, cedula);
        this.anioGrado = anioGrado;
        this.promedio = promedio;
    }

    public int getAnioGrado() {
        return anioGrado;
    }

    public void setAnioGrado(int anioGrado) {
        this.anioGrado = anioGrado;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
