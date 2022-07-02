public class Test {
    public static void main(String[] args) {
        Compra compra = new Compra();

        compra.setPagamento(new Cartao("", "", "", ""));
        compra.pagar(99.99);

        compra.setPagamento(new Pix(""));
        compra.pagar(59.99);
    }
}
