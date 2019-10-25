package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

/**
 * SAMPLE CV yang menggunakan standard template
 * Pastikan nama class nya adalah Unique,
 * misalnya nama Anda: Husein Abdullah,
 * maka nama classnya bisa: HAbdullah, HuseinAbdullah, HuseinAbd123, dll.
 * Jika sudah ada yang menggunakan nama class tersebut, tolong gunakan nama yang lain.
 */
class HayiNukman : Contributor {
    override val photoUrl: String?
        get() = "https://www.dicoding.com/images/small/avatar/2018071714224122cd6855736cd00a225f99d4b6212d91.png"
    override val descriptions: String?
        get() = "isi dah bebas...."
    override val currentJob: String?
        get() = "Android Developer"
    override val idGithub: String
        get() = "@ha-yi"
    override val name: String
        get() = "Hayi Nukman"
    override val email: String?
        get() = "hayinukman.kt@gmail.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/hayinukman/"
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = "@hayinukman"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Kotlin"),
            Skills("Java"),
            Skills("C/C++"),
            Skills("IOT"),
            Skills("Android Development"),
            Skills("Kotlin Web"),
            Skills("Kotlin API"),
            Skills("Full-stack Kotlin"),
            Skills("Flutter"),
            Skills("Flutter Web"),
            Skills("Flutter Desktop")
        )
    override val location: String?
        get() = "Mataram"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Samsung",
                "Tukang ngetik aja",
                "2013",
                "2015"
            ),
            Jobs(
                "Android Developer",
                "Tokopedia",
                "Tukang ngetik aja",
                "2015",
                "2016"
            ),
            Jobs(
                "Android Developer",
                "Freelance",
                "Tukang ngetik aja",
                "2016",
                "2017"
            ),
            Jobs(
                "Android Developer",
                "Bukalapak",
                "Tukang ngetik aja",
                "2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academi",
                "Associate",
                "2018",
                "KADE"
            ),
            Educations(
                "AKAKOM Yogyakarta",
                "S1",
                "2006 - 2010",
                "Teknik Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ha-yi"] = HayiNukman()
            map["hayinukman"] = HayiNukman()
            map["hayi"] = HayiNukman()
        }
    }
}