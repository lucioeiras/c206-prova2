package carros;

public class Tesla extends Carro {
  boolean eletrico;
  int potencia;

  public Tesla(
    int id, 
    String nome, 
    String cor, 
    boolean carroDisponivel, 
    int cont, 
    boolean eletrico, 
    int potencia
  ) {
    super(id, nome, cor, carroDisponivel);

    this.eletrico = eletrico;
    this.potencia = potencia;
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

    System.out.print("É elétrico? ");
    
    if (eletrico) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    System.out.println("Potência: " + this.potencia);

    this.ligarMotor();
    this.acelerar();
    this.desligarMotor();

    System.out.println();
  }

  public void acelerar() {
    System.out.println("Acelerando o carro " + this.nome);
  }

  public void ligarMotor() {
    System.out.println(this.nome + " ligou o motor");
  }

  public void desligarMotor() {
    System.out.println(this.nome + " desligou o motor");
  }
}
