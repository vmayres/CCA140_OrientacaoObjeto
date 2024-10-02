public abstract class Empregado {
    protected String nome;
    protected String matricula;

    public Empregado() {
    }

    public Empregado(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // metodos de acesso
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float calcSalario();
}
