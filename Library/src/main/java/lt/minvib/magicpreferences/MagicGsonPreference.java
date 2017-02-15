package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by Mindaugas Viburys on 2015-12-30.
 * farmis-as noFrame.lt
 */
public class MagicGsonPreference<T> extends MagicPreference<T> {

    Class<T> _class;

    public MagicGsonPreference(String set, String key, T drawback,  Class<T> _class ) {
        super(set, key, drawback);
        this._class =_class;
    }

    @Override
    public void set(Context ctx, T value) {

        Gson gson = new Gson();
        String json = gson.toJson(value);

        SharedPreferences prefs = getSharedPrefs(ctx);
        prefs.edit().putString(key, json).apply();
    }

    @Override
    public T get(Context ctx) {

        SharedPreferences prefs = getSharedPrefs(ctx);
        String json = prefs.getString(key, "");

        if(json.isEmpty())
            return drawback;

        try {
            Gson gson = new Gson();
            return gson.fromJson(json, _class);
        }catch (Exception e){
            return drawback;
        }

    }
}
