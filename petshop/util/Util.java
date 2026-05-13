package petshop.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {
    public void menu() {
        int opcao = 0;
        String aux = "";

        aux = """
                1. Cadastrar Animal
                2. Registrar serviço
                3. Calcular Conta Total
                4. Imprimir Relatório
                5. Finalizar
                """;
        do {
            try {
                opcao = parseInt(showInputDialog(aux));
            } catch (NumberFormatException e) {
                showMessageDialog(null, "A opção deve ser um " + "número inteiro");
            }
        }while (opcao !=5);
        
    }
}
