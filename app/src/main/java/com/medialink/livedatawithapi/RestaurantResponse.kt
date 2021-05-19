package com.medialink.livedatawithapi
import com.google.gson.annotations.SerializedName


data class RestaurantResponse(
    @SerializedName("error")
    val error: Boolean?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("restaurant")
    val restaurant: Restaurant?
)

data class Restaurant(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("address")
    val address: String?,
    @SerializedName("pictureId")
    val pictureId: String?,
    @SerializedName("categories")
    val categories: List<Category>?,
    @SerializedName("menus")
    val menus: Menus?,
    @SerializedName("rating")
    val rating: Double?,
    @SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>?
)

data class Category(
    @SerializedName("name")
    val name: String?
)

data class Menus(
    @SerializedName("foods")
    val foods: List<Food>?,
    @SerializedName("drinks")
    val drinks: List<Drink>?
)

data class CustomerReviewsItem(
    @SerializedName("name")
    val name: String?,
    @SerializedName("review")
    val review: String?,
    @SerializedName("date")
    val date: String?
)

data class Food(
    @SerializedName("name")
    val name: String?
)

data class Drink(
    @SerializedName("name")
    val name: String?
)