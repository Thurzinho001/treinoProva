public class Casa {
    String endereco;
    int numero;

    public class Porta {
        String cor;
        boolean aberta;

        public Porta(String cor, boolean aberta) {
            this.cor = cor;
            this.aberta = aberta;
        }

        public void mostraEstado() {
            System.out.println("Cor da porta: " + cor + ", Aberta: " + aberta);
        }
    }
}
