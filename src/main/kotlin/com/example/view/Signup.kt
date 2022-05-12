package com.example.view

import com.example.Styles
import javafx.beans.InvalidationListener
import javafx.beans.property.SimpleStringProperty
import javafx.scene.Parent
import tornadofx.*
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.web.PromptData

@Suppress("RedundantIf")
class Signup : View("Register") {
    private var username = SimpleStringProperty()
    private var email = SimpleStringProperty()
    private var password = SimpleStringProperty()
    private var passwordVerify = SimpleStringProperty("")
    override var root = borderpane {
        center = form {
            fieldset {
                hbox(alignment=Pos.CENTER) {
                    fieldset("Sign Up") {
                        addClass(Styles.headingMain)
                        textfield(username) {
                            addClass(Styles.searchLabel)
                            promptText = "Username"
                        }
                        textfield(email) {
                            addClass(Styles.searchLabel)
                            promptText = "Email (example@test.com)"
                        }
                        passwordfield(password) {
                            addClass(Styles.searchLabel)
                            promptText = "Password"
                        }
                        passwordfield(passwordVerify) {
                            addClass(Styles.searchLabel)
                            promptText = "Verify Password"
                            action {
                                if(passwordVerify != password) {
                                    this@passwordfield.styleClass.add("Error")

                                }
                                else {
                                    this@passwordfield.styleClass.remove("Error")
                                }
                            }
                        }
                        label("Passwords do not match.") {
                            isVisible = false
                            runAsync {
                                while(true) {
                                    isVisible = ((passwordVerify.value != "") && (password.value != passwordVerify.value))
                                }
                            }
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