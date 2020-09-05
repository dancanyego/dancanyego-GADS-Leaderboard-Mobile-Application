package com.danny.gadsleaderboard.data.repository

import com.danny.gadsleaderboard.data.api.ServiceBuilder


/**
 * Created by Mohamed Assem on 03-Sep-20.
 * mohamed.assem.ali@gmail.com
 */

class LeaderBoardRepository {

    suspend fun getLeaderBoard(filter: String) =
        ServiceBuilder.api.getLeaderBoard(filter)
}