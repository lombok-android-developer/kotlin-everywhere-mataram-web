package com.linov.community

import com.linov.community.contributors.*
import io.ktor.application.ApplicationCall

object ContributorHelper {
    var contributors: MutableMap<String, Contributor> = mutableMapOf()

    init {
        contributors.apply {
            Regina.initialize(this)
            Hanaramdhani.initialize(this)
            Nengayu.initialize(this)
            IndahPujiLestari.initialize(this)
            AddinGamaBertaqwa.initialize(this)
            AhmadZafrullah.initialize(this)
            IlhamBintang.initialize(this)
            GustiCahya.initialize(this)
            RahmatFathoni.initialize(this)
            RiyanRizkiyawan.initialize(this)
            EbySofyan.initialize(this)
            NaufalPrakoso.initialize(this)
            YudaKarnaen.initialize(this)
            RahmatRamadhan.initialize(this)
            AnasSegafMulachela.initialize(this)
            LukmanHakim.initialize(this)
            AgungSaputra.initialize(this)
            RickyAnwar.initialize(this)
            BagiHartawan.initialize(this)
            Ardianta.initialize(this)
            Jayadi.initialize(this)
            IDzuna96.initialize(this)
            WahyuSyarif.initialize(this)
            Fathurrahman.initialize(this)
            AriPurnamaAJi.initialize(this)
            Anwar907.initialize(this)
            Jiadibo.initialize(this)
            HayiNukman.initialize(this)
            medicare.initialize(this)
            // todo tambahkan inisialisasi ke class Contributor anda
        }
    }

    suspend fun response(call: ApplicationCall) {
        val id = call.parameters["id"]
        contributors[id]?.response(call)
    }

    fun mapIdToContributor() = contributors.entries
        .groupBy { it.value.email }
        .map { it.value.first().key to it.value.first().value }.toList()
}

