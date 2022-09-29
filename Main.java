import carros.Carro;
import carros.Fiat;
import carros.Honda;
import carros.Tesla;

public class Main {
  public static void main(String[] args) {
    Fiat novoFiat = new Fiat(
      1,
      "Pulse",
      "vermelho",
      true,
      2,
      true,
      5
    );

    Honda novoHonda = new Honda(
      2,
      "Civic",
      "chumbo",
      true,
      2,
      true,
      true
    );

    Tesla novoTesla = new Tesla(
      3,
      "Roadster",
      "preto",
      true,
      2,
      true,
      120
    );

    Carro[] novosCarros = { novoFiat, novoHonda, novoTesla };

    Concecionaria novaConcecionaria = new Concecionaria(
      "Concecionaria do Inatel",
      novosCarros
    );

    novaConcecionaria.mostraInfo();
  }
}