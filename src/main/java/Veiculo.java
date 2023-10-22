public abstract class Veiculo {
    private Marca marca;
    private Estado estado;
    private Categoria categoria;
    private double valorDeCompra;
    private String placa;
    private int ano;

    // Construtor
    public Veiculo(Marca marca, Estado estado, Categoria categoria, double valorDeCompra, String placa, int ano) {
        this.marca = marca;
        this.estado = estado;
        this.categoria = categoria;
        this.valorDeCompra = valorDeCompra;
        this.placa = placa;
        this.ano = ano;
    }

    // Métodos abstratos que devem ser implementados nas subclasses
    public abstract double getValorDiariaLocacao();
    public abstract double getValorParaVenda();

    // Getters e Setters
}
