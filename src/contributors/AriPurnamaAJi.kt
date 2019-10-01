package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AriPurnamaAJi : Contributor{
    override val idGithub: String
        get() = "@ariaji25"
    override val name: String
        get() = "Ari Purnama Aji"
    override val photoUrl: String?
        get() = "https://www.facebook.com/photo.php?fbid=2306173556270052&set=pb.100006322900001.-2207520000.1569939010.&type=3&theater"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "ari.purnama838@gmail.com"
    override val descriptions: String?
        get() = "I am Junior Developer, and My Quote is No Life Without Code, simple like that,but actualy we always need a women wkwkwk"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/ari-aji-29208b180/"
    override val stackOverflow: String?
        get() = ""
    override val idTelegram: String?
        get() = "@ariaji25"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java"),
            Skills("C"),
            Skills("C++"),
            Skills("Python"),
            Skills("Kotlin"),
            Skills("PHP"),
            Skills("Flutter for Mobile"),
            Skills("Android Java"),
            Skills("Android Kotlin")
        )
    override val location: String?
        get() = "Mataram, Nusa Tenggara Barat, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Lumbung Inovasi",
                "join every project that I can work for Android Development",
                "2019",
                "-")
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academy",
                "Beginner",
                "2019",
                "Belajar Membuat Aplikasi Android untuk Pemula"
                )
        )
    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ariaji25"] = HayiNukman()
        }
    }

}