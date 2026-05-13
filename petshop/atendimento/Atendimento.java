package petshop.atendimento;

import petshop.modelo.Animal;
import petshop.modelo.Servico;

public class Atendimento {
    private Animal animal;
    private Servico servico;

    public Atendimento(Animal animal, Servico servico){
        this.animal = animal;
        this.servico= servico;
    }

}
