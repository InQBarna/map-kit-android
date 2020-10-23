package me.tatiyanupanwong.supasin.android.libraries.kits.maps

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapView

class MapViewWrapper private constructor(
        context: Context,
        attributeSet: AttributeSet?,
        options: MapOptions?,
        mapView: MapView = MapsPlatform.get().getMapView(context, options)
): FrameLayout(context, attributeSet), MapView by mapView {

    constructor(context: Context)
            : this(context = context, attributeSet = null, options = null)

    constructor(context: Context, mapOptions: MapOptions)
            : this(context = context, attributeSet = null, options = mapOptions)

    init { addView(getView()) }

}