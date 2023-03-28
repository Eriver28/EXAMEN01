package Practica01;

public  class Consulta extends Libro{

    public Consulta(String titulo, String cod, String tema, String autor) {
        super(titulo, cod, tema, autor);
    }

    @Override
    public int tiempoPrestamo() {
        return 0;
    }

    @Override
    public int tiempoMaximoPrestamo() {
        return 0;
    }

    @Override
    public int multaPordia() {
        return 0;
    }
}


