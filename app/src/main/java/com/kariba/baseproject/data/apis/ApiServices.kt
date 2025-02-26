package com.kariba.baseproject.data.apis

import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    /*-------------------------------Some Common uses method------------------------------------*/

    /*Situation basis method use at the time of @GET operation*/

    /*@GET("")
    suspend fun getAccount(
        @Query("par_page") perPage: Int = 1
    ): Response<AccountDetailsResponse>

    @GET("Link/{ulid}")
    suspend fun fetchStockDetailsByProduct(
        @Path("ulid") ulid: String,
        @Query("start_date") startDate: String?,
        @Query("end_date") end_date: String?,
        @Query("page") page: Int = 0
    ): Response<ProductStockDetailsResponse>

    @GET("")
    suspend fun fetchDailyRevenueOutgoings(
        @Query("start_date") startDate: String,
        @Query("end_date") end_date: String
    ): Response<DailyRevenueOutgoingResponse>*/

    /*Situation basis method use at the time of @POST operation*/

    /*@Multipart
    @POST("")
    suspend fun fileUpload(
        @Part file: MultipartBody.Part?
    ): Response<FileUploadResponse>

    @Multipart
    @POST("")
    suspend fun multipleFileUpload(
        @Part files: List<MultipartBody.Part?>
    ): Response<MultipleFileUploadResponse>

    @POST("")
    suspend fun getAccountDetails(
        @Query("page") pageNumber: Int,
        @Query("par_page") perPage: Int = PerPageCount.perPage.value,
        @Body request:  LatestDataFetchRequest
    ): Response<LatestAccountDetailsResponse>

    @POST("")
    suspend fun submitCashInOut(
        @Body request: AccountDetailsRequest
    ): Response<CashInOutResponse>

    @POST("Link/{expense_id}")
    suspend fun updateExpense(
        @Path("expense_id") expense_id: String,
        @Body request: ExpenseAddModel
    ): Response<ExpenseAddResponse>*/

    /*Situation basis method use at the time of @PUT operation*/
    /*@PUT("Link/{transactionId}")
    suspend fun updateCashINorOUT(
        @Path("transactionId") transactionId: Int,
        @Body request: AccountDetailsRequest
    ): Response<CashInOutResponse>*/

    /*Situation basis method use at the time of @DELETE operation*/
    /*@DELETE("Link/{transactionId}")
    suspend fun transactionDelete(@Path("transactionId") transactionId: Int): Response<SimpleResponse>*/
}