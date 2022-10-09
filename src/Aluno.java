public class Aluno extends Pessoa {
    private double notaFinalDoAluno;
    
    Aluno(int _cpf, String _nome, String _telefone, String _dataDeNascimento, double notaFinalDoAluno){
        
        super(_cpf, _nome, _telefone, _dataDeNascimento);
        this.notaFinalDoAluno = notaFinalDoAluno;
    }

    //NotaFinalDoAluno
    public double getNotaFinalDoAluno() {
        return notaFinalDoAluno;
    }
    public void setNotaFinalDoAluno(double notaFinalDoAluno) {
        this.notaFinalDoAluno = notaFinalDoAluno;
    }

    @Override
    public String toString() {
        return ("Nome: " + getNome() + " - CPF: " + getCpf() + " - Telefone: " + getTelefone() + 
                " - Nascimento: " + getDataDeNascimento() + " - Data de Cadastro " + getDataDeCadastroDaPessoa() +
                " - Data da Ultima Alteracao: " + getDataDaUltimaAlteracao() + " - Nota Final do Aluno: " + this.notaFinalDoAluno);  
    }
}