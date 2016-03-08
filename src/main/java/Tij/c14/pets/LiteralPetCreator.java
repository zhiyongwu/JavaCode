package Tij.c14.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wuzhiyong on 16/3/8.
 */
public class LiteralPetCreator extends PetCreator {
    @Override
    public List<Class<? extends Cat>> types() {
        return types();
    }

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class,Dog.class,Rodent.class,Mutt.class
                    ,Pug.class,EgyptianMau.class,Manx.class,
                    Cymric.class,Rat.class,Hamster.class
            ));
    public static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),allTypes.size());

}
