package com.example

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*
import javax.json.JsonObject

class JsonDataClass : JsonModel {
    val idProperty = SimpleIntegerProperty()
    var id by idProperty

    var fileProperty = SimpleStringProperty()
    var file by fileProperty

    override fun updateModel(json: JsonObject) {
        with(json) {
            id = int("id")!!
            file = string("file")
        }
    }

    override fun toJSON(json: JsonBuilder) {
        with(json) {
            add("id", id)
            add("file", file)
        }
    }
}