package com.test.phonepe.androidassignment1.data.model

import com.google.gson.annotations.SerializedName


data class PlaceDetails(
    @SerializedName("venues")
    val venues: List<Venue?>? = null,
    @SerializedName("meta")
    val meta: Meta? = null
)


data class Venue(
    @SerializedName("state")
    val state: Any? = null,
    @SerializedName("name_v2")
    val nameV2: String? = null,
    @SerializedName("postal_code")
    val postalCode: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("links")
    val links: List<Any?>? = null,
    @SerializedName("timezone")
    val timezone: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("score")
    val score: Int? = null,
    @SerializedName("location")
    val location: Location? = null,
    @SerializedName("address")
    val address: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("has_upcoming_events")
    val hasUpcomingEvents: Boolean? = null,
    @SerializedName("num_upcoming_events")
    val numUpcomingEvents: Int? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("extended_address")
    val extendedAddress: String? = null,
    @SerializedName("stats")
    val stats: Stats? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("popularity")
    val popularity: Int? = null,
    @SerializedName("access_method")
    val accessMethod: Any? = null,
    @SerializedName("metro_code")
    val metroCode: Int? = null,
    @SerializedName("capacity")
    val capacity: Int? = null,
    @SerializedName("display_location")
    val displayLocation: String? = null
)

data class Meta(
    @SerializedName("total")
    val total: Int? = null,
    @SerializedName("took")
    val took: Int? = null,
    @SerializedName("page")
    val page: Int? = null,
    @SerializedName("per_page")
    val perPage: Int? = null,
    @SerializedName("geolocation")
    val geolocation: Geolocation? = null
)

data class Location(
    @SerializedName("lat")
    val lat: Double? = null,
    @SerializedName("lon")
    val lon: Double? = null
)

data class Stats(
    @SerializedName("event_count")
    val eventCount: Int? = null
)

data class Geolocation(
    @SerializedName("lat")
    val lat: Double? = null,
    @SerializedName("lon")
    val lon: Double? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("state")
    val state: String? = null,
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("postal_code")
    val postalCode: String? = null,
    @SerializedName("display_name")
    val displayName: String? = null,
    @SerializedName("metro_code")
    val metroCode: Any? = null,
    @SerializedName("range")
    val range: String? = null
)