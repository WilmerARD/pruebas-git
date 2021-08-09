
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
//no puede haber vertices con hubicaciones iguales

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int ancho = 500;
        int alto = 500;
        Delaunay d = new Delaunay();
        Vertice v1 = new Vertice(4.600957928262617,74.07009649724716);//periodistas
        Vertice v2 = new Vertice(4.602569316499693,74.06825949140017);//icetex
        Vertice v3 = new Vertice(4.597371897580131,74.07239277549212);//bibioteca luis angel arango
        Vertice v4 = new Vertice(4.597017428221618,74.06972918233788);// el chorro 
    
        d.insertar(v1);
        d.insertar(v2);
        d.insertar(v3);
        d.insertar(v4);
        for (int i = 0; i < d.aristas.size(); i++) {

            //No mostramos las aristas que triangulan con el triangulo general imaginario 
            if (!(((Arista) d.aristas.get(i)).getDestino().getX() < 0
                    || ((Arista) d.aristas.get(i)).getDestino().getX() > ancho
                    || ((Arista) d.aristas.get(i)).getGemelo().getDestino().getX() < 0
                    || ((Arista) d.aristas.get(i)).getGemelo().getDestino().getX() > ancho
                    || -((Arista) d.aristas.get(i)).getDestino().getY() < 0
                    || -((Arista) d.aristas.get(i)).getDestino().getY() > alto
                    || -((Arista) d.aristas.get(i)).getGemelo().getDestino().getY() < 0
                    || -((Arista) d.aristas.get(i)).getGemelo().getDestino().getY() > alto)) {

                System.out.println("arista "+i+"en x:" + ((Arista) d.aristas.get(i)).getDestino().getX());
                System.out.println("arista "+i+"en y:" + -1*((Arista) d.aristas.get(i)).getDestino().getY());
                System.out.println("arista "+i+"en destino x:" + ((Arista) d.aristas.get(i)).getGemelo().getDestino().getX());
                System.out.println("arista "+i+"en destino y:" + -1*((Arista) d.aristas.get(i)).getGemelo().getDestino().getY());
            }
            i++; //Nos saltamos las aristas gemelas
        }


    }

}
