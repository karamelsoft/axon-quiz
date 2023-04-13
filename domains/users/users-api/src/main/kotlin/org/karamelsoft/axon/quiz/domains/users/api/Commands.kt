package org.karamelsoft.axon.quiz.domains.users.api

import java.time.Instant

interface Commands {
    val userId: UserId
    val timestamp: Instant
}

data class RegisterUser(
    val userId: UserId,
    val details: UserDetails,
    val email: UserEmail,
)

data class CorrectUserDetails(
    val userId: UserId,
    val newDetails: UserDetails,
)

data class CorrectUserEmail(
    val userId: UserId,
    val newEmail: UserEmail,
)
