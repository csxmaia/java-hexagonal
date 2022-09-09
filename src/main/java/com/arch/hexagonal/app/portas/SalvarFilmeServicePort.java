package com.arch.hexagonal.app.portas;

import com.arch.hexagonal.app.dominio.Filme;

public interface SalvarFilmeServicePort {
    Filme salvar(Filme filme);
}
