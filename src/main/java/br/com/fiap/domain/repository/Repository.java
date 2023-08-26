package br.com.fiap.domain.repository;

import java.util.List;

public interface Repository<T, U> {

    List<T> findAll();

    T findById(U id);

    List<T> findByName(String texto);

    T persist(T t);


}
