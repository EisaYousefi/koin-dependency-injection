package com.codingwithjks.koindi.scopes

import android.util.Log
import ir.eisa.koincource.AnotherActivity
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.module
import org.koin.dsl.scoped

class ComponentA(){
    fun getA()
    {
        Log.d("main", "getA -->test scope in koin ")
    }
}

@KoinReflectAPI
val scopeModule = module {
    scope<AnotherActivity>{
        scoped<ComponentA>()
    }
}