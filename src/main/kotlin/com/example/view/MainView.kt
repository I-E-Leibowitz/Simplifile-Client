package com.example.view

import com.example.Styles
import javafx.application.Platform
import tornadofx.*

class MainView : View("Simplfile") {
    override val root = borderpane {
        center = form {
            fieldset() {
                label ("Welcome to Simplifile") {
                    addClass(Styles.headingMain)
                }
                button("Get Started") {
                    addClass(Styles.mainButton)
                    action {
                        println("USR_REG")
                    }

                }

                button("Log in") {
                    addClass(Styles.secondaryButton)
                    action {
                        println("USR_LOG")
                    }
                }
            }
            bottom = button("Quit") {
                addClass(Styles.exitButton)
                action {
                    Platform.exit()
                }
            }
        }
    }
}

