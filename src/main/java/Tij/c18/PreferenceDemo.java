package Tij.c18;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Created by wuzhiyong .
 * Date : 2016/3/14
 */
public class PreferenceDemo {
    public static void main(String[] args) throws BackingStoreException {
        Preferences prefs = Preferences.userNodeForPackage(PreferenceDemo.class);
        prefs.put("Location","OZ");
        prefs.putInt("Comp",0);
        int usageCount = prefs.getInt("Comp",0);
        usageCount++;
        prefs.putInt("Count",usageCount);
        for (String key:prefs.keys()
             ) {
            System.out.println(key + ":" + prefs.get(key,null));
        }
    }
}
