package Evolucion;

import java.lang.Math;

public class Escenario
{
    int[][] tablero;

    public Escenario()
    {
        tablero = new int[10][10]; //Por este tablero se podrán mover los eslavones en busca de comida

        //Inicializamos la matriz a 0
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j <10; j++)
            {
                tablero[i][j] = 0;
            }
        }
    }

    public void comenzar()
    {
        System.out.println("Empieza la evolución");

        //Creamos los eslavones
        for(int i = 0; i < 10; i++)
        {
            Eslavon nuevoEslavon = new Eslavon(1, this, 0, i);
        }

    }

    //Con este método generaremos 10 piezas de comida.
    private void generarComida()
    {
        int counter = 0;

        while(counter < 10) //Pondremos 10 trozos de comida en el tablero
        {   
            //Generaremos un primer número aleatorio para las filas que irá desde el 1 para adelante
            int fila = Math.random() * 8 + 1

            //Generaremos un segundo número aleatroio para las columnas que irá desde el 1 para adelante
            int columna = Math.random() * 8 + 1

            //Colocamos el trozo de comida en el tablero
            tablero[fila][columna] = 1;
        }    
    }

    
}