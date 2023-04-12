package org.karamelsoft.axon.quiz.interfaces.http.cards

import org.junit.jupiter.api.Test
import org.karamelsoft.axon.quiz.libraries.artifacts.test.serialize
import java.time.Instant

class ModelTest {

    private val pinCode = "1234"
    private val newPinCode = "2341"
    private val now = Instant.now()

    @Test
    fun `test model serialization`() {
        listOf(
            CardSetup("1234", now),
            CardPinChange(pinCode, newPinCode, now),
            CardPinValidation(pinCode, now),
        ).forEach { serialize(it) }
    }
}
