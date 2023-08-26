package br.com.fiap.domain.service;

import br.com.fiap.domain.entity.Musica;
import br.com.fiap.domain.repository.MusicaRepository;

import java.util.List;
import java.util.Objects;

public class MusicaService implements Service<Musica, Integer>{

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

        if (isValidMusica(musica)) {
            return null;
        }

        if (Objects.isNull(musica.getId()))
            return null;

        return MusicaRepository.persist(musica);
    }

    private static boolean isValidMusica(Musica musica) {
        return Objects.isNull(musica.getNome()) || musica.getNome().isBlank();
    }


}
