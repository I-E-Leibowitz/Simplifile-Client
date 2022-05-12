package com.example

import javafx.geometry.HPos
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val headingFavourite by cssclass()
        val headingMain by cssclass()
        val sectionHeading by cssclass()
        val searchLabel by cssclass()
        val sideButton by cssclass()
        val mainButton by cssclass()
        val secondaryButton by cssclass()
        val exitButton by cssclass()
        val darkerButton by cssclass()
    }

    init {
        label and headingFavourite {
            textAlignment = TextAlignment.CENTER
            alignment = Pos.CENTER
            fontFamily = "Source Sans Variable"
            fontSize = 100.px
            fontWeight = FontWeight.BOLD
        }

        label and headingMain {
            fontFamily = "Source Sans Variable"
            fontSize = 56.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        label and sectionHeading {
            fontFamily = "Source Sans Variable"
            fontSize = 43.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        textInput and searchLabel {
            fontFamily = "Source Sans Variable"
            fontSize = 31.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        button and sideButton {
            fontFamily = "Source Sans Variable"
            fontSize = 46.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        button and mainButton {
            fontFamily = "Source Sans Variable"
            fontSize =  121.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        button and secondaryButton {
            fontFamily = "Source Sans Variable"
            fontSize = 80.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        button and exitButton {
            fontFamily = "Source Sans Variable"
            fontSize = 58.px
            fontWeight = FontWeight.SEMI_BOLD
        }

        button and darkerButton {
            backgroundColor += Color.TRANSPARENT
        }
    }
}