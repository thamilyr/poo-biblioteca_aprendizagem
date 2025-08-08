import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Emprestimo {
  
  private Pessoa pessoa;
  private List<Livro> livrosList = new ArrayList<>();
  private LocalDate dataInicio;
  private LocalDate dataEsperada;
  private LocalDate dataDevolucao;
  
  public Emprestimo(Pessoa pessoa, List<Livro> livrosList) {
    this.pessoa = pessoa;
    this.livrosList = livrosList;
    this.dataInicio = LocalDate.now();
    //TODO calcular a dataEsperada para devolução
  }
  
  public void finalizar() {
    this.dataDevolucao = LocalDate.now();
  }

}
