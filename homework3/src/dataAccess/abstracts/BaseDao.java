package dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

public class BaseDao<T> implements IBaseDao<T> {

    List<T> list = new ArrayList<>();

    @Override
    public void add(T data) {
        list.add(data);
        System.out.println("Data added");
    }

    @Override
    public void delete(T data) {
        list.remove(data);
        System.out.println("Data deleted");
    }

    @Override
    public void update(T data) {
        System.out.println("Data updated");
    }

    @Override
    public List<T> getAll() {
        for (T t:list){
            System.out.println(t);
        }
        return list ;
    }
}
