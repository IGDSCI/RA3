public class MainDobramento1 {
    public static void main(String[] args) {
        int posicoes100000 = 100000;
        int colisoes = 0;
        Hash carrohash100000 = new Hash(posicoes100000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        carrohash100000 = new Hash(posicoes100000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash100000.adicionarItemDobramento(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash100000.getColisoes();
        carrohash100000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(212599960);
        carrohash100000.adicionarItemDobramento(re1);
        carrohash100000.buscarItemDobramento(re1);
        System.out.println(carrohash100000.getComparacoes());
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainDobramento2 {
    public static void main(String[] args) {
        int posicoes200000 = 200000;
        int colisoes = 0;
        Hash carrohash200000 = new Hash(posicoes200000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemDobramento(registro);
        }

        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        carrohash200000 = new Hash(posicoes200000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash200000.adicionarItemDobramento(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash200000.getColisoes();
        carrohash200000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(212599960);
        carrohash200000.adicionarItemDobramento(re1);
        carrohash200000.buscarItemDobramento(re1);
        System.out.println(carrohash200000.getComparacoes());
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainDobramento3 {
    public static void main(String[] args) {
        int posicoes300000 = 300000;
        int colisoes = 0;
        Hash carrohash300000 = new Hash(posicoes300000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        carrohash300000 = new Hash(posicoes300000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash300000.adicionarItemDobramento(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash300000.getColisoes();
        carrohash300000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(212592260);
        carrohash300000.adicionarItemDobramento(re1);
        carrohash300000.buscarItemDobramento(re1);
        System.out.println(carrohash300000.getComparacoes());
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainDobramento4 {
    public static void main(String[] args) {
        int posicoes400000 = 400000;
        int colisoes = 0;
        Hash carrohash400000 = new Hash(posicoes400000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        carrohash400000 = new Hash(posicoes400000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash400000.adicionarItemDobramento(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash400000.getColisoes();
        carrohash400000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(212192260);
        carrohash400000.adicionarItemDobramento(re1);
        carrohash400000.buscarItemDobramento(re1);
        System.out.println(carrohash400000.getComparacoes());
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}


class MainDobramento5 {
    public static void main(String[] args) {
        int posicoes500000 = 500000;
        int colisoes = 0;
        Hash carrohash500000 = new Hash(posicoes500000);

        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 100000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 500000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 1000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemDobramento(registro);
        }
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        carrohash500000 = new Hash(posicoes500000);

        for (int i = 0; i < 5000000; i++) {
            Registro registro = new Registro(Registro.gerarChassiAleatorio());
            carrohash500000.adicionarItemDobramento(registro);
        }
        long tempoFinal = System.currentTimeMillis();
        colisoes = colisoes + carrohash500000.getColisoes();
        carrohash500000.imprimir();
        System.out.println(tempoFinal - tempoInicial);
        System.out.println(colisoes);

        tempoInicial = System.nanoTime();
        Registro re1 = new Registro(212592620);
        carrohash500000.adicionarItemDobramento(re1);
        carrohash500000.buscarItemDobramento(re1);
        System.out.println(carrohash500000.getComparacoes());
        tempoFinal = System.nanoTime();
        System.out.println(tempoFinal - tempoInicial);
    }
}