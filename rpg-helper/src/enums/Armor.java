package enums;

public enum Armor {
    //ARMADURA(Preco, Classe de Armadura, Peso),
    ACOLCHOADA(5, 11, 4),
    COURO_BATIDO(45, 12, 6.5),

    CAMISAO_DE_MALHA(50, 13, 10),
    MEIA_ARMADURA(750, 15, 20),

    COTA_DE_ANEIS(30, 14, 20),
    COTA_DE_TALAS(200, 17, 30),

    ESCUDO(10, 2, 3);

    private int preco;
    private int classe_armadura;
    private double peso;

    Armor(int preco, int classe_armadura, double peso){
        this.preco = preco;
        this.classe_armadura = classe_armadura;
        this.peso = peso;
    }

    public int getPreco() {
        return preco;
    }
    public int getClasse_armadura() {
        return classe_armadura;
    }
    public double getPeso() {
        return peso;
    }

}
