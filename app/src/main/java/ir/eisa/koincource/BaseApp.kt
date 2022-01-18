package ir.eisa.koincource

import android.app.Application
import com.codingwithjks.koindi.scopes.scopeModule
import ir.eisa.koincource.di.*
import ir.eisa.koincource.qualifier.usersModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                appModule, interfaceModule, singletonModule, viewModelModule, retrofitModule,
                roomModule, bindsModule, usersModule, scopeModule
            )
            androidContext(this@BaseApp)
        }
    }
}
