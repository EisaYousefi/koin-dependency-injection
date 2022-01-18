package ir.eisa.koincource.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.eisa.koincource.data.dao.UserDao
import ir.eisa.koincource.data.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

}