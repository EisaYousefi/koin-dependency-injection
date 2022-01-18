package ir.eisa.koincource.di


import ir.eisa.koincource.data.repository.MainRepository
import ir.eisa.koincource.retrofit.providesApiService
import ir.eisa.koincource.retrofit.providesMoshi
import ir.eisa.koincource.retrofit.providesRetrofitBuilder
import org.koin.dsl.module

val retrofitModule = module {
    single { providesMoshi() }
    single { providesRetrofitBuilder(get()) }
    single { providesApiService(get()) }
    factory { MainRepository(get(),get()) }

}