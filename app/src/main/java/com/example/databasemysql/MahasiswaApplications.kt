package com.example.databasemysql

import android.app.Application
import com.example.databasemysql.dependenciesinjection.AppContainer
import com.example.databasemysql.dependenciesinjection.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container= MahasiswaContainer()
    }
}