package com.practice.assignment.api

import io.ktor.client.statement.HttpResponse

interface GetData {

    suspend fun GetDataFromApi(): HttpResponse
}