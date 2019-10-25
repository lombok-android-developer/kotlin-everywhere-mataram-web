 
package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class RizkyTumangger : Contributor {
    override val photoUrl: String?
        get() = "https://avatars1.githubusercontent.com/u/56517576?s=220&v=4"
    override val descriptions: String?
        get() = "Kalau handsome begimanapun tetap hensem"
    override val currentJob: String?
        get() = "Mahasiswa"
    override val idGithub: String
        get() = "ratmgr"
    override val name: String
        get() = "Rizky Aulia Tumangger"
    override val email: String?
        get() = "rzkytmgr@gmail.com"
    override val facebook: String?
        get() = "https://www.facebook.com/rzkytmgr"
    override val instagram: String?
        get() = "https://www.instagram.com/rzkytmgr"
    override val twitter: String?
        get() = "https://www.twitter.com/rzkytmgr"
    override val linkedin: String?
        get() = null
    override val stackOverflow: String?
        get() = null
    override val idTelegram: String?
        get() = null
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("C++"),
            Skills("HTML5"),
            Skills("CSS"),
            Skills("Javascript"),
            Skills("Bootstrap"),
            Skills("PHP"),
            Skills("Java"),
            Skills("Kotlin"),
            Skills("Ngegombal")
        )
    override val location: String?
        get() = "Sidikalang"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Developer",
                "Company Sendiri",
                "till now",
                "Present"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "SDN 030279 Sidikalang",
                "Tamat",
                "2013",
                "Lulus"
            ),
            Educations(
                "MTsS Sidikalang",
                "Tamat",
                "2016",
                "Lulus"
            ),
            Educations(
                "SMAN 1 Sidikalang",
                "Tamat",
                "2019",
                "MIPA"
            ),
            Educations(
                 "Politeknik Negeri Medan",
                 "Proses",
                 "D3",
                 "now",
                 "Manajemen Informatika"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ratmgr"] = RizkyTumangger()
        }
    }
}
