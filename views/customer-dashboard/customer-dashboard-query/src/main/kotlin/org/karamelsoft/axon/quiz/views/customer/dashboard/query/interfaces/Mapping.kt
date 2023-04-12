package org.karamelsoft.axon.quiz.views.customer.dashboard.query.interfaces

import org.karamelsoft.axon.quiz.services.customers.api.CustomerAddress
import org.karamelsoft.axon.quiz.services.customers.api.CustomerDetails

fun CustomerDetails.toQueryAPI() = org.karamelsoft.axon.quiz.views.customer.dashboard.api.CustomerDetails(
    firstName = firstName,
    lastName = lastName,
    birthDate = birthDate
)

fun CustomerAddress.toQueryAPI() = org.karamelsoft.axon.quiz.views.customer.dashboard.api.CustomerAddress(
    street = street,
    number = number,
    postalCode = postalCode,
    city = city,
    country = country
)
