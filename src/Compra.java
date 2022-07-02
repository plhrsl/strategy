public class Compra {
    private Pagamento pagamento;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void pagar(double valor) {
        pagamento.pagar(valor);
    }
}
