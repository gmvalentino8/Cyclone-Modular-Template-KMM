package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.contract.Event
import io.github.gmvalentino8.domain.entities.User

sealed class SampleEvent : Event() {
    data class NavigateToDetails(val user: User) : SampleEvent()
    object NavigateBack : SampleEvent()
}
