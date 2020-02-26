package Evolucion;

public class Eslavon
{
    private int velocidad;
    private int posFila; //La posicición que ocupa en la fila
    private int posColumna; //La posición que ocupa en la columna
    private Escenario escenario;

    public Eslavon(int velocidad, Escenario escenario, int posFila, int posColumna)
    {
        this.velocidad = velocidad;
        this.escenario = escenario;
        this.posFila = posFila;
        this.posColumna = posColumna;
    }
}