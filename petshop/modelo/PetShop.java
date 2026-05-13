package petshop.modelo;

import petshop.atendimento.Atendimento;
import petshop.interfaces.Calculavel;
import petshop.interfaces.Relatorio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PetShop implements Relatorio, Calculavel{
    private ArrayList<Animal> listaAnimal = new ArrayList<>();
    private ArrayList<Servico> listaServico = new ArrayList<>();
    private ArrayList<Atendimento> listaAtendimento = new ArrayList<>();

}
