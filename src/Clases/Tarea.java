package Clases;

public class Tarea {
    private String tarea;
    private boolean hecha = false;
    private String titulo;


    public Tarea(String tarea, String titulo) {
        this.tarea = tarea;
        this.titulo = titulo;
    }

    public void darDeBaja(){
        this.hecha = true;
    }

    public String mostrarTarea(){
        return this.titulo + ": " + this.tarea;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
