import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
  
  public static void main(String[] args) {
    //Controle da aplicação Biblioteca
    Pessoa novoAluno = new Aluno();
    Pessoa novoProfessor = new Professor();
    Livro novoLivro = new Livro();
    Biblioteca biblioteca = new Biblioteca();
    Aluno alunoCadastrado = biblioteca.cadastrarAluno(novoAluno);
    System.out.println("Novo Aluno cadastrado com sucesso! " + alunoCadastrado.toString());
    biblioteca.cadastrarProfessor(novoProfessor);
    biblioteca.cadastrarLivro(novoLivro);
    List<Livro> livrosList = new ArrayList<>();
    livrosList.add(novoLivro);
    Emprestimo novoEmprestimo = new Emprestimo(novoAluno, livrosList);
    biblioteca.realizarEmprestimo(novoEmprestimo);
    
    //novoEmprestimo.dataInicio = LocalDate.of(2024, 10, 1);
    
  }
  
}
