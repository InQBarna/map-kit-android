package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model;

import android.content.Context;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapView;

public class GoogleMapViewFactory {

    public static MapView create(Context context, MapOptions options) {
        return new GoogleMapView(context, options);
    }
}
