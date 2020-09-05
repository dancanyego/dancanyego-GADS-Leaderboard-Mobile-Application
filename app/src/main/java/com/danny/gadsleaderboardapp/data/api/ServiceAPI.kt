package com.danny.gadsleaderboard.data.api

import com.danny.gadsleaderboard.data.models.LeaderBoardResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface ServiceAPI {

    @GET("{filter}")
    suspend fun getLeaderBoard(@Path("filter") filter: String): Response<LeaderBoardResponse>
}