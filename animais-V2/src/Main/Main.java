package Main;

import Contrato.IAnimalAquatico;
import Model.Animal;
import Model.Arara;
import Model.Gato;
import Model.Peixe;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato(true, true);
        Arara arara = new Arara(true, false);
        Peixe peixe = new Peixe(false, false);

        System.out.println("\n\n Gato");
        gato.comer();
        gato.andar();
        System.out.printf("O gato está vivo? %s, e está aleijado? %s", gato.vivo, gato.alejado);
        System.out.println("\n\n Arara");
        arara.comer();
        arara.voar();
        System.out.printf("A arara está viva? %s, e está aleijado? %s", arara.vivo, arara.alejado);
        System.out.println("\n\n Peixe");
        peixe.comer();
        peixe.nadar();
        System.out.printf("O peixe está vivo? %s, e está aleijado? %s", peixe.vivo, peixe.alejado);
    }
}
