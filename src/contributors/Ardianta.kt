package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class Ardianta : Contributor {
    override val photoUrl: String?
        get() = "https://avatars3.githubusercontent.com/u/4420029?s=460&v=4"
    override val descriptions: String?
        get() = "I am Dian, I like to learn new things"
    override val currentJob: String?
        get() = "Freelancer"
    override val idGithub: String
        get() = "@ardianta"
    override val name: String
        get() = "Ahmad Muhardian"
    override val email: String?
        get() = "dian@petanikode.com"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/ardianta/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/2658551/dian"
    override val idTelegram: String?
        get() = "@ardiantapargo"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("PHP"),
            Skills("Javascript"),
            Skills("Python"),
            Skills("Java"),
            Skills("Kotlin")
        )
    override val location: String?
        get() = "Lombok Tengah"
    override val jobHistory: List<Jobs>?
        get() = listOf(
             Jobs(
                "Internship",
                "PT Telkom, Tbk",
                "Teknisi Jaringan",
                "Jan 2011",
                "Mei 2011"
            ),
            Jobs(
                "Lecturer Assistant",
                "Lab. Universitas Bumigora",
                "Programming tutor",
                "2015",
                "2018"
            ),
            Jobs(
                "Interenship",
                "CV. Citra Computer",
                "Web Developer",
                "Agustus 2018",
                "September 2018"
            ),
            Jobs(
                "Founder",
                "Petani Kode",
                "Bootstraping",
                "2014"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Universitas Bumigora",
                "S1",
                "2012 - 2019",
                "Ilmu Komputer"
            ),
            Educations(
                "SMK Negeri 2 Kuripan",
                "-",
                "2009 - 2012",
                "Teknik Komputer dan Jaringan"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("ardianta.hbs", mapOf("user" to this)))
    }

    companion object {
        fun initialize(map: MutableMap<String, Contributor>) {
            map["dian"] = Ardianta()
        }
    }
}