package Entidades;

import Utilidades.Color;
import Utilidades.Intensidad;

public class Armadura {

    private Color primario;
    private Color secundario;
    private Bota botaR;
    private Bota botaL;
    private Guante guanteR;
    private Guante guanteL;
    private Integer dureza;
    private Integer salud;
    private Bateria bateria;
    private Casco casco;
    private Intensidad intensidad;

    public Armadura() {
    }

    public Armadura(Color primario, Color secundario, Bota botaR, Bota botaL, Guante guanteR, Guante guanteL, Integer dureza, Integer salud, Bateria bateria, Casco casco, Intensidad intensidad) {
        this.primario = primario;
        this.secundario = secundario;
        this.botaR = botaR;
        this.botaL = botaL;
        this.guanteR = guanteR;
        this.guanteL = guanteL;
        this.dureza = dureza;
        this.salud = salud;
        this.bateria = bateria;
        this.casco = casco;
        this.intensidad = intensidad;
    }

    public Color getPrimario() {
        return primario;
    }

    public void setPrimario(Color primario) {
        this.primario = primario;
    }

    public Color getSecundario() {
        return secundario;
    }

    public void setSecundario(Color secundario) {
        this.secundario = secundario;
    }

    public Bota getBotaR() {
        return botaR;
    }

    public void setBotaR(Bota botaR) {
        this.botaR = botaR;
    }

    public Bota getBotaL() {
        return botaL;
    }

    public void setBotaL(Bota botaL) {
        this.botaL = botaL;
    }

    public Guante getGuanteR() {
        return guanteR;
    }

    public void setGuanteR(Guante guanteR) {
        this.guanteR = guanteR;
    }

    public Guante getGuanteL() {
        return guanteL;
    }

    public void setGuanteL(Guante guanteL) {
        this.guanteL = guanteL;
    }

    public Integer getDureza() {
        return dureza;
    }

    public void setDureza(Integer dureza) {
        this.dureza = dureza;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Intensidad getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Intensidad intensidad) {
        this.intensidad = intensidad;
    }
    
    

}
