package com.nl5a.ejercicio2.Fragments.Entities

import android.os.Parcel
import android.os.Parcelable

class Product (Nombre : String, Precio : Double, Descripción : String) : Parcelable{

    var nombre : String
    var precio : Double
    var desc : String

    init {
        this.nombre = Nombre
        this.precio = Precio
        this.desc = Descripción
    }
    override fun toString(): String {
        return "Mascota(nombre='$nombre', precio='$precio', descripcion='$desc')"
    }
    constructor(source: Parcel) : this(
            source.readString()!!,
            source.readDouble()!!,
            source.readString()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(nombre)
        writeDouble(precio)
        writeString(desc)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Product> = object : Parcelable.Creator<Product> {
            override fun createFromParcel(source: Parcel): Product = Product(source)
            override fun newArray(size: Int): Array<Product?> = arrayOfNulls(size)
        }

    }

}