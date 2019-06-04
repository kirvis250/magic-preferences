package lt.minvib.magicpreferences;

import android.content.Context;
import android.content.SharedPreferences;


import androidx.annotation.NonNull;

import org.json.JSONException;

/**
 * Created by Naudotojas on 2015-10-01.
 * fieldareaspray
 * noFrame.lt
 */
public  class MagicJsonPreference<T extends JSONPreference<T>> extends  MagicPreference<T> {

        T instanceOfObject;

    public MagicJsonPreference(String set, String key, T drawback, @NonNull T instanceOfObject) {
        super(set, key, drawback);
        this.instanceOfObject = instanceOfObject;
    }

    @Override
    public void set(Context ctx, T value){
        SharedPreferences prefs = getSharedPrefs(ctx);
        try{
            prefs.edit().putString(key, value.toJSON()).apply();
        } catch ( JSONException e){
            e.printStackTrace();
        }
    }


    @Override
    public  T get(Context ctx ){
        SharedPreferences prefs = getSharedPrefs(ctx);

        try{
            instanceOfObject.fromJSON( prefs.getString(key, ""));
        } catch ( JSONException e){
            e.printStackTrace();
            return drawback;
        }

        return instanceOfObject;
    }


}
