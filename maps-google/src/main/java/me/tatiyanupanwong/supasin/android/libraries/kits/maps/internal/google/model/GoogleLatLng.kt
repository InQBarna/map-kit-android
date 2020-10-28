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
package me.tatiyanupanwong.supasin.android.libraries.kits.maps.internal.google.model

import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
internal class GoogleLatLng private constructor(private val mDelegate: LatLng) : me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng {

    constructor(latitude: Double, longitude: Double) : this(LatLng(latitude, longitude)) {}

    override val latitude: Double
        get() = mDelegate.latitude
    override val longitude: Double
        get() = mDelegate.longitude

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as GoogleLatLng
        return mDelegate == that.mDelegate
    }

    override fun hashCode(): Int {
        return mDelegate.hashCode()
    }

    override fun toString(): String {
        return mDelegate.toString()
    }

    companion object {
        fun wrap(delegate: LatLng): me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng {
            return GoogleLatLng(delegate)
        }

        @JvmStatic
        fun wrap(delegates: Iterable<LatLng>?): List<me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng>? {
            if (delegates == null) {
                return null
            }
            val iter = delegates.iterator()
            val list: MutableList<me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng> = ArrayList()
            while (iter.hasNext()) {
                list.add(wrap(iter.next()))
            }
            return list
        }

        fun unwrap(wrapped: me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng): LatLng {
            return (wrapped as GoogleLatLng).mDelegate
        }

        @JvmStatic
        fun unwrap(wrappeds: Iterable<me.tatiyanupanwong.supasin.android.libraries.kits.maps.model.LatLng>?): List<LatLng>? {
            if (wrappeds == null) {
                return null
            }
            val iter = wrappeds.iterator()
            val list: MutableList<LatLng> = ArrayList()
            while (iter.hasNext()) {
                list.add(unwrap(iter.next()))
            }
            return list
        }
    }
}