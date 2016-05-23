package cz.mendelu.seminar.swi2.bodycare.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class BeanMappingServiceImpl implements BeanMappingService {

    @Autowired
    private Mapper dozer;

    @Override
    public <T> List<T> mapTo(Collection<?> objects, Class<T> mapToClass) {
        List<T> mappedCollection = new ArrayList<>();
        for (Object object : objects) {
            mappedCollection.add(dozer.map(object, mapToClass));
        }
        return mappedCollection;
    }

    @Override
    public <T> T mapTo(Object u, Class<T> mapToClass) {
        if (u == null) {
            return null;
        }
        return dozer.map(u, mapToClass);
    }

    @Override
    public Mapper getMapper() {
        return dozer;
    }

}