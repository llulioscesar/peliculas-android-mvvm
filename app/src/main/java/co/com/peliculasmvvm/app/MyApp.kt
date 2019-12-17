package co.com.peliculasmvvm.app

import android.app.Application
import android.content.Context

class MyApp : Application() {

    companion object {
        private lateinit var instancia : MyApp

        fun obtenerInstancia() : MyApp { return instancia
        }

        fun obtenerContexto() : Context { return instancia
        }

    }

    override fun onCreate() {
        instancia = this
        super.onCreate()
    }
}