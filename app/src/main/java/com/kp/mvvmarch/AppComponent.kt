package com.kp.mvvmarch

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,ActivityBuilder::class,AppModule::class,AppViewModelModule::class])
interface AppComponent : AndroidInjector<MyApp> {
    @Component.Builder
    interface Builder{
        @BindsInstance fun bindApplication(mMyApp: MyApp):Builder

        fun build():AppComponent
    }
}