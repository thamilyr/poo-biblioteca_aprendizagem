import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  
  List<Livro> livrosList = new ArrayList<>();
  List<Emprestimo> historicoEmprestimoList = new ArrayList<>();
  List<Pessoa> pessoasList = new ArrayList<>();
  
  //cadastrar Livro
  public Livro cadastrarLivro(Livro novoLivro) {
    //adicionar novoLivro ao cadastro de livros da biblioteca
    //TODO Verificar se há duplicação
    livrosList.add(novoLivro);
    return novoLivro;
  }
  
  //cadastrar Aluno
  public Aluno cadastrarAluno(Aluno novoAluno) {
    //TODO Verificar se há duplicação
    pessoasList.add(novoAluno);
    return novoAluno;
  }
  
  //cadastrar Professor
  public Professor cadastrarProfessor(Professor novoProfessor) {
    //TODO Verificar se há duplicação
    pessoasList.add(novoProfessor);
    return novoProfessor;
  }
  
  //realizar Emprestimo
  public Emprestimo realizarEmprestimo(Emprestimo novoEmprestimo) {
    //O livrosList do novoEmprestimo consta que todos estão disponíveis?
    //Se a Pessoa do novoEmprestimo for Aluno, já tem empréstimos em andamento?
    //O limite total de livros emprestados está sendo respeitado?
    this.historicoEmprestimoList.add(novoEmprestimo);
    return novoEmprestimo;
  }
  
  //devolver Emprestimo
  public Emprestimo devolverEmprestimo(Emprestimo emprestimoEmAndamento) {
    //localizar o parâmetro emprestimoEmAndamento no historicoEmprestimoList
    Emprestimo emprestimo = localizarEmprestimo(emprestimoEmAndamento);
    //definir a data de devolução
//    emprestimo.dataDevolucao = LocalDate.now();
    emprestimo.finalizar();
    //TODO Validar se houve atraso e, caso a Pessoa seja Aluno, aplicar suspensão
    //retornar o emprestimo finalizado
    return emprestimo;
  }
  
  private Emprestimo localizarEmprestimo(Emprestimo emprestimoEmAndamento) {
    //Qual foi a data do Emprestimo?
    //Qual o nome/matricula da Pessoa?
    //Quais são os livros?
    //TODO implementar o método
    return null;
  }
  
}
