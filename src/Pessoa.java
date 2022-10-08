public class Pessoa {
    private String nome;
    private String telefone;
    private String dataDeNascimento;
    private String dataDeCadastroDaPessoa;
    private String dataDaUltimaAlteracao;
    
    Pessoa(){

    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the dataDeNascimento
     */
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * @return String return the dataDeCadastroDaPessoa
     */
    public String getDataDeCadastroDaPessoa() {
        return dataDeCadastroDaPessoa;
    }

    /**
     * @param dataDeCadastroDaPessoa the dataDeCadastroDaPessoa to set
     */
    public void setDataDeCadastroDaPessoa(String dataDeCadastroDaPessoa) {
        this.dataDeCadastroDaPessoa = dataDeCadastroDaPessoa;
    }

    /**
     * @return String return the dataDaUltimaAlteracao
     */
    public String getDataDaUltimaAlteracao() {
        return dataDaUltimaAlteracao;
    }

    /**
     * @param dataDaUltimaAlteracao the dataDaUltimaAlteracao to set
     */
    public void setDataDaUltimaAlteracao(String dataDaUltimaAlteracao) {
        this.dataDaUltimaAlteracao = dataDaUltimaAlteracao;
    }

}