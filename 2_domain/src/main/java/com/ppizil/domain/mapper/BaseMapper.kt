package com.ppizil.domain.mapper

interface BaseMapper<D, E> {

    fun inToOut(inValue: D): E
    fun outToIN(outValue: E): D
}