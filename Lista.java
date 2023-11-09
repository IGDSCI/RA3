public class Lista {
    private Registro registro;
    private Lista proximo;

    public Lista(Registro registro) {
        this.registro = registro;
        this.proximo = null;
    }

    public Registro getRegistro() {
        return registro;
    }

    public Lista getProximo() {
        return proximo;
    }

    public void setProximo(Lista proximo) {
        this.proximo = proximo;
    }
}
