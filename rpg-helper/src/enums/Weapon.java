package enums;

public enum Weapon {
    //ARMA(Preco, Dano, Peso),
    ADAGA(2, "1d4", 0.5),
    CLAVA_GRANDE(2, "1d8", 5),
    MACHADINHA(5, "1d6", 1),
    ESPADA_LONGA(15, "1d8", 1.5),
    MACHADO_GRANDE(30, "1d12", 3.5),
    MARTELO_DE_GUERRA(15, "1d8", 1),
    RAPIEIRA(25, "1d8", 1),
    TRIDENTE(5, "1d6", 2);

    private int preco;
    private String dano;
    private double peso;
    Weapon(int preco, String dano, double peso){
        this.preco = preco;
        this.dano = dano;
        this.peso = peso;
    }

    public int getPreco() {
        return preco;
    }
    public String getDano() {
        return dano;
    }
    public double getPeso() {
        return peso;
    }
}
