package com.example.mscustomer.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class TokenDto {
    @JsonProperty("access-token")
    val accessToken:String,
    @JsonProperty("access-token")
    val accessToken:String,
}