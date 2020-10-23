/*
 * Copyright (C) 2020 Supasin Tatiyanupanwong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.tatiyanupanwong.supasin.android.libraries.kits.maps;

import android.content.Context;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapFactory;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapOptions;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.MapView;

abstract class MapsPlatform {

    private static MapsPlatform sPlatform;

    static synchronized MapsPlatform get() {
        return sPlatform;
    }

    static synchronized void init(@NonNull Context context) {
        sPlatform = findPlatform(context);
    }


    @NonNull
    abstract MapFactory getFactory();

    abstract Fragment instantiateFragment(MapOptions options);

    abstract MapView getMapView(Context context, @Nullable MapOptions options);

    private static MapsPlatform findPlatform(@NonNull Context context) {
        MapsPlatform amazon = AmazonMapsPlatform.buildIfSupported(context);
        if (amazon != null) {
            return amazon;
        }

        MapsPlatform google = GoogleMapsPlatform.buildIfSupported(context);
        if (google != null) {
            return google;
        }

        MapsPlatform huawei = HuaweiMapsPlatform.buildIfSupported(context);
        if (huawei != null) {
            return huawei;
        }

        throw new IllegalStateException(
                "Can't find supported platform, make sure to include one of the next artifacts:"
                        + " ':maps-amazon', ':maps-google', or ':maps-huawei'");
    }


    private static final class AmazonMapsPlatform extends MapsPlatform {
        private static final String LIBRARY_PACKAGE_NAME =
                "me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.amazon";

        private static MapFactory sFactory;

        private AmazonMapsPlatform() {}

        @NonNull
        @Override
        MapFactory getFactory() {
            return sFactory;
        }

        @Override
        Fragment instantiateFragment(MapOptions options) {
            return null;
        }

        @Override
        MapView getMapView(Context context, MapOptions options) {
            return null;
        }

        @Nullable
        static AmazonMapsPlatform buildIfSupported(@NonNull Context context) {
            try {
                sFactory = (MapFactory) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.AmazonMapFactory")
                        .getMethod("buildIfSupported", Context.class)
                        .invoke(null, context);

                return new AmazonMapsPlatform();
            } catch (Exception ignored) {
                return null;
            }
        }
    }

    private static final class GoogleMapsPlatform extends MapsPlatform {
        private static final String LIBRARY_PACKAGE_NAME =
                "me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google";

        private static final String CLASS_NAME_LAYOUT_RES = LIBRARY_PACKAGE_NAME + ".R$layout";

        private static final String CLASS_NAME_ID_RES = LIBRARY_PACKAGE_NAME + ".R$id";

        private static final String FIELD_NAME_LAYOUT_ID = "kits_maps_internal_google_map_view";

        private static final String FIELD_NAME_FRAGMENT_ID = "kits_maps_internal_map_fragment";

        private static MapFactory sFactory;

        private GoogleMapsPlatform() {}

        @NonNull
        @Override
        MapFactory getFactory() {
            return sFactory;
        }

        @Override
        Fragment instantiateFragment(MapOptions options) {
            try {
                return (Fragment) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.GoogleMapFragmentFactory")
                        .getMethod("instantiateFragment", MapOptions.class)
                        .invoke(null, options);
            } catch (Exception ignored) {
                return null;
            }
        }

        @Override
        MapView getMapView(Context context, MapOptions options) {
            try {
                return (MapView) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.GoogleMapViewFactory")
                        .getMethod("create", Context.class, MapOptions.class)
                        .invoke(null, context, options);
            } catch (Exception ignored) {
                return null;
            }
        }

        @Nullable
        static GoogleMapsPlatform buildIfSupported(@NonNull Context context) {
            try {
                sFactory = (MapFactory) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.GoogleMapFactory")
                        .getMethod("buildIfSupported", Context.class)
                        .invoke(null, context);

                return new GoogleMapsPlatform();
            } catch (Exception ignored) {
                return null;
            }
        }
    }

    private static final class HuaweiMapsPlatform extends MapsPlatform {
        private static final String LIBRARY_PACKAGE_NAME =
                "me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei";

        private static final String CLASS_NAME_LAYOUT_RES = LIBRARY_PACKAGE_NAME + ".R$layout";

        private static final String CLASS_NAME_ID_RES = LIBRARY_PACKAGE_NAME + ".R$id";

        private static final String FIELD_NAME_LAYOUT_ID = "kits_maps_internal_huawei_map_view";

        private static final String FIELD_NAME_FRAGMENT_ID = "kits_maps_internal_map_fragment";

        private static MapFactory sFactory;

        private HuaweiMapsPlatform() {}

        @NonNull
        @Override
        MapFactory getFactory() {
            return sFactory;
        }

        @Override
        Fragment instantiateFragment(MapOptions options) {
            try {
                return (Fragment) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.HuaweiMapFragmentFactory")
                        .getMethod("instantiateFragment", MapOptions.class)
                        .invoke(null, options);
            } catch (Exception ignored) {
                return null;
            }
        }

        @Override
        MapView getMapView(Context context, MapOptions options) {
            try {
                return (MapView) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.HuaweiMapViewFactory")
                        .getMethod("create", Context.class, MapOptions.class)
                        .invoke(null, context, options);
            } catch (Exception ignored) {
                return null;
            }
        }

        @Nullable
        static HuaweiMapsPlatform buildIfSupported(@NonNull Context context) {
            try {
                sFactory = (MapFactory) Class
                        .forName(LIBRARY_PACKAGE_NAME + ".model.HuaweiMapFactory")
                        .getMethod("buildIfSupported", Context.class)
                        .invoke(null, context);

                return new HuaweiMapsPlatform();
            } catch (Exception ignored) {
                return null;
            }
        }
    }

}
