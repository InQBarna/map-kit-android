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

package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.huawei.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLngBounds;
import me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.VisibleRegion;

class HuaweiVisibleRegion implements VisibleRegion {

    private final com.huawei.hms.maps.model.VisibleRegion mDelegate;

    private LatLng mNearLeft;
    private LatLng mNearRight;
    private LatLng mFarLeft;
    private LatLng mFarRight;
    private LatLngBounds mLatLngBounds;

    private HuaweiVisibleRegion(com.huawei.hms.maps.model.VisibleRegion delegate) {
        mDelegate = delegate;
    }

    HuaweiVisibleRegion(
            LatLng nearLeft,
            LatLng nearRight,
            LatLng farLeft,
            LatLng farRight,
            LatLngBounds latLngBounds) {
        this(new com.huawei.hms.maps.model.VisibleRegion(
                HuaweiLatLng.unwrap(nearLeft),
                HuaweiLatLng.unwrap(nearRight),
                HuaweiLatLng.unwrap(farLeft),
                HuaweiLatLng.unwrap(farRight),
                HuaweiLatLngBounds.unwrap(latLngBounds)));
    }

    @NonNull
    @Override
    public LatLng getNearLeft() {
        if (mNearLeft == null) {
            mNearLeft = HuaweiLatLng.wrap(mDelegate.nearLeft);
        }
        return mNearLeft;
    }

    @NonNull
    @Override
    public LatLng getNearRight() {
        if (mNearRight == null) {
            mNearRight = HuaweiLatLng.wrap(mDelegate.nearRight);
        }
        return mNearRight;
    }

    @NonNull
    @Override
    public LatLng getFarLeft() {
        if (mFarLeft == null) {
            mFarLeft = HuaweiLatLng.wrap(mDelegate.farLeft);
        }
        return mFarLeft;
    }

    @NonNull
    @Override
    public LatLng getFarRight() {
        if (mFarRight == null) {
            mFarRight = HuaweiLatLng.wrap(mDelegate.farRight);
        }
        return mFarRight;
    }

    @NonNull
    @Override
    public LatLngBounds getLatLngBounds() {
        if (mLatLngBounds == null) {
            mLatLngBounds = HuaweiLatLngBounds.wrap(mDelegate.latLngBounds);
        }
        return mLatLngBounds;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        HuaweiVisibleRegion that = (HuaweiVisibleRegion) obj;

        return mDelegate.equals(that.mDelegate);
    }

    @Override
    public int hashCode() {
        return mDelegate.hashCode();
    }

    @NonNull
    @Override
    public String toString() {
        return mDelegate.toString();
    }


    static VisibleRegion wrap(com.huawei.hms.maps.model.VisibleRegion delegate) {
        return new HuaweiVisibleRegion(delegate);
    }

}