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
package me.tatiyanupanwong.supasin.android.libraries.kits.maps.model

/**
 * Contains the four points defining the four-sided polygon that is visible in a map's camera. This
 * polygon can be a trapezoid instead of a rectangle, because a camera can have tilt. If the camera
 * is directly over the center of the camera, the shape is rectangular, but if the camera is tilted,
 * the shape will appear to be a trapezoid whose smallest side is closest to the point of view.
 *
 * @since 1.0.0
 */
interface VisibleRegion {
    /**
     * [LatLng] object that defines the bottom left corner of the camera.
     *
     * @return [LatLng] object that defines the bottom left corner of the camera.
     */
    val nearLeft: LatLng

    /**
     * [LatLng] object that defines the bottom right corner of the camera.
     *
     * @return [LatLng] object that defines the bottom right corner of the camera.
     */
    val nearRight: LatLng

    /**
     * [LatLng] object that defines the far left corner of the camera.
     *
     * @return [LatLng] object that defines the far left corner of the camera.
     */
    val farLeft: LatLng

    /**
     * [LatLng] object that defines the far right corner of the camera.
     *
     * @return [LatLng] object that defines the far right corner of the camera.
     */
    val farRight: LatLng

    /**
     * The smallest bounding box that includes the visible region defined in this class.
     *
     *
     * If this box crosses the 180Â° meridian (the vertical line from north to south), the
     * longitude in [farRight][.getFarRight] will be negative and the longitude in [ ][.getFarLeft] will be positive. This rule also applies to [ nearRight][.getNearRight] and [nearLeft][.getNearLeft].
     *
     * @return The smallest bounding box that includes the visible region defined in this class.
     */
    val latLngBounds: LatLngBounds
}