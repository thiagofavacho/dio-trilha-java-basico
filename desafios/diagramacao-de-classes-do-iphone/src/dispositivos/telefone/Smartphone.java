package dispositivos.telefone;

public class Smartphone implements AparelhoTelefonico {
    
    public void ligar(String numero) {
        System.out.println("REALIZANDO LIGAÇÃO");
    }
    
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");;
    }
        
}
