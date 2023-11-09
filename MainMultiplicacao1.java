public class MainMultiplicacao1 {
    public static void main(String[] args) {
        int posicoes100000 = 100000;
        int colisoes = 0;
        Hash carrohash100000 = new Hash(posicoes100000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemMultiplicacao(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(199992606);
        carrohash100000.adicionarItemMultiplicacao(re1);
        carrohash100000.buscarItemMultiplicacao(re1);
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainMultiplicacao2{
    public static void main(String[] args) {
        int colisoes = 0;
        int posicoes200000 = 200000;
        Hash carrohash200000 = new Hash(posicoes200000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemMultiplicacao(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(603772174);
        carrohash200000.adicionarItemMultiplicacao(re1);
        carrohash200000.buscarItemMultiplicacao(re1);
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainMultiplicacao3{
    public static void main(String[] args) {
        int colisoes = 0;
        int posicoes300000 = 300000;
        Hash carrohash300000 = new Hash(posicoes300000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemMultiplicacao(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(138323203);
        carrohash300000.adicionarItemMultiplicacao(re1);
        carrohash300000.buscarItemMultiplicacao(re1);
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainMultiplicacao4{
    public static void main(String[] args) {
        int colisoes = 0;
        int posicoes400000 = 400000;

        Hash carrohash400000 = new Hash(posicoes400000);
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemMultiplicacao(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(138323203);
        carrohash400000.adicionarItemMultiplicacao(re1);
        carrohash400000.buscarItemMultiplicacao(re1);
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainMultiplicacao5{
    public static void main(String[] args) {
        int colisoes = 0;
        int posicoes500000 = 500000;

        Hash carrohash500000 = new Hash(posicoes500000);
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemMultiplicacao(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemMultiplicacao(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(118888888);
        carrohash500000.adicionarItemMultiplicacao(re1);
        carrohash500000.buscarItemMultiplicacao(re1);
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}
