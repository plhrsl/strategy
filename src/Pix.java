public class Pix implements Pagamento{
    private String chave;

    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pago no pix...\n", valor);
    }   
}
