public class PhoneBook {
    private String nome;
    private String numero;

    public PhoneBook(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void print() {
        System.out.println("*Nome: " + this.nome);
        System.out.println("*Numero: " + this.numero + "\n");
    }

    public String getNome() {
        return nome;
    }
}
