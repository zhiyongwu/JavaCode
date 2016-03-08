package Tij.c14.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuzhiyong on 16/3/8.
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "Tij.c14.pets.Mutt",
            "Tij.c14.pets.Pug",
            "Tij.c14.pets.EgyptianMau",
            "Tij.c14.pets.Manx",
            "Tij.c14.pets.Cymric",
            "Tij.c14.pets.Rat",
            "Tij.c14.pets.Mouse",
            "Tij.c14.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void load(){
        for(String name:typeNames){
            try {
                types.add((Class<? extends Pet>)Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    static {
        load();
    }
    @Override
    public List<Class<? extends Cat>> types() {
        return types();
    }


}
