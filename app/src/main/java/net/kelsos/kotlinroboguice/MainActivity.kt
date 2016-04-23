package net.kelsos.kotlinroboguice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.inject.Inject
import roboguice.RoboGuice

class MainActivity : AppCompatActivity() {

    @Inject private lateinit var someInterface:SomeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RoboGuice.setupBaseApplicationInjector(application)
        val injector = RoboGuice.getInjector(this)
        injector.injectMembers(this)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        someInterface.myMethod(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        RoboGuice.destroyInjector(this)
    }
}
