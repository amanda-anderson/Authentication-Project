package com.example.authentication_project

import android.app.Application


class SharedResources : Application() {
    var name: String? = null
    var email: String? = null
    var pinCodeMaster = mutableListOf("0");

}