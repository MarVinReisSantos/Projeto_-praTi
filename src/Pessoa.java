import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private int cpf;
    private String telefone;
    private String dataDeNascimento;
    private String dataDeCadastroDaPessoa;
    private String dataDaUltimaAlteracao;
    
    Pessoa(int cpf, String nome, String telefone, String dataDeNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeCadastroDaPessoa = dataAtual();
        this.dataDaUltimaAlteracao = dataAtual();;
    }

    //cpf
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    //nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //DataDeNascimento
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    //getDataDeCadastroDaPessoa
    public String getDataDeCadastroDaPessoa() {
        return dataDeCadastroDaPessoa;
    }

    public void setDataDeCadastroDaPessoa(String dataDeCadastroDaPessoa) {
        this.dataDeCadastroDaPessoa = dataDeCadastroDaPessoa;
    }

    //DataDaUltimaAlteracao
    public String getDataDaUltimaAlteracao() {
        return dataDaUltimaAlteracao;
    }
    public void setDataDaUltimaAlteracao() {
        this.dataDaUltimaAlteracao = dataAtual();
    }

    public String dataAtual(){
        LocalDateTime dataComputador = LocalDateTime.now();
        DateTimeFormatter meuFormatoObjeto = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dataComputador.format(meuFormatoObjeto);
    } 

    @Override
    public String toString() {
        return ("Nome: " + this.nome + " - CPF: " + this.cpf + " - Telefone: " + this.telefone + 
                " - Nascimento: " + this.dataDeNascimento + " - Data de Cadastro " + this.dataDeCadastroDaPessoa +
                " - Data da Ultima Alteracao: " + this.dataDaUltimaAlteracao);
    }
}