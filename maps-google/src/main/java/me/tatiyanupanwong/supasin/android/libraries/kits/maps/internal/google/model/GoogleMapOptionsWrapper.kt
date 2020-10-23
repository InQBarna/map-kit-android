package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model

import com.google.android.gms.maps.GoogleMapOptions
import kotlinx.android.parcel.Parcelize
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.MapKit
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
        mDelegate.camera(GoogleCameraPosition.unwrap(camera as GoogleCameraPosition))
        return this
    }

    override fun compassEnabled(enabled: Boolean): MapOptions {
        mDelegate.compassEnabled(enabled)
        return this
    }

    override fun getAmbientEnabled(): Boolean {
        return mDelegate.ambientEnabled
    }

    override fun getCamera(): CameraPosition {
        return GoogleCameraPosition.wrap(mDelegate.camera)
    }

    override fun getCompassEnabled(): Boolean {
        return mDelegate.compassEnabled
    }

    override fun getLatLngBoundsForCameraTarget(): LatLngBounds {
        return GoogleLatLngBounds.wrap(mDelegate.latLngBoundsForCameraTarget)
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
        return mDelegate.maxZoomPreference
    }

    override fun getMinZoomPreference(): Float {
        return mDelegate.minZoomPreference
    }

    override fun getRotateGesturesEnabled(): Boolean {
        return mDelegate.rotateGesturesEnabled
    }

    override fun getScrollGesturesEnabled(): Boolean {
        return mDelegate.scrollGesturesEnabled
    }

    override fun getScrollGesturesEnabledDuringRotateOrZoom(): Boolean {
        return mDelegate.scrollGesturesEnabledDuringRotateOrZoom
    }

    override fun getTiltGesturesEnabled(): Boolean {
        return mDelegate.tiltGesturesEnabled
    }

    override fun getUseViewLifecycleInFragment(): Boolean {
        return mDelegate.useViewLifecycleInFragment
    }

    override fun getZOrderOnTop(): Boolean {
        return mDelegate.zOrderOnTop
    }

    override fun getZoomControlsEnabled(): Boolean {
        return mDelegate.zoomControlsEnabled
    }

    override fun getZoomGesturesEnabled(): Boolean {
        return mDelegate.zoomGesturesEnabled
    }

    override fun latLngBoundsForCameraTarget(llbounds: LatLngBounds): MapOptions {
        mDelegate.latLngBoundsForCameraTarget(GoogleLatLngBounds.unwrap(llbounds as GoogleLatLngBounds))
        return this
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
        mDelegate.maxZoomPreference(maxZoomPreference)
        return this
    }

    override fun minZoomPreference(minZoomPreference: Float): MapOptions {
        mDelegate.minZoomPreference(minZoomPreference)
        return this
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
        mDelegate.scrollGesturesEnabledDuringRotateOrZoom(enabled)
        return this
    }

    override fun tiltGesturesEnabled(enabled: Boolean): MapOptions {
        mDelegate.tiltGesturesEnabled(enabled)
        return this
    }

    override fun useViewLifecycleInFragment(useViewLifecycleInFragment: Boolean): MapOptions {
        mDelegate.useViewLifecycleInFragment(useViewLifecycleInFragment)
        return this
    }

    override fun zOrderOnTop(zOrderOnTop: Boolean): MapOptions {
        mDelegate.zOrderOnTop(zOrderOnTop)
        return this
    }

    override fun zoomControlsEnabled(enabled: Boolean): MapOptions {
        mDelegate.zoomControlsEnabled(enabled)
        return this
    }

    override fun zoomGesturesEnabled(enabled: Boolean): MapOptions {
        mDelegate.zoomGesturesEnabled(enabled)
        return this
    }
}