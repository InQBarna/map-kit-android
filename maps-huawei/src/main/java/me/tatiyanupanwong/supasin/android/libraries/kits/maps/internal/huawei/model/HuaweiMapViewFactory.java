package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei.model;

import android.content.Context;

import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapView;

public class HuaweiMapViewFactory {

    public static MapView create(Context context, MapOptions options) {
        return new HuaweiMapView(context, options);
    }
}
