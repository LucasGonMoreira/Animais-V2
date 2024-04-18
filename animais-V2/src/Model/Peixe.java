package Model;

import Contrato.IAnimalAquatico;

public class Peixe extends Animal implements IAnimalAquatico {

    public Peixe(boolean vivo, boolean alejado) {
        super(vivo, alejado);
    }

    public void nadar(){
        System.out.println("<Peixe: Nadando>");
    }
}
