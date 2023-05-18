public class AppRegistraAluno2 {
    public static void main(String[] args) {
        RegistraAluno aluno2 = new RegistraAluno();
        aluno2.setNome("Antonio Marcos");
        aluno2.setEndereco("Cajazeiras");
        aluno2.setIdade(24);
        aluno2.setNotaMatematica(10.0);
        aluno2.setNotaPortugues(10.0);
        aluno2.setNotaGeografia(10.0);

        aluno2.imprimir(aluno2.getNotaMatematica() ,aluno2.getNotaPortugues() ,aluno2.getNotaGeografia());
    }

}