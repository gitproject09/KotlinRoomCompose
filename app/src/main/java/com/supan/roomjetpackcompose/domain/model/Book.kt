package com.supan.roomjetpackcompose.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.supan.roomjetpackcompose.core.Constants.Companion.BOOK_TABLE

@Entity(tableName = BOOK_TABLE)
data class Book(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val author: String
)