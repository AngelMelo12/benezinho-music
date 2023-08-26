package br.com.fiap.domain.repository;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.service.Service;

import java.util.List;

public class ArtistaRepository implements Repository<Artista, Integer> {
    @Override
    public List<Artista> findAll() {
        return null;
    }

    @Override
    public Artista findById(Integer id) {
        return null;
    }

    @Override
    public List<Artista> findByName(String texto) {
        return null;
    }

    @Override
    public Artista persist(Artista artista) {
        return null;
    }


}
