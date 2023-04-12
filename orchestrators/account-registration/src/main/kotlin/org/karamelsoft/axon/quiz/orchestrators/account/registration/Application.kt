package org.karamelsoft.axon.quiz.orchestrators.account.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class AccountRegistrationApplication

fun main(args: Array<String>) {
    runApplication<AccountRegistrationApplication>(*args)
}
