package Modelos;

public class ModeloEjercicios {
    private int id_ejercicio;
    private String ejercicio_text;

    public ModeloEjercicios(int id_ejercicio, String ejercicio_text) {
        this.id_ejercicio = id_ejercicio;
        this.ejercicio_text = ejercicio_text;
    }

    public ModeloEjercicios(String ejercicio_text) {
        this.ejercicio_text = ejercicio_text;
    }

    public ModeloEjercicios() {
    }

    public int getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(int id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public String getEjercicio_text() {
        return ejercicio_text;
    }

    public void setEjercicio_text(String ejercicio_text) {
        this.ejercicio_text = ejercicio_text;
    }
    
    
    
}
