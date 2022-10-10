public class Aluno extends Pessoa {
    private double notaFinalDoAluno;
    
    Aluno(int _id, String _nome, String _telefone, String _dataDeNascimento, double notaFinalDoAluno){
        
        super(_id, _nome, _telefone, _dataDeNascimento);
        this.notaFinalDoAluno = notaFinalDoAluno;
    }

    Aluno(int _id, String _nome, String _telefone, String _dataDeNascimento, double notaFinalDoAluno, String _dataDeCadastroDaPessoa){
        
        super(_id, _nome, _telefone, _dataDeNascimento, _dataDeCadastroDaPessoa);
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
        return ("id: " + getId() + " - Nome: " + getNome() + " - Telefone: " + getTelefone() + 
                " - Nascimento: " + getDataDeNascimento() + " - Data de Cadastro " + getDataDeCadastroDaPessoa() +
                " - Data da Ultima Alteracao: " + getDataDaUltimaAlteracao() + " - Nota Final do Aluno: " + this.notaFinalDoAluno);  
    }
}