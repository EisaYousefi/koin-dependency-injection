package ir.eisa.koincource.di


import ir.eisa.koincource.demo.`interface`.MainUser
import ir.eisa.koincource.demo.`interface`.UserImpl
import ir.eisa.koincource.demo.`interface`.UserOne
import ir.eisa.koincource.demo.`interface`.UserTwo
import org.koin.dsl.binds
import org.koin.dsl.module

val bindsModule = module {

    factory { UserImpl() } binds arrayOf(UserOne::class, UserTwo::class)
    factory { MainUser(get(),get()) }
    //factory<UserOne>{ UserImpl() }
   // factory { UserImpl() as UserOne }
}