@file:Suppress("unused")

package net.kelsos.kotlinroboguice

import com.google.inject.AbstractModule

class ExampleModule : AbstractModule() {
    override fun configure() {
        bind(SomeInterface::class.java).to(SomeInterfaceImpl::class.java)
    }
}
