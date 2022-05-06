package com.example.view

import com.example.Styles
import javafx.beans.InvalidationListener
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.Parent
import tornadofx.*

class Login : View("Login") {
    override val root = borderpane {
        center = form {
            val input = SimpleStringProperty()
            val password = SimpleStringProperty()
            hbox(alignment=Pos.CENTER) {
                fieldset("Login") {
                    addClass(Styles.headingMain)
                    textfield(input) {
                        val usrLabel = label("Username/Email")
                        this@textfield.textProperty().addListener(
                            InvalidationListener {
                                usrLabel.setText("")
                            }
                        )
                    }
                    passwordfield {
                        val passwdLabel = label("Password")
                        this@passwordfield.textProperty().addListener(
                            InvalidationListener {
                                passwdLabel.setText("")
                            }
                        )
                    }
                }
            }
        }
        bottom = button("Back") {
            addClass(Styles.exitButton)
            action {
                this@Login.replaceWith(MainView::class)
            }
        }
    }
}