package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond

class AriPurnamaAJi : Contributor{
    val telepone:String get() = "+6283-1898-82173"
    val headerPhoto:String get() = "https://scontent.fdps5-1.fna.fbcdn.net/v/t1.0-9/43056164_2120204024867007_4139270664185970688_n.jpg?_nc_cat=103&_nc_eui2=AeET84LDCr7bso527Ti1SPwN_Cj6P4Pb_teTFCGwav0BAocxrVFUwmk3Z6zFlbQwLine9bHDM2xoMASvj7994E8GdzQN4WqyCSva_GviRsj_sw&_nc_oc=AQm9U9o0IZwMIlgnxcOKa9YN7IJaE9WXDoJbmTVuxVRwHNn93eRKR6u7617urTNGeIs&_nc_ht=scontent.fdps5-1.fna&oh=a46e5931649c91e26571d604f60e12f8&oe=5DF03231"
    val facebookUrl:String get() = "https://www.facebook.com/ali.sangfighter"
    val intagramId:String get() = "@ari_aji25"
    override val idGithub: String
        get() = "@ariaji25"
    override val name: String
        get() = "Ari Purnama Aji"
    override val photoUrl: String?
        get() = "https://scontent.fdps5-1.fna.fbcdn.net/v/t1.0-9/34482003_2002175153336562_3544921141166473216_n.jpg?_nc_cat=111&_nc_oc=AQn1oM97m-1avZgytPHJNbqdpy1WUkPVwv9x3dz7jCjg3lMBK1EYCJfEB17b67y4xrs&_nc_ht=scontent.fdps5-1.fna&oh=3beaa55704b12fa52bca261d2ab2889e&oe=5E3CF1F2"
    override val currentJob: String?
        get() = "Android Developer"
    override val email: String?
        get() = "ari.purnama838@gmail.com"
    override val descriptions: String?
        get() = "I am Junior Developer, I am start to Join into Android Development on 2019 start with Java Android, and Flutter for Mobile.\n " +
                "After that I am join into Lumbung Inovasi to get more experience, and I join every project that I can to work with Android Development "
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/ari-aji-29208b180/"
    override val stackOverflow: String?
        get() = "https://stackoverflow.com/users/9967898/ari-purnama"
    override val idTelegram: String?
        get() = "@ariaji25"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Java", expertiseRate= 85),
            Skills("C",  expertiseRate= 80),
            Skills("C++",  expertiseRate= 80),
            Skills("Python",  expertiseRate= 70),
            Skills("Kotlin",  expertiseRate= 88),
            Skills("PHP", expertiseRate= 60),
            Skills("Flutter for Mobile",  expertiseRate= 85),
            Skills("Android Java",  expertiseRate= 80),
            Skills("Android Kotlin",  expertiseRate= 88)
        )
    override val location: String?
        get() = "Mataram, Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Android Developer",
                "Lumbung Inovasi",
                "Join every project that I can work for Android Development",
                "Jan 2019","Present")
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "Dicoding Academy",
                "Beginner",
                "Jul 2019",
                "Belajar Membuat Aplikasi Android untuk Pemula"
                ),
            Educations(
                "Universitas Mataram",
                "Undergraduate",
                "Aug 2016",
                "Informatics Engenering"
            )
        )
    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("Ariaji_CvResume.hbs", mapOf("user" to this)))
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }

    companion object{
        fun initialize(map: MutableMap<String, Contributor>) {
            map["ariaji25"] = AriPurnamaAJi()
        }
    }
}