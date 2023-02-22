package Iphone.Domain.Models;

import Iphone.Domain.Interfaces.IAparelhoTelefonico;
import Iphone.Domain.Interfaces.INavegadorInternet;
import Iphone.Domain.Interfaces.IReprodutorMusical;

public class Phone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical{

  @Override
  public void tocarMusica() {
    System.out.println("Tocando Musica!");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Musica Pausada!");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Musica Selecionada!");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo nova página!");
  }

  @Override
  public void AdicionarNovaAba() {
    System.out.println("Adicionando nova aba!");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página!");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando para contato!");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo Ligação!");
  }

  @Override
  public void iniciarCorreioDeVoz() {
    System.out.println("Iniciando Correio de Voz!");
  }
  
}
