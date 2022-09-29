package carros;

import interfaces.Desligar;
import interfaces.Ligar;
import interfaces.Posto;

public class Fiat 
  extends Carro 
  implements Ligar, Desligar, Posto 
{
  boolean popular;
  int capacidadeMax;

  public Fiat(
    int id, 
    String nome, 
    String cor, 
    boolean carroDisponivel, 
    int cont, 
    boolean popular, 
    int capacidadeMax
  ) {
    super(id, nome, cor, carroDisponivel);

    this.popular = popular;
    this.capacidadeMax = capacidadeMax;
  }

  @Override
  public void mostraInfo() {
    System.out.println("ID: " + this.id);
    System.out.println("Nome: " + this.nome);
    System.out.println("Cor: " + this.cor);
    System.out.print("Está disponível? ");
    
    if (carroDisponivel) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    System.out.print("É popular? ");
    
    if (popular) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    System.out.println("Capacidade máxima: " + this.capacidadeMax);

    this.ligarMotor();
    this.abastecer();
    this.pegarPassageiro();
    this.desligarMotor();

    System.out.println();
  }

  public void pegarPassageiro() {
    System.out.println("Passageiro a bordo do carro " + this.nome);
  }

  public void ligarMotor() {
    System.out.println(this.nome + " ligou o motor");
  }

  public void desligarMotor() {
    System.out.println(this.nome + " desligou o motor");
  }

  public void abastecer() {
    System.out.println("Carro abastecido");
  }
}
