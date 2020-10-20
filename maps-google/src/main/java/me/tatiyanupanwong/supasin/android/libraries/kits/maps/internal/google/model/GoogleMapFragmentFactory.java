package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model;

import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.SupportMapFragment;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;

public class GoogleMapFragmentFactory {

    public static Fragment instantiateFragment(MapOptions options) {
        return SupportMapFragment.newInstance(((GoogleMapOptionsWrapper) options).getMDelegate());
    }
}
