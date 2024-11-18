import java.util.ArrayList;

public class Alumno {
    private String nombre_completo;
    private long legajo;
    ArrayList <Nota> notas;

    public Alumno(String nombre_completo, long legajo) {
        this.nombre_completo = nombre_completo;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public void agregar_nota(Nota nota){
        this.notas.add(nota);
    }

    public void calcular_promedio(){
        double suma = 0;
        double promedio = 0;
        for (Nota nota : notas) {
            suma += nota.getNota_examen();
        }
        promedio = suma / notas.size();

        System.out.println("El promedio del alumno es de: " + promedio);
    }

}