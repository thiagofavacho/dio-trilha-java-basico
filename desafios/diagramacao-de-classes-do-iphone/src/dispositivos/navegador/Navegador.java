package dispositivos.navegador;

public class Navegador implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba(String url) {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
    
}
