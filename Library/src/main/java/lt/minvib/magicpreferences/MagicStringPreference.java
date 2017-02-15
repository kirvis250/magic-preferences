package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicStringPreference extends  MagicPreference<String> {

    public MagicStringPreference(String set, String key, String drawback) {
        super(set, key, drawback);
    }

    @Override
    public void set(Context ctx, String value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putString(key, value).apply();
    }



    @Override
    public  String get(Context ctx){
        SharedPreferences prefs = getSharedPrefs(ctx);
        return  prefs.getString(key, drawback);
    }

}
