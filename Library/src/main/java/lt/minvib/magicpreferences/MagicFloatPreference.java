package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicFloatPreference extends  MagicPreference<Float> {

    public MagicFloatPreference(String set, String key, Float drawback) {
        super(set, key, drawback);
    }

    @Override
    public void set(Context ctx, Float value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putFloat(key, value).apply();
    }

    @Override
    public  Float get(Context ctx){
        SharedPreferences prefs = getSharedPrefs(ctx);
        return  prefs.getFloat(key, drawback);
    }

}
