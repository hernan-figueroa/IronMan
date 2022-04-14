package Entidades;

public class Casco {

    private Consola consola;
    private Sintetizador sintetizador;
    private Integer salud;

    public Casco() {
    }

    public Casco(Consola consola, Sintetizador sintetizador, Integer salud) {
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.salud = salud;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }
    
    
}
