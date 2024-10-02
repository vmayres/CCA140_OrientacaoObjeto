public class Livro {
    public String nome;
    public String autor;
    public int edicao;
    public int paginas;
    public boolean alocado;

    public Livro(){}

    public Livro(String nome, String autor, int edicao, int paginas, boolean alocado){
        this.nome = nome;
        this.autor = autor;
        this.edicao = edicao;
        this.paginas = paginas;
        this.alocado = alocado;
    }

}
