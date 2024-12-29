package com.example.databasemysql.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa (
    val nim: String,
    val nama: String,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String,

    val kelas: String,
    val alamat: String,
    val angkatan: String
)
