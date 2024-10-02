public class App {

    public static void main(String[] args) throws Exception {
        // por padrao todas sa tvs sao desligadas
        // criando os objetos
        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao(10, 5);
        Televisao t3 = new Televisao(10, 15, true);

        // criando arranjo de obijetos
        Televisao[] arr = { t1, t2, t3 };

        for (Televisao i : arr) {
            // canal 0 = sem respota (desligado)
            System.out.println("canal: " + i.getCanal());
            System.out.println("som: " + i.getSom());
            System.out.println("ligado: " + i.getLigado());
            i.onoff();
            System.out.println("liagdo: " + i.getLigado());
            System.out.println("canal: " + i.getCanal());
            System.out.println("som: " + i.getSom() + "\n");

        }

        t1.setCanal(1);
        t1.setSom(0); // mudo
        t1.setLigado(true); // garantir que a televeisao esta ligada

        // incrementa status
        System.out.println("// incrementa status");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.aumentaSom();
            t1.sobeCanal();
            t1.printStatus();
        }

        // decrementa status
        System.out.println("// decrementa status");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.diminuiSom();
            t1.deceCanal();
            t1.printStatus();
        }

        t1.setCanal(1);
        // teste de canal maximo e minimo ( > 64 volta para 1 )
        System.out.println("// teste canal maximo e minimo");
        for (int i = 0; i <= 64; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.sobeCanal();
            t1.printStatus();
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.deceCanal();
            t1.printStatus();
        }

        t1.setSom(0);
        // teste de som maximo eminomo
        System.out.println("// teste som maximo e minimo");
        for (int i = 0; i <= 12; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.aumentaSom();
            t1.printStatus();
        }

        for (int i = 0; i <= 12; i++) {
            System.out.println("Status TV 1: " + i + "º");
            t1.diminuiSom();
            t1.printStatus();
        }

        // teste de tv desligada
        System.out.println("//teste de tv desligada");
        t2.setCanal(1);
        t2.setSom(0);
        t2.setLigado(false);

        System.out.println("Status TV 2: ");
        t2.printStatus();

        for (int i = 0; i <= 10; i++) {
            t2.aumentaSom();
            t2.sobeCanal();
        }

        System.out.println("Status TV 2: ");
        t2.printStatus();

        // liga a tv
        t2.onoff();
        System.out.println();

        System.out.println("Status TV 2: ");
        t2.printStatus();

        for (int i = 0; i <= 10; i++) {
            t2.aumentaSom();
            t2.sobeCanal();
        }

        System.out.println("Status TV 2: ");
        t2.printStatus();
    }
}
