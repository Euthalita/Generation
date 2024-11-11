public class TvLg implements ControleRemoto, Conectividade {
    private boolean ligado = false;
    private int canal_atual = 1;

    @Override
   public void ligar(){
        ligado = true;
        System.out.println("TV LG ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV LG desligada.");

    }

    @Override
    public void mudarCanal(int canal) {
        if (ligado) {
            canal_atual = canal;
            System.out.println("Canal "+canal_atual+ " mudado.");
        }
    }

    @Override
    public void conectarInternet() {
        System.out.println("TV conectada á internet!");
    }
}
