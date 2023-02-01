package com.example.shoppinglist

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "shopping-items")
data class ShoppingItem(
    @ColumnInfo(name = "item_name")
    var name : String,
    @ColumnInfo(name = "item_amount")
    var amount : Int
) {
    var id : Int?  = null
}