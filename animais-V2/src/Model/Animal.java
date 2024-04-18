package Model;

import java.util.stream.Stream;

abstract public class Animal {
    public boolean vivo;
    public boolean alejado;

    public Animal(boolean vivo, boolean alejado) {
        this.vivo = vivo;
        this.alejado = alejado;
    }

    public void comer(){
        System.out.println("<Animal: Comendo>");
    }
}
