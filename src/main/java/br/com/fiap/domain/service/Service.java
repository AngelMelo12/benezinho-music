package br.com.fiap.domain.service;

import java.util.List;
import java.util.Objects;

public interface Service<T, U> {

    List<T> findAll();

    T findById(U id);

    List<T> findByName(String texto);

    T persist(T t);


    default boolean valido(String s){
        return Objects.nonNull( s ) && ! s.trim().isEmpty();
    }
}