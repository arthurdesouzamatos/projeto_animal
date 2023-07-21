public class Animal {
    private String nome;
    private double peso;

    public void fazerBarulho() {
        System.out.println("fazendo barulho");
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void exibeFichaCachorro() {
        System.out.println("O nome do cachorro é " + nome);
        System.out.println("Peso do Cachorro: " + peso);
    }
}