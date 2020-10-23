package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei.model

import android.content.Context
import android.os.Bundle
import android.view.View
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.MapKit
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapView

class HuaweiMapView(context: Context, mapOptions: MapOptions?): MapView {

    private val view = com.huawei.hms.maps.MapView(context, (mapOptions as? HuaweiMapOptionsWrapper)?.mDelegate)

    override fun getView(): View {
        return view
    }

    override fun onCreate(bundle: Bundle?) {
        view.onCreate(bundle)
    }

    override fun onStart() {
        view.onStart()
    }

    override fun onResume() {
        view.onResume()
    }

    override fun onPause() {
        view.onPause()
    }

    override fun onStop() {
        view.onStop()
    }

    override fun onDestroy() {
        view.onDestroy()
    }

    override fun onSaveInstanceState(bundle: Bundle?) {
        view.onSaveInstanceState(bundle)
    }

    override fun onLowMemory() {
        view.onLowMemory()
    }

    override fun onEnterAmbient(bundle: Bundle) {
        view.onEnterAmbient(bundle)
    }

    override fun onExitAmbient() {
        view.onExitAmbient()
    }

    override fun getMapAsync(callback: MapKit.OnMapReadyCallback) {
        view.getMapAsync {
            callback.onMapReady(HuaweiMapClient(it))
        }
    }
}