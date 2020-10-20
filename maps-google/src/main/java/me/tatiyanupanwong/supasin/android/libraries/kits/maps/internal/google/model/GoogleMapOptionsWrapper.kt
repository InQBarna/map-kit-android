package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model

import com.google.android.gms.maps.GoogleMapOptions
import kotlinx.android.parcel.Parcelize
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.CameraPosition
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLngBounds
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions

@Parcelize
class GoogleMapOptionsWrapper(val mDelegate: GoogleMapOptions = GoogleMapOptions()) : MapOptions {


    override fun ambientEnabled(enabled: Boolean): MapOptions {
        mDelegate.ambientEnabled(enabled)
        return this
    }

    override fun camera(camera: CameraPosition?): MapOptions {
        TODO("Not yet implemented")
    }

    override fun compassEnabled(enabled: Boolean): MapOptions {
        TODO("Not yet implemented")
    }

    override fun getAmbientEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getCamera(): CameraPosition {
        TODO("Not yet implemented")
    }

    override fun getCompassEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getLatLngBoundsForCameraTarget(): LatLngBounds {
        TODO("Not yet implemented")
    }

    override fun getLiteMode(): Boolean {
        return mDelegate.liteMode
    }

    override fun getMapToolbarEnabled(): Boolean {
        return mDelegate.mapToolbarEnabled
    }

    override fun getMapType(): Int {
        return mDelegate.mapType
    }

    override fun getMaxZoomPreference(): Float {
        TODO("Not yet implemented")
    }

    override fun getMinZoomPreference(): Float {
        TODO("Not yet implemented")
    }

    override fun getRotateGesturesEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getScrollGesturesEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getScrollGesturesEnabledDuringRotateOrZoom(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getTiltGesturesEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getUseViewLifecycleInFragment(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getZOrderOnTop(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getZoomControlsEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getZoomGesturesEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun latLngBoundsForCameraTarget(llbounds: LatLngBounds): MapOptions {
        TODO("Not yet implemented")
    }

    override fun liteMode(enabled: Boolean): MapOptions {
        mDelegate.liteMode(enabled)
        return this
    }

    override fun mapToolbarEnabled(enabled: Boolean): MapOptions {
        mDelegate.mapToolbarEnabled(enabled)
        return this
    }

    override fun mapType(mapType: Int): MapOptions {
        mDelegate.mapType(mapType)
        return this
    }

    override fun maxZoomPreference(maxZoomPreference: Float): MapOptions {
        TODO("Not yet implemented")
    }

    override fun minZoomPreference(minZoomPreference: Float): MapOptions {
        TODO("Not yet implemented")
    }

    override fun rotateGesturesEnabled(enabled: Boolean): MapOptions {
        mDelegate.rotateGesturesEnabled(enabled)
        return this
    }

    override fun scrollGesturesEnabled(enabled: Boolean): MapOptions {
        mDelegate.scrollGesturesEnabled(enabled)
        return this
    }

    override fun scrollGesturesEnabledDuringRotateOrZoom(enabled: Boolean): MapOptions {
        TODO("Not yet implemented")
    }

    override fun tiltGesturesEnabled(enabled: Boolean): MapOptions {
        TODO("Not yet implemented")
    }

    override fun useViewLifecycleInFragment(useViewLifecycleInFragment: Boolean): MapOptions {
        TODO("Not yet implemented")
    }

    override fun zOrderOnTop(zOrderOnTop: Boolean): MapOptions {
        TODO("Not yet implemented")
    }

    override fun zoomControlsEnabled(enabled: Boolean): MapOptions {
        mDelegate.zoomControlsEnabled(enabled)
        return this
    }

    override fun zoomGesturesEnabled(enabled: Boolean): MapOptions {
        mDelegate.zoomGesturesEnabled(enabled)
        return this;
    }
}