package com.example.mywishlistapp.data

import android.media.audiofx.AudioEffect.Descriptor
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String ="",
    @ColumnInfo(name="wish-desc")
    val description: String =""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description ="An Android Watch"),
        Wish(title = "A Sci-fi Book", description ="Science Fiction Book"),
        Wish(title = "Bean Bag", description ="Compfy Chair")
    )
}
