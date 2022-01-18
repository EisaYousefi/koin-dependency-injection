package ir.eisa.koincource.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ir.eisa.koincource.data.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM user")
    fun getAllUser():Flow<List<User>>
}