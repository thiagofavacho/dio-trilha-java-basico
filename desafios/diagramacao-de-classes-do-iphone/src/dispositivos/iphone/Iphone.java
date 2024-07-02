package dispositivos.iphone;

import dispositivos.ipod.ReprodutorMusical;
import dispositivos.navegador.NavegadorInternet;
import dispositivos.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA VIA IPHONE14!");
    }
    public void tocar() {
        System.out.println("TOCANDO MÚSICA VIA IPHONE14!"); 
    }
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA VIA IPHONE14!");
    }

    public void adicionarNovaAba(String url) {
        System.out.println("ADICIONANDO NOVA PÁGINA VIA IPHONE14!");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA VIA IPHONE14!");
    }
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA VIA IPHONE14!");
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO VIA IPHONE14!");
    }
    public void ligar(String numero) {
        System.out.println("REALIZANDO LIGAÇÃO VIA IPHONE14!");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE14!");
    }
    
}
