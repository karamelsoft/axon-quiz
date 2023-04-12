package org.karamelsoft.axon.quiz.views.customer.dashboard.api

data class GetCustomerDashboard(val customerId: CustomerId)
data class CustomerDashboardResponse(val customerDashboard: CustomerDashboard?)
