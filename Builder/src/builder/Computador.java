package builder;

public class Computador {
    private String cpu;
    private String ram;
    private String armazenamento;

    public Computador(String cpu, String ram, String armazenamento) {
        this.cpu = cpu;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ", RAM: " + ram + ", Armazenamento: " + armazenamento;
    }
}
