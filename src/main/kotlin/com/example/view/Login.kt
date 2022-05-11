package com.example.view

import com.example.Styles
import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.image.Image
import tornadofx.*
import javax.xml.bind.Marshaller.Listener

class Login : View("Login") {
    private val usrId = SimpleStringProperty()
    private val password = SimpleStringProperty()
    override val root = borderpane {
        paddingAll = 20
        center = form {
            hbox(alignment=Pos.CENTER) {
                fieldset("Login") {
                    addClass(Styles.headingMain)
                    textfield(usrId) {
                        promptText = "Username/Email"
                    }
                    passwordfield(password) {
                        promptText = "Password"
                    }
                }
            }
        }
        left = button("Back") {
            this@button.alignment = Pos.BOTTOM_LEFT
            addClass(Styles.exitButton)
            action {
                this@Login.replaceWith(MainView::class)
            }
        }
        bottom = hbox (alignment = Pos.BOTTOM_CENTER) {
            button {
                alignment = Pos.BOTTOM_CENTER
                this@button.isDefaultButton = true
                run {
                    graphic = imageview("file:./src/main/Simplifile-Assets/login-screen/buttons-png/proceed.png", lazyload = false)
                }
                action {
                    println("USR_LOG_S")
                    this@Login.replaceWith(StoragePage::class)
                }
            }
        }

    }
}