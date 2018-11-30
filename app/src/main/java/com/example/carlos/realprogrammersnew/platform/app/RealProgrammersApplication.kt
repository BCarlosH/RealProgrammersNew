package com.example.carlos.realprogrammersnew.platform.app

import android.app.Application
import com.example.carlos.realprogrammersnew.domain.EntityGateway
import com.example.carlos.realprogrammersnew.platform.ServiceLocator
import com.example.carlos.realprogrammersnew.platform.dependencyinjection.*
import javax.inject.Inject
import javax.inject.Provider

class RealProgrammersApplication : Application(), ServiceLocator {


    @Inject
    lateinit var entityGateway: EntityGateway

    @Inject
    lateinit var programmerDetailComponentProvider: Provider<ProgrammerDetailComponent.Builder>


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.builder().build()
    }

    override fun provideProgrammerListComponentBuilder(): ProgrammerListComponent.Builder {
        return appComponent.programmersListComponentBuilder()
    }

    override fun provideProgrammerEditComponentBuilder(): ProgrammerEditComponent.Builder {
        return appComponent.programmerEditComponentBuilder()
    }

    override fun provideProgrammerDetailComponentBuilder(): ProgrammerDetailComponent.Builder {
        return appComponent.programmerDetailComponentBuilder()
    }


    companion object {
        lateinit var appComponent: ApplicationComponent
    }

}
