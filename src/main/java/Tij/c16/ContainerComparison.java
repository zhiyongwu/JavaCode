package Tij.c16;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/11
 */
public class ContainerComparison {

}

class BerylliumSphere{
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + id;
    }
}