package me.tatiyanupanwong.supasin.android.libraries.kits.maps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions

/**
 * A Map component in an app which displays a map (with data obtained from the Maps service). When
 * focused, it will capture keypresses and touch gestures to move the map. It's a wrapper around a
 * view of a map to automatically handle the necessary life cycle needs. Being a fragment, this
 * component can be added to an activity's layout file simply with the XML below.
 *
 * <pre>
 * &lt;fragment
 *     class="me.tatiyanupanwong.supasin.android.libraries.kits.maps.MapFragment"
 *     android:layout_width="match_parent"
 *     android:layout_height="match_parent" /&gt;
 * </pre>
 *
 * <p>A {@link MapClient} must be acquired using {@link #getMapAsync(MapKit.OnMapReadyCallback)}.
 * This class automatically initializes the maps system and the view.
 *
 * <p>Any objects obtained from the {@link MapClient} are associated with the view. It's important
 * to not hold on to objects (e.g. {@link Marker}) beyond the view's life. Otherwise it will cause
 * a memory leak as the view cannot be released.
 *
 * @since 1.0.0
 */

class MapFragment: Fragment() {

    companion object {

        fun newInstance(): MapFragment {
            return MapFragment()
        }

        fun newInstance(options: MapOptions?): MapFragment {
            val fragment = MapFragment()
            val var2 = Bundle()
            var2.putParcelable("MapOptions", options)
            fragment.arguments = var2
            return fragment
        }
    }

    private lateinit var view: MapViewWrapper

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = MapViewWrapper(requireContext())
        view.onCreate(savedInstanceState)
        return view
    }

    override fun onStart() {
        super.onStart()
        view.onStart()
    }

    override fun onResume() {
        super.onResume()
        view.onResume()
    }

    override fun onPause() {
        super.onPause()
        view.onPause()
    }

    override fun onStop() {
        super.onStop()
        view.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        view.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        view.onLowMemory()
    }

    fun getMapAsync(callback: MapKit.OnMapReadyCallback) {
        view.getMapAsync(callback)
    }


}