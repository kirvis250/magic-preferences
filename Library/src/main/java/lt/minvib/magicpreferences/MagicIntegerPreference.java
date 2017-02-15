package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicIntegerPreference extends  MagicPreference<Integer> {

    public MagicIntegerPreference(String set, String key, Integer drawback) {
        super(set, key, drawback);
    }

    @Override
    public void set(Context ctx, Integer value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putInt(key, value).apply();

    }

    @Override
    public  Integer get(Context ctx){
        SharedPreferences prefs = getSharedPrefs(ctx);
        return  prefs.getInt(key, drawback);
    }

}
