public class Hash {
    private int posicoes;
    private Lista[] estruturaHash;
    private int num_itens;
    private int colisoes;
    private int comparacoes;

    public Hash(int posicoes) {
        this.posicoes = posicoes;
        this.estruturaHash = new Lista[posicoes];
        this.num_itens = 0;
    }

    public int getColisoes() {
        return colisoes;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int funcaoHash(Registro registro) {
        return  registro.getChassi() % posicoes;
    }

    public int funcaoHashMultiplicacao(Registro registro) {
        int hash = 13;
        hash = 7 * hash + posicoes;
        hash = 7 * hash + num_itens;

        if (registro != null) {
            hash = 7 * hash + registro.getChassi();
        }

        return hash % posicoes;
    }

    public int funcaoHashDobramento(Registro registro) {
        int chassi = registro.getChassi();
        int soma = 0;

        while (chassi > 0) {
            int digito = chassi % 10;
            soma = (soma * 10) + digito;
            chassi /= 10;
        }

        return soma % posicoes;
    }


    public void adicionarItem(Registro registro) {
        int indice = funcaoHash(registro);
        Lista novoLista = new Lista(registro);

        if (estruturaHash[indice] != null) {
            Lista atual = estruturaHash[indice];
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoLista);
            colisoes++;
        } else {
            estruturaHash[indice] = novoLista;
            num_itens++;
        }
    }


    public void adicionarItemMultiplicacao(Registro registro) {
        int indice = funcaoHashMultiplicacao(registro);
        Lista novoLista = new Lista(registro);

        if (estruturaHash[indice] != null) {
            Lista atual = estruturaHash[indice];
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoLista);
            colisoes++;
        } else {
            estruturaHash[indice] = novoLista;
            num_itens++;
        }
    }

    public void adicionarItemDobramento(Registro registro) {
        int indice = funcaoHashDobramento(registro);
        Lista novoLista = new Lista(registro);

        if (estruturaHash[indice] != null) {
            Lista atual = estruturaHash[indice];
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoLista);
            colisoes++;
        } else {
            estruturaHash[indice] = novoLista;
            num_itens++;
        }
    }



    public Registro buscarItem(Registro chassi) {
        int indice = funcaoHash(chassi);
        Lista lista = estruturaHash[indice];

        while (lista != null) {
            Registro registro = lista.getRegistro();
            if (registro.getChassi() == chassi.getChassi()) {
                System.out.println("O Chassi " + registro.getChassi() + " foi encontrado.");
                return registro;
            }
            lista = lista.getProximo();
            comparacoes++;
        }

        System.out.println("O Chassi " + chassi.getChassi() + " não foi encontrado.");
        return null;
    }


    public Registro buscarItemDobramento(Registro chassi) {
        int indice = funcaoHashDobramento(chassi);
        Lista lista = estruturaHash[indice];

        while (lista != null) {
            Registro registro = lista.getRegistro();
            if (registro.getChassi() == chassi.getChassi()) {
                System.out.println("O Chassi " + registro.getChassi() + " foi encontrado.");
                return registro;
            }
            lista = lista.getProximo();
            comparacoes++;
        }

        System.out.println("O Chassi " + chassi.getChassi() + " não foi encontrado.");
        return null;
    }

    public Registro buscarItemMultiplicacao(Registro chassi) {
        int indice = funcaoHashMultiplicacao(chassi);
        Lista lista = estruturaHash[indice];

        while (lista != null) {
            Registro registro = lista.getRegistro();
            if (registro.getChassi() == chassi.getChassi()) {
                System.out.println("O Chassi " + registro.getChassi() + " foi encontrado.");
                return registro;
            }
            lista = lista.getProximo();
            comparacoes++;
        }

        System.out.println("O Chassi " + chassi.getChassi() + " não foi encontrado.");
        return null;
    }

    public void removerItem(Registro chassi) {
        int indice = funcaoHash(chassi);
        Lista lista = estruturaHash[indice];
        Lista anterior = null;

        while (lista != null) {
            Registro registro = lista.getRegistro();
            if (registro.getChassi() == chassi.getChassi()) {
                if (anterior == null) {
                    estruturaHash[indice] = lista.getProximo();
                } else {
                    anterior.setProximo(lista.getProximo());
                }
                System.out.println("O Chassi " + chassi + " foi removido.");
                num_itens--;
                return;
            }
            anterior = lista;
            lista = lista.getProximo();
        }
        System.out.println("O Chassi " + chassi + " não foi encontrado e não pode ser removido.");
    }

    public void imprimir() {
        System.out.println("Tabela Hash: ");
        for (int i = 0; i < posicoes; i++) {
            Lista lista = estruturaHash[i];
            if (lista != null) {
                System.out.print(i + ": ");
                while (lista != null) {
                    System.out.print(lista.getRegistro().getChassi() + " ");
                    lista = lista.getProximo();
                }
                System.out.println();
            } else {
                System.out.println(i + ": Vazio");
            }
        }
    }
}
