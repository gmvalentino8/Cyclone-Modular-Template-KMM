package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.contract.Intent
import io.github.gmvalentino8.cyklone.contract.ProcessEventIntent
import io.github.gmvalentino8.domain.entities.User

sealed class SampleIntent : Intent {
    object ClickLoad : SampleIntent()
    object ClickRetry: SampleIntent()
    data class ClickUser(val user: User) : SampleIntent()
    data class ProcessEvent(override val event: SampleEvent) : SampleIntent(), ProcessEventIntent<SampleEvent>
}
