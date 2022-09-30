package com.example.parkingmain

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*


class ParkingMain {
    val httpClient = Platform().httpClient()
    suspend fun getHtml(): String {
        // val res = RestApiCalls.getHtml()
        val response: HttpResponse = httpClient.get("https://fakestoreapi.com/products")
        return response.bodyAsText()
    }

}