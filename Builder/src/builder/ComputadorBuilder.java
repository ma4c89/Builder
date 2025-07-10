package builder;

public interface ComputadorBuilder {
    ComputadorBuilder setCpu(String cpu);
    ComputadorBuilder setRam(String ram);
    ComputadorBuilder setArmazenamento(String armazenamento);
    Computador build();
}
