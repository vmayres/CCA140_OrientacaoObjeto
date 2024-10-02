import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Analista ana = new Analista();
        Programador pro = new Programador();

        System.out.println("Nome do(a) Analista: ");
        ana.setNome(input.next());

        System.out.println("Matricula do(a) Analista: ");
        ana.setMatricula(input.next());

        System.out.print("Quantidade de projetos: ");
        int numProjetos = input.nextInt();
        float[] val = new float[numProjetos];
        for (int i = 0; i < numProjetos; i++) {
            System.out.print("Valor do projeto " + (i + 1) + ": ");
            val[i] = input.nextFloat();
            ana.setValorPorProjeto(val);
        }

        System.out.println("Nome do(a) Programador(a): ");
        pro.setNome(input.next());

        System.out.println("Matricula do(a) Programador(a   ): ");
        pro.setMatricula(input.next());

        System.out.println("Horas trabalhadas: ");
        pro.setQtdeHoras(input.nextFloat());

        System.out.println("Salario por Hora: ");
        pro.setValorHora(input.nextFloat());

        System.out.println("Nome: " + ana.getNome() + "\nMatricula: " + ana.getMatricula()
                + "\nSalario do(a) Analista: " + ana.calcSalario());
        System.out.println("Nome: " + pro.getNome() + "\nMatricula: " + pro.getMatricula()
                + "\nSalario do(a) Programdor(a): " + pro.calcSalario());

    }
}
