package io.github.gmvalentino8.features.sample.components

import io.github.gmvalentino8.cyklone.statemachine.components.StateMachine
import io.github.gmvalentino8.features.sample.contract.SampleAction
import io.github.gmvalentino8.features.sample.contract.SampleEvent
import io.github.gmvalentino8.features.sample.contract.SampleIntent
import io.github.gmvalentino8.features.sample.contract.SampleResult
import io.github.gmvalentino8.features.sample.contract.SampleSideEffect
import io.github.gmvalentino8.features.sample.contract.SampleViewState

class SampleStateMachine : StateMachine<SampleIntent, SampleAction, SampleResult, SampleViewState, SampleEvent, SampleSideEffect>(
    builder = {
        state<SampleViewState> {
            interpret<SampleIntent.ProcessEvent> { SampleAction.ProcessEvent(it.event) }
            process<SampleAction.ProcessEvent> {
                result { SampleResult.ProcessEvent(it.event) }
            }
        }

        state<SampleViewState.None> {
            interpret<SampleIntent.ClickLoad> { SampleAction.LoadUsers }

            process<SampleAction.LoadUsers> {
                result { SampleResult.Loading }
                sideEffect { SampleSideEffect.LoadUsers }
            }

            reduce<SampleResult.Loading> { SampleViewState.Loading }
        }

        state<SampleViewState.Loading> {
            reduce<SampleResult.GetUsersSuccess> { SampleViewState.Success(it.users) }
            reduce<SampleResult.GetUsersError> { SampleViewState.Failure(it.error) }
        }

        state<SampleViewState.Success> {
            interpret<SampleIntent.ClickUser> { SampleAction.SelectUser(it.user) }

            process<SampleAction.SelectUser> {
                result { SampleResult.SendEvent(SampleEvent.NavigateToDetails(it.user)) }
            }
        }

        state<SampleViewState.Failure> {
            interpret<SampleIntent.ClickRetry> { SampleAction.LoadUsers }

            process<SampleAction.LoadUsers> {
                result { SampleResult.Loading }
                sideEffect { SampleSideEffect.LoadUsers }
            }

            reduce<SampleResult.Loading> { SampleViewState.Loading }
        }
    }
)
