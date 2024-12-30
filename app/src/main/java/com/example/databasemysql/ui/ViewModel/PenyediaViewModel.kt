package com.example.databasemysql.ui.ViewModel

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.databasemysql.MahasiswaApplications

object PenyediaViewModel {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(MahasiswaApplication().container.mahasiswaRepository)
        }
        initializer {
            InsertViewModel(MahasiswaApplication().container.mahasiswaRepository)
        }
        initializer {
            DetailViewModel(
                createSavedStateHandle(),
                MahasiswaApplication().container.mahasiswaRepository
            )
        }
        initializer {
            UpdateViewModel(
                createSavedStateHandle(),
                MahasiswaApplication().container.mahasiswaRepository
            )
        }
    }
}

fun CreationExtras.MahasiswaApplication() : MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)