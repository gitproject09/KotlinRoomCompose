package com.supan.roomjetpackcompose.presentation.books

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import com.supan.roomjetpackcompose.domain.model.Book
import com.supan.roomjetpackcompose.domain.repository.BookRepository
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(
    private val repo: BookRepository
) : ViewModel() {
    val books = repo.getBooks()

    fun addBook(book: Book) = viewModelScope.launch {
        repo.insertBook(
            book = book
        )
    }

    fun deleteBook(book: Book) = viewModelScope.launch {
        repo.deleteBook(
            book = book
        )
    }
}