package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.repository.EstiloRepository;

import java.util.List;
import java.util.Objects;

public class EstiloService implements Service<Estilo, Integer>{

    @Override
    public List<Estilo> findAll() {
        return null;
    }

    @Override
    public Estilo findById(Integer id) {
        return null;
    }

    @Override
    public List<Estilo> findByName(String texto) {
        return null;
    }

    @Override
    public Estilo persist(Estilo estilo) {

        if (isValidEstilo(estilo)) {
            return null;
        }
        if (Objects.isNull(estilo.getId()))
            return null;

        return EstiloRepository.persist(estilo);
    }

    private static boolean isValidEstilo(Estilo estilo) {
        return Objects.isNull(estilo.getNome()) || estilo.getNome().isBlank();
    }


}

