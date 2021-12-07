package ir.maktab.onilne_shop.base.service;

import ir.maktab.onilne_shop.base.domain.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityService<E extends BaseEntity<ID> , ID extends Serializable> {


    E save(E e);

    void delete(E e);

    List<E> findAll();

    boolean existById(ID id);

    E findById(ID id);

}
