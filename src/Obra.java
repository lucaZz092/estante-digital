public class Obra {
    private String nome;
    private String autor;
    private int anoPublicacao;
    private double somaAvaliacoes;
    private int totalAvaliacoes;

    //METODOS
    public void avalia(double nota){
        if(nota < 0 || nota > 10){
            System.out.println("A nota deve ser maior do que 0 e menor que 10.");
        } else {
            somaAvaliacoes += nota;
            totalAvaliacoes++;
        }
    }
    public double media(){
        return somaAvaliacoes / totalAvaliacoes;
    }

    // GETTERS E SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }
}
