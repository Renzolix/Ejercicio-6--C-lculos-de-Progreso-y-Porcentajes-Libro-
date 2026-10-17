public class Libro {
    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;

    public Libro(String titulo, String autor, int paginasTotales) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0; // Inicializa en 0 según consigna
    }

    public void leer(int paginas) {
        if (paginas <= 0) {
            System.out.println("La cantidad de páginas a leer debe ser mayor a 0.");
            return;
        }

        this.paginaActual += paginas;

        if (this.paginaActual >= this.paginasTotales) {
            this.paginaActual = this.paginasTotales;
            System.out.println("¡Has finalizado la lectura de '" + this.titulo + "'!");
        } else {
            System.out.println("Avanzaste " + paginas + " páginas.");
        }
    }

    public void mostrarProgreso() {
        // Casting explícito a double para evitar la división entera
        double porcentaje = ((double) this.paginaActual / this.paginasTotales) * 100.0;
        System.out.println(String.format("Libro: %s | Progreso: %d/%d páginas (%.2f%%)", 
                this.titulo, this.paginaActual, this.paginasTotales, porcentaje));
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 400);

        libro.mostrarProgreso();
        libro.leer(150);
        libro.mostrarProgreso();
        libro.leer(300); // Supera el límite total
        libro.mostrarProgreso();
    }
}