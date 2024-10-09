package com.supan.roomjetpackcompose.data.network

import androidx.room.Database
import androidx.room.RoomDatabase
import com.supan.roomjetpackcompose.data.dao.BookDao
import com.supan.roomjetpackcompose.domain.model.Book

@Database(
    entities = [Book::class],
    version = 1,
    exportSchema = false
)
abstract class BookDb : RoomDatabase() {
    abstract val bookDao: BookDao
}