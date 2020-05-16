package proyecto;

/**
 *
 * @author Cristian Hernandez
 * @author Edison Huiñaizaca
 * @author Vinicio Barzallo
 * @author Mario Torres
 * @author Ricardo Chiqui
 */
public class LibroImpreso extends Libro {

    public LibroImpreso() {
    }

    public LibroImpreso(String titulo, String autor, String edicion, double precio) {
        super.setTitulo(titulo);
        super.setAutor(autor);
        super.setEdicion(edicion);
        super.setPrecio(precio);
    }
    
    @Override
    protected double calcularComision() {
        return ((super.getPrecio() * 2) / 100) + 20;
    }
}