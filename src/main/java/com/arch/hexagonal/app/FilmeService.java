package com.arch.hexagonal.app;

import com.arch.hexagonal.app.dominio.Filme;
import com.arch.hexagonal.app.portas.SalvarFilmePort;
import com.arch.hexagonal.app.portas.SalvarFilmeServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService implements SalvarFilmeServicePort {

    @Autowired
    SalvarFilmePort filmePort;

    @Override
    public Filme salvar(Filme filme) {
        Filme filmeSalvo = filmePort.salvarNoBancoDeDados(filme);
        return filmeSalvo;
    }
}
