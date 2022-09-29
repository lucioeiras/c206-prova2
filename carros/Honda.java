package carros;

public class Honda extends Carro {
  boolean flex;
  boolean tracao;

  public Honda(
    int id, 
    String nome, 
    String cor, 
    boolean carroDisponivel, 
    int cont, 
    boolean flex, 
    boolean tracao
  ) {
    super(id, nome, cor, carroDisponivel);

    this.flex = flex;
    this.tracao = tracao;
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

    System.out.print("É flex? ");
    
    if (flex) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    System.out.print("Tem tração nas 4 rodas? ");
    
    if (tracao) {
      System.out.println("Sim");
    } else {
      System.out.println("Não");
    }

    this.ligarMotor();
    this.abastecer();
    this.desligarMotor();

    System.out.println();
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
