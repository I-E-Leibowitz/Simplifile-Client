package com.example.view

import com.example.Styles
import javafx.application.Platform
import javafx.geometry.Pos
import javafx.scene.paint.Color
import tornadofx.*

class MainView : View("Simplfile") {
    override fun onDock() {

    }
    override val root = borderpane {
        center = form {
            fieldset {
                vbox(alignment = Pos.CENTER) {
                    label ("Welcome to Simplifile") {
                        addClass(Styles.headingMain)
                    }
                    button("Get Started") {
                        addClass(Styles.mainButton)
                        action {
                            println("USR_REG")
                            this@MainView.replaceWith(Signup::class)
                        }

                    }

                    button("Log in") {
                        addClass(Styles.secondaryButton)
                        this@button.isDefaultButton = true
                        action {
                            println("USR_LOG")
                            this@MainView.replaceWith(Login::class)
                        }
                    }
                }
        bottom = button("Quit") {
                    addClass(Styles.exitButton)
                    action {
                        println("QUIT")
                        Platform.exit()
                    }
                }
            }
        }
    }
}

