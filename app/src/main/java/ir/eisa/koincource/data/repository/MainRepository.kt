package ir.eisa.koincource.data.repository

import ir.eisa.koincource.data.dao.UserDao
import ir.eisa.koincource.data.model.Post
import ir.eisa.koincource.data.model.User
import ir.eisa.koincource.retrofit.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class MainRepository constructor(
    private val apiService: ApiService,
    private val userDao: UserDao
) {
    fun getPost():Flow<List<Post>> = flow {
        emit(apiService.getPost())
    }.flowOn(Dispatchers.IO)

    suspend fun insert(user: User)= withContext(Dispatchers.IO){
        userDao.insert(user);
    }

    val getAllUser=userDao.getAllUser()
}