public class Motocicleta extends Veiculo {
    private ModeloMotocicleta modelo;

    // Construtor
    public Motocicleta(ModeloMotocicleta modelo, Marca marca, Estado estado, Categoria categoria, double valorDeCompra, String placa, int ano) {
        super(marca, estado, categoria, valorDeCompra, placa, ano);
        this.modelo = modelo;
    }

    // Implemente os métodos abstratos da classe Veiculo
    @Override
    public double getValorDiariaLocacao() {
        // Implemente o cálculo do valor da diária para motocicleta
        return 0.0; // Substitua pelo cálculo real
    }

    @Override
    public double getValorParaVenda() {
        // Implemente o cálculo do valor para venda de motocicleta
        return 0.0; // Substitua pelo cálculo real
    }
}
