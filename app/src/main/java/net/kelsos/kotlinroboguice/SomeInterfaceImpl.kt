package net.kelsos.kotlinroboguice

import android.content.Context
import android.widget.Toast

class SomeInterfaceImpl : SomeInterface{
    override fun myMethod(context: Context?) {
        Toast.makeText(context, "Some toast", Toast.LENGTH_SHORT).show()
    }
}