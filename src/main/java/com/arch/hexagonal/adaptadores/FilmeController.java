package com.arch.hexagonal.adaptadores;

import com.arch.hexagonal.app.dominio.Filme;
import com.arch.hexagonal.app.portas.SalvarFilmeServicePort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    private final SalvarFilmeServicePort salvarFilmeServicePort;

    public FilmeController(SalvarFilmeServicePort salvarFilmeServicePort) {
        this.salvarFilmeServicePort = salvarFilmeServicePort;
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme) {
        return salvarFilmeServicePort.salvar(filme);
    }
}
