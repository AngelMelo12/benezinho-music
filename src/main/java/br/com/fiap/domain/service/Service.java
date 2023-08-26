package br.com.fiap.domain.service;

import java.util.List;

public interface Service<T, U> {

    List<T> findAll();

    T findById(U id);

    List<T> findByName(String texto);

    T persist(T t);

}