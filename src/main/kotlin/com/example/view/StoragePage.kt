package com.example.view

import com.example.MyApp
import javafx.geometry.Pos
import javafx.geometry.Side
import javafx.scene.image.Image
import javafx.scene.layout.BackgroundImage
import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import javafx.scene.layout.BackgroundSize
import javafx.stage.FileChooser
import tornadofx.*
import com.example.NewFileEvent
import com.example.NewFileLoaded
import com.example.Styles
import javafx.scene.control.Button
import javafx.scene.paint.Color

class StoragePage : View("Storage") {
    private var position = 0
    private var files: MutableList<Button> = mutableListOf()
    private val newButton = button {
        alignment = Pos.TOP_CENTER
        addClass(Styles.darkerButton)
        graphic = imageview("file:./src/main/Simplifile-Assets/storage-screen/buttons-png/file-icon.png")
        action {
            this@button.removeFromParent()
        }
    }
    private val backgroundImage = BackgroundImage (
        Image("file:./src/main/Simplifile-Assets/storage-screen/background.png"),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
        BackgroundPosition(Side.LEFT, 0.0 , true, Side.BOTTOM, 0.0, true),
        BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true)
        )
    override val root = borderpane {

        top = vbox(alignment=Pos.TOP_CENTER) {
            button {
                addClass(Styles.darkerButton)
                graphic = imageview("file:./src/main/Simplifile-Assets/storage-screen/buttons-png/upload.png")
                action {
                    println("UPLOAD")
                    val file = FileChooser()
                    val selectedFile = file.showOpenDialog(currentStage)
                    println(selectedFile)
                    fire(NewFileEvent(selectedFile.path))
                }
            }
            hbox (alignment=Pos.TOP_RIGHT) {
                stackpane {
                    imageview("file:./src/main/Simplifile-Assets/storage-screen/buttons-png/search-bar.png")
                    label("find a file")

                }
            }
        }
        left = vbox {
            vbox(alignment=Pos.CENTER_LEFT) {
                button {
                    addClass(Styles.darkerButton)
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/menu.png")
                    action {
                        println("MENU")
                    }
                }
                button {
                    addClass(Styles.darkerButton)
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/favourites.png")
                    action {
                        println("FAVS")
                    }
                }
                button {
                    addClass(Styles.darkerButton)
                    graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/settings.png")
                    action {
                        println("SETS")
                    }
                }
            }
            button {
                addClass(Styles.darkerButton)
                this@vbox.alignment = Pos.BOTTOM_LEFT
                graphic = imageview("file:./src/main/Simplifile-Assets/general-assets/buttons-png/back.png")
                action {
                    println("test")
                    openInternalWindow(SignoutPrompt::class)
                    // TODO: Implement popup prompt to make sure the user wants to log out.
                }
            }
        }

        center = scrollpane {
            gridpane {
                subscribe<NewFileEvent> { event ->
                    newButton.text = event.file
                    files.add(newButton)
                    this@gridpane.add(newButton, position, (position/5).toInt())
                    position += 1
                }
            }
        }
    }
}