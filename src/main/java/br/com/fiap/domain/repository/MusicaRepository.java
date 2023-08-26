package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Musica;

import java.util.List;

public class MusicaRepository implements Repository<Musica, Integer> {
    @Override
    public List<Musica> findAll() {
        return null;
    }

    @Override
    public Musica findById(Integer id) {
        return null;
    }

    @Override
    public List<Musica> findByName(String texto) {
        return null;
    }

    @Override
    public Musica persist(Musica musica) {
        return null;
    }
}
