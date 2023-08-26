package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Estilo;

import java.util.List;

public class EstiloRepository implements Repository<Estilo, Integer>{

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
        return null;
    }
}
