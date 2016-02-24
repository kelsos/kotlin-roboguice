package net.kelsos.kotlinroboguice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.inject.Inject
import roboguice.RoboGuice

class MainActivity : AppCompatActivity() {

    @Inject private lateinit var someInterface:SomeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val injector = RoboGuice.getOrCreateBaseApplicationInjector(application)
        injector.injectMembers(this)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        someInterface.myMethod(this)
    }
}
