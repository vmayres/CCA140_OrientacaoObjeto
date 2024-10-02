public class Main {
    public static void main(String[] args) {
        //OBJETOS CRIADOS
        Livro l1 = new Livro("O REI DE AMARELO", "Robert W. Chambers", 12, 288, true);
        Livro l2 = new Livro();
        l2.nome = "ASSASSINATOS NA RUA MORGUE";
        l2.autor = "Edgar Allan Poe";
        l2.edicao = 6;
        l2.paginas = 21;
        l2.alocado = false;

        Jornal j1 = new Jornal("ESTADÃO", "01/11/2002", false);
        Jornal j2 = new Jornal();
        j2.edit = "CIDADE";
        j2.data = "27/07/2016";
        j2.alocado = false;

        Revista r1 = new Revista("RECREIO", "11/08/2006", false);
        Revista r2 = new Revista();
        r2.edit = "VEJA";
        r2.data = "15/06/2014";
        r2.alocado = true;

        //MAIN FUNCTION
        System.out.printf("NOME;%s\nAUTOR;%s DATA PLUB.;%d Nº PAGINAS;%d ALOCADO?;%b\n\n",l1.nome, l1.autor, l1.edicao, l1.paginas, l1.alocado);
        System.out.printf("NOME;%s\nAUTOR;%s DATA PLUB.;%d Nº PAGINAS;%d ALOCADO?;%b\n\n",l2.nome, l2.autor, l2.edicao, l2.paginas, l2.alocado);
        System.out.printf("NOME;%S\nDATA PLUB.;%s ALOCADO?;%b\n\n",j1.edit, j1.data, j1.alocado);
        System.out.printf("NOME;%S\nDATA PLUB.;%s ALOCADO?;%b\n\n",j2.edit, j2.data, j2.alocado);
        System.out.printf("NOME;%S\nDATA PLUB.;%s ALOCADO?;%b\n\n",r1.edit, r1.data, r1.alocado);
        System.out.printf("NOME;%S\nDATA PLUB.;%s ALOCADO?;%b\n\n",r2.edit, r2.data, r2.alocado);
    }
}