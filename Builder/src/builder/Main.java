package builder;

public class Main {
	public static void main(String[] args) {
        ComputadorBuilder builderGamer = new ComputadorPadraoBuilder();
        Computador pcGamer = builderGamer
            .setCpu("Intel i9")
            .setRam("32GB")
            .setArmazenamento("1TB SSD")
            .build();

        System.out.println("PC Gamer: " + pcGamer);

        ComputadorBuilder builderBasico = new ComputadorPadraoBuilder();
        Computador pcBasico = builderBasico
            .setCpu("Intel i3")
            .setRam("8GB")
            .setArmazenamento("256GB SSD")
            .build();

        System.out.println("PC Básico: " + pcBasico);
    }
}
