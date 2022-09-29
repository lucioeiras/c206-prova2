import carros.Carro;

public class Concecionaria {
  String nome;
  Carro[] carros;

  public Concecionaria(String nome, Carro[] carros) {
    this.nome = nome;
    this.carros = carros;
  }

  public void mostraInfo() {
    for (Carro carro : carros) {
      carro.mostraInfo();
    }
  }
}
