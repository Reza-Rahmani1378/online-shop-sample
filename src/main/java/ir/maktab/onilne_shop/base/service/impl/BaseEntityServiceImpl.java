package ir.maktab.onilne_shop.base.service.impl;

import ir.maktab.onilne_shop.base.domain.BaseEntity;
import ir.maktab.onilne_shop.base.repository.BaseEntityRepository;
import ir.maktab.onilne_shop.base.service.BaseEntityService;

import java.io.Serializable;
import java.util.List;

public  class BaseEntityServiceImpl <E extends BaseEntity<ID> , ID extends Serializable
        , R extends BaseEntityRepository<E , ID>> implements BaseEntityService<E , ID> {

    protected final R baseEntityRepository;

    public BaseEntityServiceImpl(R baseEntityRepository) {
        this.baseEntityRepository = baseEntityRepository;
    }

    @Override
    public E save(E e) {
        baseEntityRepository.getEntityManger().getTransaction().begin();
        baseEntityRepository.save(e);
        baseEntityRepository.getEntityManger().getTransaction().commit();
        return e;
    }

    @Override
    public void delete(E e) {
        baseEntityRepository.delete(e);
    }

    @Override
    public List<E> findAll() {
        return baseEntityRepository.findAll();
    }

    @Override
    public boolean existById(ID id) {
        return baseEntityRepository.existById(id);
    }

    @Override
    public E findById(ID id) {
        return baseEntityRepository.findById(id);
    }
}
