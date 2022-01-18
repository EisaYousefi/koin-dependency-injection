package ir.eisa.koincource.container


import ir.eisa.koincource.data.repository.MainRepository
import ir.eisa.koincource.demo.`interface`.Demo
import ir.eisa.koincource.demo.`interface`.DemoImpl
import ir.eisa.koincource.demo.`interface`.Main
import ir.eisa.koincource.demo.`interface`.MainUser
import ir.eisa.koincource.demo.car.Car
import ir.eisa.koincource.demo.car.Engine
import ir.eisa.koincource.demo.car.Wheel
import ir.eisa.koincource.demo.singleton.SingletonClass
import ir.eisa.koincource.qualifier.Users
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject


class BaseApplication :KoinComponent {
    // override val scope: Scope  by lazy { newScope(this) }
    /*
    lazily initialisation
     */
    val car: Car by inject()
    val engine: Engine by inject()
    val wheel: Wheel by inject()
    val demoImpl:DemoImpl by inject()
    val main:Main by inject()
    val demo:Demo by inject()
    val mainRepository:MainRepository by inject()
    val mainUser: MainUser by inject()
    val users:Users by inject()
    /*
    eagerly initialisation
     */
    val singletonClass:SingletonClass = get()
}