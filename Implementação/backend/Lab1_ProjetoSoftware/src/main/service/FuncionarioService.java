package main.service;

import main.model.Disciplina;
import main.model.Funcionario;

public interface FuncionarioService {

    Funcionario criarFuncionario(Funcionario funcionario, String tipo);
    Funcionario editarFuncionario(Funcionario funcionario, String tipo);
    Funcionario deletarFuncionario(Funcionario funcionario, String tipo);


}
