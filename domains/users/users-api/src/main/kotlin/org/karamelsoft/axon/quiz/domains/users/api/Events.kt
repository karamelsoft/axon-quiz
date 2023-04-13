package org.karamelsoft.axon.quiz.domains.users.api

import java.time.Instant

interface UserEvent {
    val userId: UserId
    val timestamp: Instant
}

data class UserRegistered(
    override val userId: UserId,
    val details: UserDetails,
    val email: UserEmail,
    override val timestamp: Instant = Instant.now(),
): UserEvent

data class UserDetailsCorrected(
    override val userId: UserId,
    val newDetails: UserDetails,
    override val timestamp: Instant = Instant.now(),
): UserEvent

data class UserEmailCorrected(
    override val userId: UserId,
    val newEmail: UserEmail,
    override val timestamp: Instant = Instant.now(),
): UserEvent
