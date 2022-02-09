package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.contract.ProcessEventResult
import io.github.gmvalentino8.cyklone.contract.Result
import io.github.gmvalentino8.cyklone.contract.SendEventResult
import io.github.gmvalentino8.domain.core.DomainError
import io.github.gmvalentino8.domain.entities.User

sealed class SampleResult : Result{
    object Loading : SampleResult()
    data class GetUsersSuccess(val users: List<User>) : SampleResult()
    data class GetUsersError(val error: DomainError) : SampleResult()
    data class SendEvent(override val event: SampleEvent) : SampleResult(), SendEventResult<SampleEvent>
    data class ProcessEvent(override val event: SampleEvent) : SampleResult(), ProcessEventResult<SampleEvent>
}
