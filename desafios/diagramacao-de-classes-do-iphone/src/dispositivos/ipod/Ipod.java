package dispositivos.ipod;

public class Ipod implements ReprodutorMusical {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
}
