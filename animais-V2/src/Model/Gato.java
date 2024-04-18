package Model;

import Contrato.IAnimalTerrestre;

public class Gato extends Animal implements IAnimalTerrestre {

    public Gato(boolean vivo, boolean alejado){
        super(vivo, alejado);
    }

    public void andar(){
        System.out.println("<Gato: andando>");
    }
}
