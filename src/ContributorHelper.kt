package com.linov.community

import com.linov.community.contributors.AriPurnamaAJi
import com.linov.community.contributors.HayiNukman
import com.linov.community.contributors.AddinGamaBertaqwa
import com.linov.community.contributors.*
import io.ktor.application.ApplicationCall

object ContributorHelper {
    var contributors: MutableMap<String, Contributor> = mutableMapOf()
    init {
        contributors.apply {
            HayiNukman.initialize(this)
            AriPurnamaAJi.initialize(this)
            AddinGamaBertaqwa.initialize(this)
            AhmadZafrullah.initialize(this)
            Anwar907.initialize(this)
            GustiCahya.initialize(this)
            RiyanRizkiyawan.initialize(this)
            // todo tambahkan inisialisasi ke class Contributor anda
        }
    }

    suspend fun response(call: ApplicationCall) {
        val id = call.parameters["id"]
        println(id)
        contributors[id]?.response(call)
    }
}

