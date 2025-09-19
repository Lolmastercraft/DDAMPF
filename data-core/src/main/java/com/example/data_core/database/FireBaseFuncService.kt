package com.example.data_core.database

import com.google.firebase.firestore.FirebaseFirestore

class FireBaseFuncService (
    private val firebase : FirebaseFirestore = FirebaseFirestore.getInstance()
){
    private val collection = firebase.collection("beers")

}