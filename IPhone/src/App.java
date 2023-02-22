import Iphone.Domain.Models.Phone;

public class App {
    public static void main(String[] args) throws Exception {
        Phone Iphone = new Phone();

        Iphone.atender();
        Iphone.ligar();
        Iphone.iniciarCorreioDeVoz();
        Iphone.tocarMusica();
        Iphone.pausarMusica();
        Iphone.selecionarMusica();
        Iphone.exibirPagina();
        Iphone.AdicionarNovaAba();
        Iphone.atualizarPagina();
    }
}
