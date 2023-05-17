public class AppRegistraAluno {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno();
        aluno1.setNome("Flavio");
        aluno1.setEndereco("Sousa");
        aluno1.setIdade(18);
        aluno1.setNotaMatematica(10.0);
        aluno1.setNotaPortugues(7.0);
        aluno1.setNotaGeografia(5.0);

        aluno1.imprimir();
    }

}