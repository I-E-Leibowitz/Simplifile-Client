package com.example.view

import com.example.MyApp
import javafx.geometry.Pos
import javafx.geometry.Side
import javafx.scene.image.Image
import javafx.scene.layout.BackgroundImage
import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import javafx.scene.layout.BackgroundSize
import javafx.scene.paint.ImagePattern
import javafx.stage.FileChooser
import tornadofx.*

class StoragePage : View("Storage") {
    private val backgroundImage = BackgroundImage (
        Image("file:./src/main/Simplifile-Assets/storage-screen/background.png"),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition(Side.LEFT, 0.0 , true, Side.BOTTOM, 0.0, true),
        BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true)
        )
    override val root = borderpane {
        top = vbox(alignment=Pos.TOP_CENTER) {
            button {
                graphic = imageview("file:./src/main/Simplifile-Assets/storage-screen/buttons-png/upload.png")
                action {
                    println("UPLOAD")
                    val file = FileChooser()
                    val selectedFile = file.showOpenDialog(currentStage)
                    println(selectedFile)
                }
            }
            hbox (alignment=Pos.TOP_RIGHT)
        }
        left = vbox {
            vbox(alignment=Pos.CENTER_LEFT) {
                button {
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/menu.png")
                    action {
                        println("MENU")
                    }
                }
                button {
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/favourites.png")
                    action {
                        println("FAVS")
                    }
                }
                button {
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/settings.png")
                    action {
                        println("SETS")
                    }
                }
            }
            button {
                this@vbox.alignment = Pos.BOTTOM_LEFT
                graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/back.png")
                action {
                    println("test")
                }
            }
        }
    }
}