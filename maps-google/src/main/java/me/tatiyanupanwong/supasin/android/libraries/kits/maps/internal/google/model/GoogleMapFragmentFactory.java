package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model;

import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;

public class GoogleMapFragmentFactory {

    public static Fragment instantiateFragment(MapOptions options) {
        GoogleMapOptions opt = null;
        if (options != null) {
            opt = ((GoogleMapOptionsWrapper) options).getMDelegate();
        }
        return SupportMapFragment.newInstance(opt);
    }
}
