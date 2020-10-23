package me.tatiyanupanwong.supasin.android.libraries.kits.maps.model

import android.os.Bundle
import android.view.View
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.MapKit

interface MapView {

    fun getView(): View
    fun onCreate(bundle: Bundle?)
    fun onStart()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
    fun onSaveInstanceState(bundle: Bundle?)
    fun onLowMemory()
    fun onEnterAmbient(bundle: Bundle)
    fun onExitAmbient()
    fun getMapAsync(callback: MapKit.OnMapReadyCallback)

}