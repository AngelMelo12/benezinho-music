package br.com.fiap;

import br.com.fiap.domain.entity.Artista;
import br.com.fiap.domain.entity.Estilo;
import br.com.fiap.domain.entity.Musica;
import br.com.fiap.domain.service.ArtistaService;
import br.com.fiap.domain.service.EstiloService;
import br.com.fiap.domain.service.MusicaService;


import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EstiloService estiloService = new EstiloService();
        ArtistaService artistaService = new ArtistaService();
        MusicaService musicaService = new MusicaService();

        Estilo  estilo = new Estilo();
        estilo.setNome("R&B");

        Artista artista = new Artista();
        artista.setNome("Beyoncé");

        Musica musica = new Musica();
        musica.setEstilo( estilo )
                .setNome("Bigger")
                .addArtista( artista );

        estiloService.persist( estilo );
        artistaService.persist( artista );
        musicaService.persist( musica );

        musicaService.findAll().forEach( System.out::println ); //Aqui nessa parte já consigo printar as infos no terminal, testar.

        Long id = Long.valueOf(JOptionPane.showInputDialog( "ID da música" ));
        Musica byId = musicaService.findById( id );

        System.out.println(byId);

        String nome = null;

        do {
            nome = JOptionPane.showInputDialog( "Nome da música" );
        } while (! musicaService.valido(nome));

        musicaService.findByName( nome ).forEach( System.out::println );

    }
}