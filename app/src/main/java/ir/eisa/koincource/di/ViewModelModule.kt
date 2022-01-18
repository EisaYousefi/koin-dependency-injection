package ir.eisa.koincource.di


import ir.eisa.koincource.demo.`interface`.Demo
import ir.eisa.koincource.demo.`interface`.DemoImpl
import ir.eisa.koincource.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    single<Demo>{ DemoImpl() }
    viewModel { MainViewModel(get(),get()) }
}