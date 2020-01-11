package ejercicio1;

public class Libro {
    String isbn;
    String titulo;
    String autor;
    int unidades;

    //constructores
    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int unidades) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.unidades = unidades;
    }

    //métodos setters y getters

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void visualizaDatosLibro(){
        System.out.println("ISBN: " + isbn);
        System.out.println("TITULO: " + titulo);
        System.out.println("AUTOR: " + autor);
        System.out.println("Unidades disponibles: " + unidades);
    }
}
