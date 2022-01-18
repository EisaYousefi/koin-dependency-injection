package ir.eisa.koincource.di


import ir.eisa.koincource.demo.singleton.SingletonClass
import org.koin.dsl.module

val singletonModule = module {
    single { SingletonClass() }
}