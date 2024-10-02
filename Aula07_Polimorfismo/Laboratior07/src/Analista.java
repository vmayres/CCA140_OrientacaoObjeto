import java.util.Arrays;

public class Analista extends Empregado {
    private float valorPorProjeto[];

    public Analista() {
    }

    public Analista(String nome, String matricula, float[] vP) {
        super(nome, matricula);
        this.valorPorProjeto = vP;
    }

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] vp) {
        this.valorPorProjeto = vp;
    }

    @Override
    public float calcSalario() {
        float x = 0;
        for (int i = 0; i < valorPorProjeto.length; i++) {
            x = x + valorPorProjeto[i];
        }
        return x;
    }

    @Override
    public String toString() {
        return "Analista [valorPorProjeto=" + Arrays.toString(valorPorProjeto) + "]";
    }

}
