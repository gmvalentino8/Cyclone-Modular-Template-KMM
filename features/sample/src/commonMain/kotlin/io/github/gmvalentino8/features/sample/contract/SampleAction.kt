package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.contract.Action
import io.github.gmvalentino8.cyklone.contract.ProcessEventAction
import io.github.gmvalentino8.domain.entities.User

sealed class SampleAction : Action {
    object LoadUsers : SampleAction()
    data class SelectUser(val user: User): SampleAction()
    data class ProcessEvent(override val event: SampleEvent): SampleAction(), ProcessEventAction<SampleEvent>
}
