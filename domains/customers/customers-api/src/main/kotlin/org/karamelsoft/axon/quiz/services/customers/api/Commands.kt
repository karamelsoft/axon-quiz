package org.karamelsoft.axon.quiz.services.customers.api

import com.google.common.hash.HashFunction
import com.google.common.hash.Hashing
import org.axonframework.commandhandling.RoutingKey
import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.Instant

sealed interface CustomerCommand {
    val customerId: CustomerId
    val timestamp: Instant
}

data class RegisterUniqueCustomer(
    @RoutingKey val customerId: CustomerId,
    val details: CustomerDetails,
    val address: CustomerAddress,
    val timestamp: Instant = Instant.now()
)

data class RegisterNewCustomer(
    @TargetAggregateIdentifier override val customerId: CustomerId,
    val details: CustomerDetails,
    val address: CustomerAddress,
    override val timestamp: Instant = Instant.now(),
) : CustomerCommand

data class CorrectCustomerDetails(
    @TargetAggregateIdentifier override val customerId: CustomerId,
    val newDetails: CustomerDetails,
    override val timestamp: Instant = Instant.now(),
) : CustomerCommand

data class CorrectCustomerAddress(
    @TargetAggregateIdentifier override val customerId: CustomerId,
    val newAddress: CustomerAddress,
    override val timestamp: Instant = Instant.now(),
) : CustomerCommand
