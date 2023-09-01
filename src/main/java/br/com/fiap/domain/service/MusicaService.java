package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Musica;
import br.com.fiap.domain.repository.MusicaRepository;

import java.util.List;
import java.util.Objects;

public class MusicaService implements Service<Musica, Long>{

    private MusicaRepository repository;

    public MusicaService() {
        repository = new MusicaRepository();
    }

    @Override
    public List<Musica> findAll() {

        return repository.findAll();
    }

    @Override
    public Musica findById(Integer id) {
        return repository.findById( id );
    }

    @Override
    public List<Musica> findByName(String texto) {

        return repository.findByName( texto );
    }

    @Override
    public Musica persist(Musica musica) {
        return repository.persist( musica );

    }

}
