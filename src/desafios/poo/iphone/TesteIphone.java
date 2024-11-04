package desafios.poo.iphone;

public class TesteIphone {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuIphone = new iPhone();

        // Testando os métodos do iPhone
        meuIphone.tocar();
        meuIphone.selecionarMusica("Despacito");
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
