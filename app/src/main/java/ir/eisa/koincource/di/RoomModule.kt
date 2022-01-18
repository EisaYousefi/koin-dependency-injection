package ir.eisa.koincource.di

import android.app.Application
import androidx.room.Room
import ir.eisa.koincource.data.dao.UserDao
import ir.eisa.koincource.data.database.UserDatabase
import org.koin.dsl.module


fun providesDatabase(application: Application): UserDatabase =
    Room.databaseBuilder(application,UserDatabase::class.java,"userdatabase")
        .build()

fun providesDao(db:UserDatabase): UserDao = db.getUserDao()

val roomModule = module {

    single { providesDatabase(get()) }
    single { providesDao(get()) }
}