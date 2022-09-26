package models.dataSaver;

public class InMemoryDataSaver<T> implements DataSaver<T> {
    private T data;

    @Override
    public void save(T data) throws NullPointerException {
        this.data = data;
    }

    @Override
    public T load() {
        return data;
    }


    public void test(){

    }
}
