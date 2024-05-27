package com.example.shoppinglist.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="shopping_list_names")
data class ShoppingListNames (
    @PrimaryKey(autoGenerate = true)
    val id:Int?,

)