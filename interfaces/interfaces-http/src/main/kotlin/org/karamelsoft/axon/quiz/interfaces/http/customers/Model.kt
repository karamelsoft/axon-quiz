package org.karamelsoft.axon.quiz.interfaces.http.customers

import org.karamelsoft.axon.quiz.services.customers.api.CustomerAddress
import org.karamelsoft.axon.quiz.services.customers.api.CustomerDetails
import java.time.Instant

interface CustomerAction {
    val timestamp: Instant
}

data class CustomerRegistration(
    val details: CustomerDetails,
    val address: CustomerAddress,
    override val timestamp: Instant = Instant.now()
): CustomerAction

data class CustomerDetailsCorrection(
    val newDetails: CustomerDetails,
    override val timestamp: Instant = Instant.now()
): CustomerAction

data class CustomerAddressCorrection(
    val newAddress: CustomerAddress,
    override val timestamp: Instant = Instant.now()
): CustomerAction
