package builder;

public class ComputadorPadraoBuilder implements ComputadorBuilder {
    private String cpu;
    private String ram;
    private String armazenamento;

    @Override
    public ComputadorPadraoBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputadorPadraoBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputadorPadraoBuilder setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    @Override
    public Computador build() {
        return new Computador(cpu, ram, armazenamento);
    }
}
