import java.util.Scanner;
import java.io.IOException;

public class Leitura {
    Leitura(){

    }
    public static char mostrarMenu(Scanner input) throws IOException{
        char opcao;
        do{
            try {
                System.out.println("Digite a letra para selecionar uma das opcoes abaixo:");
                System.out.println("\t*Criar pessoa ou aluno [C]" +
                    "\n\t*Mostrar todas as pessoas e alunos criadas (Listar na tela) [M]" +
                    "\n\t*Atualizar dados de uma pessoa ou aluno [A]" +
                    "\n\t*Deletar uma pessoa ou aluno [D]" +
                    "\n\t*Encerrar programa [E]");
                System.out.print("Opcao: ");
                opcao = input.next().charAt(0);
                opcao = Character.toUpperCase(opcao);

                if(opcao !='C' && opcao!= 'M' && opcao!='A' && opcao!='D' && opcao!='E'){
                    throw new Exception("Erro");
                }
                
                return opcao;
            } catch (Exception e) {
                System.err.println("Digite um valor válido");
            }
        }while(true);
    }
}