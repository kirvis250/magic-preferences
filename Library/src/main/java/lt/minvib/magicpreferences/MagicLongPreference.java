package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicLongPreference extends  MagicPreference<Long> {

    public MagicLongPreference(String set, String key, Long drawback) {
        super(set, key, drawback);
    }

    @Override
    public void set(Context ctx, Long value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putLong(key, value).apply();
    }

    @Override
    public  Long get(Context ctx){
        SharedPreferences prefs = getSharedPrefs(ctx);
        return  prefs.getLong(key, drawback);
    }

}
