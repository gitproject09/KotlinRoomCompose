package com.supan.roomjetpackcompose.presentation.books.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import com.supan.roomjetpackcompose.core.Constants.Companion.DELETE_BOOK

@Composable
fun DeleteBookIcon(
    deleteBook: () -> Unit
) {
    IconButton(
        onClick = deleteBook
    ) {
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = DELETE_BOOK,
        )
    }
}