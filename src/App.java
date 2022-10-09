import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws Exception {

        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        Scanner input = new Scanner(System.in);
        
        listaPessoa.add(new Pessoa(10, "marcos", "35954967", "23/05/1998"));
        listaPessoa.add(new Pessoa(11, "joao", "000000", "13/02/1987"));
        listaPessoa.add(new Aluno(11, "Vinicius", "000000", "13/02/1987", 5.7));
        
        System.out.println("\n\t\tSeja Bem Vindo");
        
        //escolherOpcao(mostrarMenu(input), input, listaPessoa);
        
        System.out.println(listaPessoa.get(1));

        input.close();
    }
    
    public static void criarPessoaAluno(List<Pessoa> lista){
        lista.add(new Pessoa(11, "matheus", "111111", "13/02/1987"));
    }

    public static int escolherOpcao(char opcao, Scanner input, List<Pessoa> lista) throws Exception{
        switch(opcao){
            case 'C':
                System.out.println("\nCriar pessoa ou aluno:");
                criarPessoaAluno(lista);
            break;
            case 'M':
                System.out.println("\nMostrar pessoa e aluno");
            break;
            case 'A':
                System.out.println("\nAtualizar pessoa ou aluno");
            break;
            case 'D':
                System.out.println("\nDeletar pessoa ou aluno");
            break;
            case 'E':
                System.out.println("\nPrograma encerrado. Volte sempre! \n");
                return 1;
            default:
                throw new Exception("Opcao não cadastrada: " + opcao);
        }
        
        System.out.println("\n\n---------------------------------------------------------------------");  
        escolherOpcao(mostrarMenu(input), input, lista);
        
        return 1;
    }
    public static char mostrarMenu(Scanner input) throws IOException{
        char opcao;
        System.out.println("\n\tPrograma de cadastro de Pessoa ou Aluno\n");
        do{
            try {
                System.out.println("Digite a letra para selecionar uma das opcoes abaixo:\n");
                System.out.println("* Criar pessoa ou aluno [C]" +
                    "\n* Mostrar todas as pessoas e alunos criadas (Listar na tela) [M]" +
                    "\n* Atualizar dados de uma pessoa ou aluno [A]" +
                    "\n* Deletar uma pessoa ou aluno [D]" +
                    "\n* Encerrar programa [E]");
                System.out.print("Opcao: ");
                opcao = input.next().charAt(0);
                opcao = Character.toUpperCase(opcao);

                if(opcao !='C' && opcao!= 'M' && opcao!='A' && opcao!='D' && opcao!='E'){
                    throw new Exception();
                }
                
                return opcao;
            } catch (Exception e) {
                System.err.println("\n\tErro: Digite um valor válido\n");
            }
        }while(true);
    }
    
}
