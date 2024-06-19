public class Usuario{
	public static void main(String[] args) {
		//Instanciando um objeto da classe IPhone
		IPhone iPhone = new IPhone();
		//Testando reprodutor musical
		System.out.println("----Reprodutor Musical----");
		iPhone.tocar();
		iPhone.selecionarMusica("Pink Floyd - The Great Gig On The Sky");
		iPhone.pausar();
        //Testando Aparelho Telefônico
        System.out.println("----Aparelho Telefônico----");
        iPhone.atender();
        iPhone.ligar("12345678");
        iPhone.iniciarCorreioVoz();
        //Testando o Navegador de Internet
        System.out.printl("----Navegador de Internet----");
        iPhone.exibirPagina("https://www.dio.me/sign-in");
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
	}
}