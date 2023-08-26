package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.repository.ArtistaRepository;

import java.util.List;
import java.util.Objects;

public class ArtistaService implements Service<Artista, Integer>{

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

        if (isValidArtista(artista))  {
            return null;
        }
        if (Objects.isNull(artista.getId()))
            return null;

        return ArtistaRepository.persist(artista);
    }

    private static boolean isValidArtista(Artista artista) {
        return Objects.isNull(artista.getNome()) || artista.getNome().isBlank();
    }


}
