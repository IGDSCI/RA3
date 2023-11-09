import java.util.Random;

public class Registro {
    private int chassi;
    private static Random random = new Random(12345L);

    public Registro(int chassi) {
        this.chassi = chassi;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public static int gerarChassiAleatorio() {
        return 100000000 + random.nextInt(900000000);
    }
}
