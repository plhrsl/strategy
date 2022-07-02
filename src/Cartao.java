public class Cartao implements Pagamento {
    private String nome;
    private String numero;
    private String cvv;
    private String dataExp;

    public Cartao(String nome, String numero, String cvv, String dataExp) {
        this.nome = nome;
        this.numero = numero;
        this.cvv = cvv;
        this.dataExp = dataExp;
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("R$%.2f pago no cartão...\n", valor);
    }
}
