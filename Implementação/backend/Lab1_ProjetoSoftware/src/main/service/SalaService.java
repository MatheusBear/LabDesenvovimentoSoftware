package main.service;

import main.model.Funcionario;
import main.model.Sala;

public interface SalaService {

    Sala criarSala(Sala sala);
    Sala editarSala(Sala sala);
    Sala deletarSala(Sala sala);
}

