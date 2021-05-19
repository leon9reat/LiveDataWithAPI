package com.medialink.livedatawithapi
import com.google.gson.annotations.SerializedName


data class PostReviewResponse(
    @SerializedName("error")
    val error: Boolean?,
    @SerializedName("message")
    val message: String?,
    @SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>?
)
