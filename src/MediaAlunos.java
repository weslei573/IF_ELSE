public class MediaAlunos {
    public static void main(String[] args) {
        double media = 7;

        if (media >= 7.0) {
            System.out.println("O aluno teve média " + media + " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O aluno teve média " + media + " está de recuperação.");
        } else {
            System.out.println("O aluno teve média " + media + " e foi reprovado.");
        }
    }
}
