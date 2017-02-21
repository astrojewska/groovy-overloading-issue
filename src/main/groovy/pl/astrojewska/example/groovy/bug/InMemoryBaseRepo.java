package pl.astrojewska.example.groovy.bug;

import java.io.Serializable;

public class InMemoryBaseRepo<T, S extends Serializable> implements BaseRepository<T, S> {
    public void call(T t) {
        System.out.println("T call");
    }

    public void call(S s) {
        System.out.println("S call");
    }
}
