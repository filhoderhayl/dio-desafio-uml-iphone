public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("|> Tocando música!");
    }
    public void pausar(){
        System.out.println("|| Música Pausada!");
    }
    public void selecionarMusica(String musica){
        System.out.println("Música '"+musica+"' selecionada!");
    }
    public void ligar(String numero){
        System.out.println("Ligando para o número "+numero);
    }
    public void atender(){
        System.out.println("Atendendo Ligação!");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo página com a url -> "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }
    public void atualizarPagina(){
        System.out.println("Página Atualizada!");
    }
}