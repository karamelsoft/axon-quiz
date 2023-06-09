package org.karamelsoft.axon.quiz.domains.users.api

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.Instant

interface UserCommand {
    val userId: UserId
    val timestamp: Instant
}

data class RegisterUser(
    @TargetAggregateIdentifier override val userId: UserId,
    val details: UserDetails,
    val email: UserEmail,
    override val timestamp: Instant = Instant.now(),
): UserCommand

data class CorrectUserDetails(
    @TargetAggregateIdentifier override val userId: UserId,
    val newDetails: UserDetails,
    override val timestamp: Instant = Instant.now(),
): UserCommand

data class CorrectUserEmail(
    @TargetAggregateIdentifier override val userId: UserId,
    val newEmail: UserEmail,
    override val timestamp: Instant = Instant.now(),
): UserCommand
