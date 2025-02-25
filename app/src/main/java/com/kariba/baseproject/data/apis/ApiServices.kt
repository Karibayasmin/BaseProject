package com.kariba.baseproject.data.apis

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    /*-------------------------------Some Common uses method------------------------------------*/

    @GET("api/app/v1/accounts")
    suspend fun getAccount(
        @Query("par_page") perPage: Int = 1
    ): Response<AccountDetailsResponse>

    @POST("api/app/v1/update-data-fetch")
    suspend fun getAccountDetails(
        @Query("page") pageNumber: Int,
        @Query("par_page") perPage: Int = PerPageCount.perPage.value,
        @Body request:  LatestDataFetchRequest
    ): Response<LatestAccountDetailsResponse>

    @POST("api/app/v1/account/adjustment")
    suspend fun submitCashInOut(
        @Body request: AccountDetailsRequest
    ): Response<CashInOutResponse>

    @PUT("api/app/v1/account/transaction-update/{transactionId}")
    suspend fun updateCashINorOUT(
        @Path("transactionId") transactionId: Int,
        @Body request: AccountDetailsRequest
    ): Response<CashInOutResponse>

    @DELETE("api/app/v1/account/transaction-delete/{transactionId}")
    suspend fun transactionDelete(@Path("transactionId") transactionId: Int): Response<SimpleResponse>
}