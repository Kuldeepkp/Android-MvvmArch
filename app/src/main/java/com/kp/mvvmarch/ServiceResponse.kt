package com.kp.mvvmarch
import com.google.gson.annotations.SerializedName
import com.kp.mvvmarch.Result

data class ServiceResponse(
    @SerializedName("page")
    val page: Int?,
    @SerializedName("results")
    val results: List<Result>?,
    @SerializedName("total_pages")
    val totalPages: Int?,
    @SerializedName("total_results")
    val totalResults: Int?
)