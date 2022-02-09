package io.github.gmvalentino8.features.sample.components

import io.github.gmvalentino8.cyklone.contract.State
import io.github.gmvalentino8.cyklone.statemachine.components.StateMachineProcessor
import io.github.gmvalentino8.domain.core.DomainResult
import io.github.gmvalentino8.domain.usecases.GetUsersUseCase
import io.github.gmvalentino8.features.sample.contract.SampleAction
import io.github.gmvalentino8.features.sample.contract.SampleEvent
import io.github.gmvalentino8.features.sample.contract.SampleIntent
import io.github.gmvalentino8.features.sample.contract.SampleResult
import io.github.gmvalentino8.features.sample.contract.SampleSideEffect
import io.github.gmvalentino8.features.sample.contract.SampleViewState

class SampleStateMachineProcessor(
    stateMachine: SampleStateMachine,
    private val getUsersUseCase: GetUsersUseCase
) : StateMachineProcessor<SampleIntent, SampleAction, SampleResult, SampleViewState, SampleEvent, SampleSideEffect>(stateMachine) {
    override suspend fun process(sideEffect: SampleSideEffect, state: State<SampleViewState, SampleEvent>): SampleResult? = when (sideEffect) {
        is SampleSideEffect.LoadUsers -> {
            when (val result = getUsersUseCase.execute(Unit)) {
                is DomainResult.Success -> SampleResult.GetUsersSuccess(result.data)
                is DomainResult.Failure -> SampleResult.GetUsersError(result.error)
            }
        }
    }
}
