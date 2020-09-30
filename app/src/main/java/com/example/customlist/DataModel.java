package com.example.customlist;

public class DataModel {

    String song;
    String musician;
    String view;
    String feature;

    public DataModel(String song, String musician, String view, String feature ) {
        this.song=song;
        this.musician=musician;
        this.view=view;
        this.feature=feature;

    }

    public String getName() {
        return song;
    }

    public String getType() {
        return musician;
    }

    public String getVersion_number() {
        return view;
    }

    public String getFeature() {
        return feature;
    }

}
