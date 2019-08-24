package com.zeroxitconsulting.androidutils

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


fun GoogleMap.setHybrid() {
    this.mapType = GoogleMap.MAP_TYPE_HYBRID

}

fun GoogleMap.setNormal() {
    this.mapType = GoogleMap.MAP_TYPE_NORMAL

}

fun GoogleMap.setSatellite() {
    this.mapType = GoogleMap.MAP_TYPE_SATELLITE

}

fun GoogleMap.setTerrain() {
    this.mapType = GoogleMap.MAP_TYPE_TERRAIN

}

fun GoogleMap.setIndoor() {
    this.isIndoorEnabled = true
}

fun GoogleMap.setOutdoor() {
    this.isIndoorEnabled = false
}

fun GoogleMap.setTrafficOn() {
    this.isTrafficEnabled = true
}

fun GoogleMap.enableZoomGestures() {
    val mapSettings = this.uiSettings
    mapSettings.isZoomGesturesEnabled = true
}

fun GoogleMap.enableZoomControl() {
    val mapSettings = this.uiSettings
    mapSettings.isZoomControlsEnabled = true
}

fun GoogleMap.enableCompass() {
    val mapSettings = this.uiSettings
    mapSettings.isCompassEnabled = true
}

fun GoogleMap.disableZoomGestures() {
    val mapSettings = this.uiSettings
    mapSettings.isZoomGesturesEnabled = false
}

fun GoogleMap.disableZoomControl() {
    val mapSettings = this.uiSettings
    mapSettings.isZoomControlsEnabled = false
}

fun GoogleMap.disableCompass() {
    val mapSettings = this.uiSettings
    mapSettings.isCompassEnabled = false
}

fun GoogleMap.setTrafficOff() {
    this.isTrafficEnabled = false
}

fun GoogleMap.moveCamera(pos: LatLng) {
    this.moveCamera(CameraUpdateFactory.newLatLng(pos))
}

fun GoogleMap.addMarkerWithString(pos: LatLng, msg: String) {
    this.addMarker(
        MarkerOptions().position(pos)
            .title(msg)
    )
}

fun GoogleMap.addMarkerOnCenter() {
    val mUpCameraPosition: CameraPosition = this.cameraPosition
    val markerOptions = MarkerOptions()
    markerOptions
        .position(LatLng(mUpCameraPosition.target.latitude, mUpCameraPosition.target.longitude))
    this.addMarker(markerOptions)
}