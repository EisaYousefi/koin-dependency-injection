package ir.eisa.koincource.qualifier

import android.util.Log
import org.koin.core.qualifier.named
import org.koin.dsl.module

class Users(val fName:String , val lName:String) {

    fun getUser() {
        Log.d("qualifier", "getUser: $fName $lName")
    }

}

fun provideFName():String = "Eisa"
fun provideLName():String = "yousefi"


val usersModule = module {

    factory(named("fName")){
        provideFName()
    }

    factory(named("lName")) {
        provideLName()
    }

    factory { Users(get(named("fName")),get(named("lName"))) }

}