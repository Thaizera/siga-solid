package siga;

// Interface para abstrair a gravacao dos dados e soltar a classe Matricula do MySQL
public interface MatriculaRepositorio {
    void gravar(String dados);
}