# magic-preferences
Wrapper to help with shared preferences. It provide static variable access to single preferences.



``` gradle
repositories {
    maven {
        url "http://dl.bintray.com/kirvis250/android" 
    } 
}
```

``` gradle
dependencies {
  compile 'lt.minvib:magicprefernces:0.0.3'
}
```

##Usage

``` java
// MagicStringPreference("Shared_preference_file_name", "preference_name", "default_value");

// default shared preferences
public static final MagicStringPreference TEMPERATURE_UNIT = new MagicStringPreference(null, "temperature_unit", "C");


// custom shared preferences 
public static final MagicStringPreference TEMPERATURE_UNIT = new MagicStringPreference("myCustom", "temperature_unit", "C");

// get temperature uses static variable plus context to open shared preferences
public String getTemperature(Cotnext context){
  return TEMPERATURE_UNIT.get(context);
}

// set temperature uses static variable, value that should replace previuos one plus context to open shared preferences
public String setTemperature(Cotnext context, String temp){
  return TEMPERATURE_UNIT.set(context,  temp);
}


```
