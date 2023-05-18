public class Animal {
    protected String nome;
    protected double peso;
    protected String sexo;
    protected float fome;
    protected float sono;
    protected float felicidade;

    public String getNome() {
        return this.nome;
    }
    public double getPeso() {
        return this.peso;
    }
    public String getSexo() {
        return this.sexo;
    }
    public float getFome() {
        return this.fome;
    }
    public float getSono() {
        return this.sono;
    }
    public float getFelicidade() {
        return this.felicidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setFome(float fome) {
        this.fome = fome;
    }
    public void setSono(float sono) {
        this.sono = sono;
    }
    public void setFelicidade(float felicidade) {
        this.felicidade = felicidade;
    }

    public void dormir() {
        this.sono++;
    }
    public void comer() {
        this.fome++;
        this.peso += 1/2;
    }
    public void brincar() {
        this.fome--;
        this.sono--;
        this.felicidade++;
    }
    public void fazerBarulho() {
        this.fome--;
        System.out.println("RAWWWW");
    }
}