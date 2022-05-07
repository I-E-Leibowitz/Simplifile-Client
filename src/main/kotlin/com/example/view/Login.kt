package com.example.view

import com.example.Styles
import javafx.beans.InvalidationListener
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import tornadofx.*

class Login : View("Login") {
    override val root = borderpane {
        center = form {
            val usrId = SimpleStringProperty()
            val password = SimpleStringProperty()
            hbox(alignment=Pos.CENTER) {
                fieldset("Login") {
                    addClass(Styles.headingMain)
                    textfield(usrId) {
                        val usrLabel = label("Username/Email")
                        this@textfield.textProperty().addListener(
                            InvalidationListener {
                                usrLabel.setText("")
                            }
                        )
                    }
                    passwordfield(password) {
                        val passwdLabel = label("Password")
                        this@passwordfield.textProperty().addListener(
                            InvalidationListener {
                                passwdLabel.setText("")
                            }
                        )
                    }
                    button("Log in") {
                        addClass(Styles.secondaryButton)
                        action {
                            println("LOGIN")
                        }
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