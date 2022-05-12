package com.example.view

import com.example.Styles
import javafx.geometry.Pos
import tornadofx.*

class SignoutPrompt : View("Are you sure you want to sign out?"){
    override var root = vbox(alignment= Pos.CENTER) {
        label("Are you sure you want to sign out?") {
            addClass(Styles.headingMain)
        }
        hbox(alignment=Pos.CENTER) {
            button("Yes") {
                // parent.replaceWith(MainView::class)
            }
        }
    }
}