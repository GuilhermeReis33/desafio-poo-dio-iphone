public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        iPhone.ligar();
        iPhone.inicarCorreioVoz();
        iPhone.atender();

        iPhone.addNovaPagina();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
    }
}