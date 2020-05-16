package proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres Guicha
 * @author Ricardo Chuqui
 * @author Diego Castro
 * @author Jonathan Atancuri
 */
public class Inicio {

    public static void main(String[] args) {
        Libro l1 = new LibroDigital("MARKETING DIGITAL", "M. Meyers", "1era edicion", 50, 5);
        Libro l2 = new LibroDigital("LA RED OSCURA", "G. Philips", "2da edicion", 25, 2);
        Libro l3 = new LibroImpreso("SISTEMAS EXPERTOS", "H. Marks", "1era edicion", 60);
        Libro l4 = new LibroImpreso("MÁQUINAS HIDRÁULICAS", "A. Rainold", "3era edicion", 120);
        
        List<Libro> lista1 = new ArrayList<>();
        List<Libro> lista2 = new ArrayList<>();
        
        lista1.add(l1);
        lista1.add(l2);
        lista2.add(l3);
        lista2.add(l4);
        
        Cliente cliente = new Cliente(1,100);
        cliente.recargarCredito(200);
        cliente.comprar(new Compra(1,lista1));
        cliente.comprar(new Compra(2,lista2));
        
        for (Compra compra : cliente.getCompras()) {
            for (Libro libro : compra.getLibros()) {
                System.out.println(libro.toString());
            }
        }
    }   
}