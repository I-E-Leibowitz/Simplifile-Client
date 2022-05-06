package com.example.view

import com.example.Styles
import javafx.scene.Parent
import tornadofx.*
import javafx.geometry.Pos

class Signup : View("Register") {
    override val root = borderpane {
        center = form {
            fieldset {
                hbox(alignment=Pos.CENTER) {
                    label("Test") {
                        addClass(Styles.headingMain)
                    }
                }
            }
        }

        bottom = button("Back") {
            addClass(Styles.exitButton)
            action {
                println("BACK")
                this@Signup.replaceWith(MainView::class)
            }
        }

    }

}