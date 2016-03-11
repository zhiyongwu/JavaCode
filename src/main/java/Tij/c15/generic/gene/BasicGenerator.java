package Tij.c15.generic.gene;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<>(type);
    }
 }
