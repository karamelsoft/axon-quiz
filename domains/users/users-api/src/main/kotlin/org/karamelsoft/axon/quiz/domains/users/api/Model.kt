package org.karamelsoft.axon.quiz.domains.users.api

import java.util.*

data class UserId(val value: UUID = UUID.randomUUID())
data class UserDetails(val firstName: String, val lastName: String)
data class UserEmail(val address: String)
