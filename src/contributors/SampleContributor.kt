package com.linov.community.contributors

import com.linov.community.Contributor
import com.linov.community.Educations
import com.linov.community.Jobs
import com.linov.community.Skills
import io.ktor.application.ApplicationCall

/**
 * RULE: Class harus menggunakan interface Contributor.
 */
class SampleContributor: Contributor {
    override val idGithub: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val name: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val photoUrl: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val currentJob: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val email: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val descriptions: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val linkedin: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val stackOverflow: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val idTelegram: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val skillset: List<Skills>?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val location: String?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val jobHistory: List<Jobs>?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val educations: List<Educations>?
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override suspend fun response(call: ApplicationCall) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}