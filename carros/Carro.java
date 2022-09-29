package carros;

public abstract class Carro {
  int id;
  String nome;
  String cor;
  boolean carroDisponivel;
  int cont;

  public Carro(
    int id,
    String nome,
    String cor,
    boolean carroDisponivel
  ) {
    this.id = id;
    this.nome = nome;
    this.cor = cor;
    this.carroDisponivel = carroDisponivel;
    this.cont++;
  }

  public abstract void mostraInfo();

  public void venderCarro() {
    if (carroDisponivel) {
      System.out.println("Carro vendido");
    } else {
      System.out.println("Carro indisponível");
    }
  }
}
