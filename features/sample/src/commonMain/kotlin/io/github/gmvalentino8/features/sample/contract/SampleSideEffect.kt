package io.github.gmvalentino8.features.sample.contract

import io.github.gmvalentino8.cyklone.statemachine.contract.SideEffect

sealed class SampleSideEffect : SideEffect {
    object LoadUsers : SampleSideEffect()
}
