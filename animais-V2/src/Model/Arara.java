package Model;

import Contrato.IAnimalAereo;

public class Arara extends Animal implements IAnimalAereo {

    public Arara(boolean vivo, boolean alejado){
        super(vivo, alejado);
    }

    public void voar(){
        System.out.println("<Arara: Voando>");
    }
}
