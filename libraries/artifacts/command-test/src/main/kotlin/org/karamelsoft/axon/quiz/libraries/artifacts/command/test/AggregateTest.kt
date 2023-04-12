package org.karamelsoft.axon.quiz.libraries.artifacts.command.test

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.axonframework.test.aggregate.AggregateTestFixture

open class AggregateTest<A>(aggregateType: Class<A>) {
    val aggregate: AggregateTestFixture<A> = AggregateTestFixture(aggregateType)
    val objectMapper: ObjectMapper = ObjectMapper().registerModules(
        JavaTimeModule(),
        KotlinModule.Builder().build()
    )
}
