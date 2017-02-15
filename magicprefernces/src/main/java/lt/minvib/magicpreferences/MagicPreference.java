package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public abstract class MagicPreference<T> {

    protected String set;
    protected String key;
    protected T drawback;

    public MagicPreference(String set, String key, T drawback) {
        this.set = set;
        this.key = key;
        this.drawback = drawback;
    }

    protected SharedPreferences  getSharedPrefs(Context ctx){
        if(set == null || set.equals("")){
            return PreferenceManager.getDefaultSharedPreferences(ctx);
        } else {
            return ctx.getSharedPreferences(set, Context.MODE_PRIVATE);
        }
    }


    public abstract void set(Context ctx, T value);



    public abstract T get(Context ctx);


    public String getSet() {
        return set;
    }


    public String getKey() {
        return key;
    }

    public T getDrawback() {
        return drawback;
    }

}
