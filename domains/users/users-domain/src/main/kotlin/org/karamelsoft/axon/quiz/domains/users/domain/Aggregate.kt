package org.karamelsoft.axon.quiz.domains.users.domain

import org.axonframework.commandhandling.CommandHandler
import org.axonframework.eventsourcing.EventSourcingHandler
import org.axonframework.modelling.command.AggregateIdentifier
import org.axonframework.modelling.command.AggregateLifecycle
import org.axonframework.spring.stereotype.Aggregate
import org.karamelsoft.axon.quiz.domains.users.api.*
import org.karamelsoft.research.axon.libraries.artifacts.api.Status

@Aggregate
internal class User() {

    @AggregateIdentifier
    private lateinit var id: UserId

    @CommandHandler
    fun handle(command: RegisterUser) = Status.of {
        AggregateLifecycle.apply(UserRegistered(
            userId =  command.userId,
            details = command.details,
            email =  command.email,
        ))
    }

    @CommandHandler
    fun handle(command: CorrectUserDetails) = Status.of {
        AggregateLifecycle.apply(UserDetailsCorrected(
            userId =  command.userId,
            newDetails = command.newDetails,
        ))
    }

    @CommandHandler
    fun handle(command: CorrectUserEmail) = Status.of {
        AggregateLifecycle.apply(UserEmailCorrected(
            userId =  command.userId,
            newEmail = command.newEmail,
        ))
    }

    @EventSourcingHandler
    fun on(event: UserEmailCorrected) {
        this.id = event.userId
    }

}
