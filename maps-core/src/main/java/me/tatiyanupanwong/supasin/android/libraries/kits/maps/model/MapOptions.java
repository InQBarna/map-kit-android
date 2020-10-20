package me.tatiyanupanwong.supasin.android.libraries.kits.maps.model;

import android.os.Parcelable;

public interface MapOptions extends Parcelable {

    MapOptions ambientEnabled (boolean enabled);
    MapOptions camera (CameraPosition camera);
    MapOptions compassEnabled (boolean enabled);
    //static GoogleMapOptions createFromAttributes (Context context, AttributeSet attrs);
    Boolean getAmbientEnabled ();
    CameraPosition getCamera ();
    Boolean getCompassEnabled ();
    LatLngBounds getLatLngBoundsForCameraTarget ();
    Boolean getLiteMode ();
    Boolean getMapToolbarEnabled ();
    int getMapType ();
    Float getMaxZoomPreference ();
    Float getMinZoomPreference ();
    Boolean getRotateGesturesEnabled ();
    Boolean getScrollGesturesEnabled ();
    Boolean getScrollGesturesEnabledDuringRotateOrZoom ();
    Boolean getTiltGesturesEnabled ();
    Boolean getUseViewLifecycleInFragment ();
    Boolean getZOrderOnTop ();
    Boolean getZoomControlsEnabled ();
    Boolean getZoomGesturesEnabled ();
    MapOptions latLngBoundsForCameraTarget (LatLngBounds llbounds);
    MapOptions liteMode (boolean enabled);
    MapOptions mapToolbarEnabled (boolean enabled);
    MapOptions mapType (int mapType);
    MapOptions maxZoomPreference (float maxZoomPreference);
    MapOptions minZoomPreference (float minZoomPreference);
    MapOptions rotateGesturesEnabled (boolean enabled);
    MapOptions scrollGesturesEnabled (boolean enabled);
    MapOptions scrollGesturesEnabledDuringRotateOrZoom (boolean enabled);
    MapOptions tiltGesturesEnabled (boolean enabled);
    MapOptions useViewLifecycleInFragment (boolean useViewLifecycleInFragment);
    MapOptions zOrderOnTop (boolean zOrderOnTop);
    MapOptions zoomControlsEnabled (boolean enabled);
    MapOptions zoomGesturesEnabled (boolean enabled);

}
