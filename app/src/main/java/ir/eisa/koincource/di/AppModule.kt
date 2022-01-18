package ir.eisa.koincource.di

import ir.eisa.koincource.demo.`interface`.Main
import ir.eisa.koincource.demo.car.Car
import ir.eisa.koincource.demo.car.Engine
import ir.eisa.koincource.demo.car.Wheel
import org.koin.dsl.module
import org.koin.dsl.factory

var appModule = module {
    factory<Engine>()
    factory<Wheel>()
    factory { Car(get(),get()) }
}

val interfaceModule = module {
    factory { Main(get()) }
}
