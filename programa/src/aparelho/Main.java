package aparelho;


public class Main {

  public static void main(String[] args) {
    AparelhoIphone aparelho = new AparelhoIphone();

    System.out.println("------------->");
    aparelho.selecionarMusica("Los Hermanos");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(40028922);

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}