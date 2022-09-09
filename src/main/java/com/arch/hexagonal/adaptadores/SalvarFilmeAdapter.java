package com.arch.hexagonal.adaptadores;

import com.arch.hexagonal.app.dominio.Filme;
import com.arch.hexagonal.app.portas.SalvarFilmePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalvarFilmeAdapter implements SalvarFilmePort {

    @Autowired
    FilmeRepository filmeRepository;

    @Override
    public Filme salvarNoBancoDeDados(Filme filme) {
        FilmeEntity filmeEntity = new FilmeEntity(filme);
        filmeRepository.save(filmeEntity);
        filme = filmeEntity.toFilme();
        return filme;
    }
}
