package com.example.view
import com.example.Styles
import javafx.geometry.Pos
import tornadofx.*

class Settings : View("Settings") {
    override val root = borderpane {
        top = hbox {
            alignment = Pos.CENTER
            button {
                addClass(Styles.mainButton)
                alignment = Pos.TOP_CENTER
                text = "Delete User"
            }
        }
        bottom = button {
            addClass(Styles.exitButton)
            alignment = Pos.BOTTOM_LEFT
            text = "Back"
        }
    }
}