package com.example.shoppinglist.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shop_list_item")
data class ShoppingListItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "time")
    val name: String,

    @ColumnInfo(name = "itemInfo")
    val itemInfo: Int?,
    @ColumnInfo(name = "itemChecked")
    val itemChecked: Int=0,
    @ColumnInfo(name = "listId")
    val listId: Int,
    @ColumnInfo(name = "itemType")
    val itemType: String="item",
)
