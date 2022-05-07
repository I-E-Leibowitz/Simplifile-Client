package com.example.view

import com.example.Styles
import javafx.beans.InvalidationListener
import javafx.beans.property.SimpleStringProperty
import javafx.scene.Parent
import tornadofx.*
import javafx.geometry.Pos

class Signup : View("Register") {
    private var username = SimpleStringProperty()
    private var email = SimpleStringProperty()
    private var password = SimpleStringProperty()
    private var passwordVerify = SimpleStringProperty()
    override var root = borderpane {
        center = form {
            fieldset {
                hbox(alignment=Pos.CENTER) {
                    fieldset("Sign Up") {
                        addClass(Styles.headingMain)
                        textfield(username) {
                            val assistLabel = label("username")
                            this@textfield.textProperty().addListener(
                                InvalidationListener {
                                    assistLabel.setText("")
                                }
                            )
                        }
                        textfield(email) {
                            val assistLabel = label("email")
                            this@textfield.textProperty().addListener(
                                InvalidationListener {
                                    assistLabel.setText("")
                                }
                            )
                        }
                        passwordfield(password) {
                            val assistLabel = label("password")
                            this@passwordfield.textProperty().addListener(
                                InvalidationListener {
                                    assistLabel.setText("")
                                }
                            )
                        }
                        passwordfield(passwordVerify) {
                            val assistLabel = label("verify password")
                            this@passwordfield.textProperty().addListener(
                                InvalidationListener {
                                    assistLabel.setText("")
                                }
                            )
                        }
                    }
                }
            }
        }

        bottom = button("Back") {
            addClass(Styles.exitButton)
            action {
                println("BACK")
                username.value = ""
                email.value = ""
                password.value = ""
                passwordVerify.value = ""
                this@Signup.replaceWith(MainView::class)
            }
        }

    }

}