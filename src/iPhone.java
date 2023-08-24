public class iPhone implements  Safari, AparelhoTelefonico, iTunes{
    @Override
    public void ligar() {
        System.out.println("iPhone está ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página do Safari!");
    }

    @Override
    public void addNovaPagina() {
        System.out.println("Adicionando nova página no Safari!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página está sendo atualizada... Por favor aguarde!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Você está selecionando uma música!");
    }
}
