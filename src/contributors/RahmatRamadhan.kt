package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall
import io.ktor.mustache.MustacheContent
import io.ktor.response.respond
import kotlinx.css.map

class RahmatRamadhan : Contributor{
    override val idGithub: String
        get() = "petradude"
    override val name: String
        get() = "Rahmat Ramadhan"
    override val photoUrl: String?
        get() = "https://scontent-sin2-2.cdninstagram.com/vp/dfda341e9488363371f5c18173736753/5E3E6FFA/t51.2885-19/s150x150/58453680_430953744116906_8096284378281279488_n.jpg?_nc_ht=scontent-sin2-2.cdninstagram.com"
    override val currentJob: String?
        get() = "Electrical and Electronic Engineer"
    override val email: String?
        get() = "rahmatramadhan1997@gmail.com"
    override val descriptions: String?
        get() = "Electrical and Electronic Engineering"
    override val linkedin: String?
        get() = "https://www.linkedin.com/in/rahmat-ramadhan-666019179/"
    override val stackOverflow: String?
        get() = ""
    override val idTelegram: String?
        get() = "@RahmatBeko"
    override val skillset: List<Skills>?
        get() = listOf(
            Skills("Electrical and Electronic Maintenance", expertiseRate = 80),
            Skills("Design and Simulate about Electrical and Electronic Circuit", expertiseRate = 85),
            Skills("Microcontroller (Based on IoT)", expertiseRate = 80),
            Skills("Programmable Logic Controller", expertiseRate = 70),
            Skills("3D Design using SketchUP", expertiseRate = 80),
            Skills("2D Design using Photoshop", expertiseRate = 70),
            Skills("Video Editor using Vegas Pro", expertiseRate = 75)
        )
    override val location: String?
        get() = "Mataram - Indonesia"
    override val jobHistory: List<Jobs>?
        get() = listOf(
            Jobs(
                "Interns",
                "PT. AMMAN MINERAL NUSA TENGGARA",
                "Electrical and Electronic Maintenance",
                "Oct 2018",
                "Dec 2018"
            )
        )
    override val educations: List<Educations>?
        get() = listOf(
            Educations(
                "University of Mataram",
                "S1",
                "2015-2019",
                "Electrical and Electronic Engineering"
            )
        )

    override suspend fun response(call: ApplicationCall) {
        call.respond(MustacheContent("cv.hbs", mapOf("user" to this)))
    }
    companion object{
        fun initialize(map: MutableMap<String,Contributor>){
            map["RahmatRamadhan"]=RahmatRamadhan()
        }
    }

}