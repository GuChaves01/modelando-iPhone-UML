public class Iphone {
    public static void main(String[] args) throws Exception {
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.dio.me");
        navegador.atualizarPagina();

        PlayerDeMusica musicPlayer = new PlayerDeMusica();
        musicPlayer.selecionarMusica("Rodo Cotidiano");
        musicPlayer.tocar();
        musicPlayer.pausar();

        Telefone telef = new Telefone();
        telef.iniciarCorreioVoz();
        telef.atender();
        telef.ligar("012 34567-8901");
    }
}
