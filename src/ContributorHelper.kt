package com.linov.community

import com.linov.community.contributors.AriPurnamaAJi
import com.linov.community.contributors.AhmadZafrullah
import com.linov.community.contributors.HayiNukman
import com.linov.community.contributors.IlhamBintang
import com.linov.community.contributors.AddinGamaBertaqwa
import io.ktor.application.ApplicationCall

object ContributorHelper {
    var contributors: MutableMap<String, Contributor> = mutableMapOf()
    init {
        contributors.apply {
            HayiNukman.initialize(this)
            AriPurnamaAJi.initialize(this)
            AddinGamaBertaqwa.initialize(this)
            AhmadZafrullah.initialize(this)
            IlhamBintang.initialize(this)
            // todo tambahkan inisialisasi ke class Contributor anda
        }
    }

    suspend fun response(call: ApplicationCall) {
        val id = call.parameters["id"]
        println(id)
        contributors[id]?.response(call)
    }
}

