package com.kariba.baseproject.data.apis

import com.google.gson.annotations.SerializedName

data class GenericResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean? = false
)

data class LatestDataFetchRequest(
    @SerializedName("updated_at") var updatedAt: String? = null,
    @SerializedName("model") var model: String? = null
)