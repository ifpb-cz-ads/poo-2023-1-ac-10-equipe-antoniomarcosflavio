public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setNotaMatematica (double temp) {
        notaMatematica = temp;
    }

    public void setNotaPortugues (double temp) {
        notaPortugues = temp;
    }

    public void setNotaGeografia (double temp) {
        notaGeografia = temp;
    }

    public double getNotaMatematica() {
        return this.notaMatematica;
    } 

    public double getNotaPortugues() {
        return this.notaPortugues;
    } 

    public double getNotaGeografia() {
        return this.notaGeografia;
    } 


    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica+notaGeografia+notaPortugues)/3;
        return resultado;
    }

    public static int getQuantidadeAlunos() {
        return contadorEstudante;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }

    public void imprimir(double mNota, double pNota, double gNota) {
        System.out.println("Nome: " + nome);
        System.out.println("Nota Matematica: " + mNota);
        System.out.println("Nota Portugues: " + pNota);
        System.out.println("Nota Geografia: " + gNota);
    }

}