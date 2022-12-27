package com.pcs.apptoko.response.produk

data class ProdukResponsePost(
    val `data`:DataProduk,
    val messsage:String,
    val success:Boolean
)
data class DataProduk(
    val `produk`:Produk
)