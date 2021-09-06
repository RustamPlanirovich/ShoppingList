package com.example.shoppinglist.domain

//Дата класс для разбивания листа по составляющим списка
data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)
