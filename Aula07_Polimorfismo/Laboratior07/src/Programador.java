public class Programador extends Empregado {
    private float qtdeHoras;
    private float valorHora;

    // construtores
    public Programador() {
    }

    public Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcSalario() {
        float x = valorHora * qtdeHoras;
        return x;
    }

    @Override
    public String toString() {
        return "Programador [qtdeHoras=" + qtdeHoras + ", valorHora=" + valorHora + "]";
    }

}
