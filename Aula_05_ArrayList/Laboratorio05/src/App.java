import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        char fim = '1';

        // arranjo de obejtos phonebook
        ArrayList<PhoneBook> pho = new ArrayList<>();

        PhoneBook p1 = new PhoneBook("Victor", "123456789");
        PhoneBook p2 = new PhoneBook("Pricila", "987654321");
        PhoneBook p3 = new PhoneBook("Enzo", "123498765");

        pho.add(p1);
        pho.add(p2);
        pho.add(p3);

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // INDEX DO PHONEBOOK
            System.out.println("\t\t\tBEM-VINDO AO SEU PHONEBOOK!\n\n");
            System.out.println("n --> Cria uma nova pessoa na agenda:");
            System.out.println("\tsolicita o nome: entra com o nome da pessoa que será criada!");
            System.out.println("\tsolicita o telefone: entra com o telefone da pessoa");
            System.out.println("d --> Deleta uma pessoa da agenda:");
            System.out.println("\tsolicita o nome: entra com nome da pessoa que será excluída");
            System.out.println("p -->Imprime toda a agenda.");
            System.out.println("s --> imprime uma pessoa da agenda ou uma frase que a pessoa não encontrada:");
            System.out.println("\tsolicita o nome: entra com nome da pessoa que será apresentada.");
            System.out.println("q --> Sai do programa!!!\n\n\n");

            char x = input.next().charAt(0);
            switch (x) {
                case 'n':
                    System.out.println("Insira o NOME do novo contato:");
                    String n1 = input.next();
                    System.out.println("\nInsira o TELEFONE do novo contato:");
                    String n2 = input.next();

                    PhoneBook p = new PhoneBook(n1, n2);
                    pho.add(p);

                    break;
                case 'd':
                    System.out.print("Nome do contato: ");
                    String nome = input.next();
                    for (PhoneBook del : pho) {
                        if (nome.equals(del.getNome())) {
                            System.out.println("Deletando " + del.getNome());
                            pho.remove(del);
                        }
                    }
                    break;
                case 'p':
                    if (pho.size() == 0) {
                        System.out.println("PHONEBOOK ESTA VAZIO!!\n ADICIONE NOVOS CONTATOS");
                    } else {
                        pho.forEach(obj -> {
                            obj.print();
                        });
                    }
                    while (true) {
                        fim = input.next().charAt(0);
                        if (fim == '0') {
                            break;
                        }
                    }
                    break;
                case 's':
                    System.out.println("Insira o NOME do contato:");
                    String varNome = input.next();
                    for (PhoneBook obj : pho) {
                        if (obj.getNome().equals(varNome)) {
                            obj.print();
                        }

                    }
                    while (true) {
                        fim = input.next().charAt(0);
                        if (fim == '0') {
                            break;
                        }
                    }
                    break;
                case 'q':
                    System.exit(0);
                    break;
                default:
                    System.out.println(
                            "Não existe um mês correspondente ao número escolhido! Digite um número entre 1 a 12.");
            }
        }
    }
}