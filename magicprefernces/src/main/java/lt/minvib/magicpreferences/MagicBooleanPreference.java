package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicBooleanPreference extends  MagicPreference<Boolean> {

    public MagicBooleanPreference(String set, String key, Boolean drawback) {
        super(set, key, drawback);
    }

    @Override
    public void set(Context ctx, Boolean value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putBoolean(key, value).apply();

    }

    @Override
    public  Boolean get(Context ctx){
        SharedPreferences prefs = getSharedPrefs(ctx);
        return  prefs.getBoolean(key, drawback);
    }

}
