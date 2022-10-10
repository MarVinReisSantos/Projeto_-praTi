import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class App {
    
    public static void main(String[] args) throws Exception {

        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        Scanner input = new Scanner(System.in);
        
        //Pessoas cadastradas por padrão para facilitar os testes
        listaPessoa.add(new Pessoa(listaPessoa.size(), "Silvia", "3585 4767", "23/05/1998"));
        listaPessoa.add(new Pessoa(listaPessoa.size(), "Joao", "2540 8978", "13/02/1987"));
        listaPessoa.add(new Aluno(listaPessoa.size(), "Vinicius", "3645 4455", "13/02/1987", 87.7));
        

        System.out.println("\n\t\tSeja Bem Vindo");
        
        escolherOpcao(mostrarMenu(input), input, listaPessoa);
        
        System.out.println("\tProjeto desenvolvido por Marcos Vinicius");
        
        input.close();
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
    
    public static void escolherOpcao(char opcao, Scanner input, List<Pessoa> lista) throws Exception{
        switch(opcao){
            case 'C':
                System.out.println("\n\tCriar pessoa ou aluno:");
                criarPessoaAluno(lista, input);
            break;
            case 'M':
                System.out.println("\n\tMostrar pessoa e aluno:");
                mostrarLista(lista);
            break;
            case 'A':
                System.out.println("\n\tAtualizar pessoa ou aluno:");
                atualizaPessoaAluno(lista, input);
            break;
            case 'D':
                System.out.println("\n\tDeletar pessoa ou aluno:");
                removerPessoaAluno(lista, input);
            break;
            case 'E':
                System.out.println("\n\tPrograma encerrado. Volte sempre! \n");
                return;
            default:
                throw new Exception("Opcao não cadastrada: " + opcao);
        }
        
        System.out.println("\n\n---------------------------------------------------------------------");  
        escolherOpcao(mostrarMenu(input), input, lista);
        
    }

    public static void criarPessoaAluno(List<Pessoa> lista, Scanner input){
        char opcao = ' ';
        input.nextLine();

        String nome = leiaTeclado("Digite o nome: ", input);
        String telefone = leiaTeclado("Digite o Telefone: ", input);
        String nascimento = leiaTeclado("Digite a data de Nascimento: ", input);

        opcao = opcaoNotaAluno(input, "\nDeseja adicionar a Nota Final?");

        if(opcao == 'S'){
            double nota;
            nota = entradaNotaAluno(input);            
            lista.add(new Aluno(lista.size(), nome, telefone, nascimento, nota));
        }else{
            lista.add(new Pessoa(lista.size(), nome, telefone, nascimento));
        }
        
        System.out.println("\n\t" + nome + " cadastrado com sucesso."); 
    }

    public static char opcaoNotaAluno(Scanner input, String mensagem){
        char opcao;
        System.out.print(mensagem);

        do{
            try {
                System.out.print("\nDigite: \n[s] para sim \n[n] para nao \nopcao: ");
                opcao = input.next().charAt(0);
                opcao = Character.toUpperCase(opcao);

                if(opcao == 'S' || opcao == 'N'){
                    return opcao;
                }else{
                    throw new Exception();
                }
                
            } catch (Exception e) {
                System.err.println("\n\tErro: Digite um valor válido\n");
            }
        }while(true);
    }

    public static int opcaoId(Scanner input, int qtdItemLista, String mensagem){
        int id;
        String idEntrada;
        input.nextLine();
        
        do{
            try {
                System.out.print(mensagem);
                idEntrada = input.nextLine();
                id = Integer.parseInt(idEntrada);

                if(id>=-1 && id<qtdItemLista){
                    return id;
                }else{
                    throw new Exception();
                }

            } catch (Exception e) {
                System.err.println("\n\tErro: Você digitou um id inválido ou ele não esta na lista - id máximo: " + (qtdItemLista-1) + "\n");
            }   
        }while(true);
    }

    public static double entradaNotaAluno(Scanner input){
        double nota;
        String notaEntrada;
        input.nextLine();
        
        do{
            try {
                System.out.print("\nDigite a Nota Final (0 até 100) do Aluno: ");
                notaEntrada = input.nextLine();
                nota = Double.parseDouble(notaEntrada);

                if(nota>=0 && nota<=100){
                    return nota;
                }else{
                    throw new Exception();
                }

            } catch (Exception e) {
                System.err.println("\n\tErro: Você digitou uma nota invalida\n");
            }   
        }while(true);
    }
    
    public static void mostrarLista(List<Pessoa> lista){
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }

    public static void atualizaPessoaAluno(List<Pessoa> lista, Scanner input){
        char opcao = ' ';
        String dataDeCadastroDaPessoa;

        int idOpcao = opcaoId(input, lista.size(), "Digite: \n[id] para atualizar \n[-1] para sair \nopcao: ");

        if(idOpcao == -1){
            System.out.println("\n\tVocê saiu sem Atualizar");
            return;
        }
        
        String nome = leiaTeclado("Digite o nome: ", input);
        String telefone = leiaTeclado("Digite o Telefone: ", input);
        String nascimento = leiaTeclado("Digite a data de Nascimento: ", input);
        opcao = opcaoNotaAluno(input, "\nDeseja atualiza a Nota Final?");


        dataDeCadastroDaPessoa = lista.get(idOpcao).getDataDeCadastroDaPessoa();
        //lista.remove(idOpcao);

        if(opcao == 'S'){
            double nota;
            nota = entradaNotaAluno(input);            
            lista.set(idOpcao, new Aluno(idOpcao, nome, telefone, nascimento, nota, dataDeCadastroDaPessoa));
        }else{
            lista.set(idOpcao, new Pessoa(idOpcao, nome, telefone, nascimento, dataDeCadastroDaPessoa));
        }

        System.out.println("\n\t[id] " + idOpcao + " Atualizado com sucesso.");   
    }

    public static void removerPessoaAluno(List<Pessoa> lista, Scanner input){
        
        int opcao = opcaoId(input, lista.size(), "Digite: \n[id] para deletar \n[-1] para sair \nopcao: ");
        
        if(opcao == -1){
            System.out.println("\n\tVocê saiu sem deletar");
            return;
        }
        
        System.out.println("\n\t" + lista.get(opcao).getNome() + " Removido com sucesso.");
        lista.remove(opcao);
        
        int contador = 0;
        for (Pessoa pessoa : lista) {
            pessoa.setId(contador++);
        }
            
    }

    public static String leiaTeclado(String mensagem, Scanner input){
        System.out.print(mensagem);
        String leitura = input.nextLine();

        return leitura;
    }
}
