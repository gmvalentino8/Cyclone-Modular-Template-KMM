package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.contract.ViewState
import io.github.gmvalentino8.domain.core.DomainError
import io.github.gmvalentino8.domain.entities.User
import io.github.gmvalentino8.utils.Parcelable
import io.github.gmvalentino8.utils.Parcelize

sealed class SampleViewState : ViewState {
    object None : SampleViewState()
    object Loading : SampleViewState()
    data class Success(val users: List<User>) : SampleViewState()
    data class Failure(val error: DomainError) : SampleViewState()
}
