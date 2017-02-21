package pl.astrojewska.example.groovy.bug;

import java.io.Serializable;

public interface BaseRepository<T, S extends Serializable> {
    void call(T t);
    void call(S s);
}
