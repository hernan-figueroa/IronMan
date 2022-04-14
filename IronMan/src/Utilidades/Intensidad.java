package Utilidades;

public enum Intensidad {

    BASICO(1),INTERMEDIO(2),INTENSIVO(3);
    
    int valor;
    
    Intensidad(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    
}
