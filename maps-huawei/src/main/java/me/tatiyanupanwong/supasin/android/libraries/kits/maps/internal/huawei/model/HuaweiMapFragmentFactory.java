package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei.model;

import androidx.fragment.app.Fragment;

import com.huawei.hms.maps.HuaweiMapOptions;
import com.huawei.hms.maps.SupportMapFragment;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;

public class HuaweiMapFragmentFactory {

    public static Fragment instantiateFragment(MapOptions options) {
        HuaweiMapOptions opt = null;
        if (options != null) {
            opt = ((HuaweiMapOptionsWrapper) options).getMDelegate();
        }
        return SupportMapFragment.newInstance(opt);
    }
}
