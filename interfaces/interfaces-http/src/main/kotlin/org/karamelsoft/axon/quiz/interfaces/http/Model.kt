package org.karamelsoft.axon.quiz.interfaces.http

data class Event(
    val name: String,
    val payload: Any
) {
    companion object {
        fun empty() = Event(
            name = Void::javaClass.name,
            payload = Void.TYPE
        )

        fun from(payload: Any) = Event(
            name = payload.javaClass.simpleName,
            payload = payload
        )
    }
}
