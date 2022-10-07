package dataAccess.abstracts;

import java.util.List;

public interface IBaseDao<T>{

    void add(T data);
    void delete(T data);
    void update(T data);
    List<T> getAll();

}
