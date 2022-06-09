package com.example.view
import com.example.Styles
import javafx.geometry.Pos
import tornadofx.*

class Favourites : View("Favourites") {
    override val root = borderpane {
        top = label("Favourite Files") {
            addClass(Styles.sectionHeading)
            alignment = Pos.TOP_CENTER
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
                    this@Favourites.replaceWith(StoragePage::class)
                }
            }
        }

        center = scrollpane {
            gridpane {
                row{
                    button("startingpoint_luciferin.ovpn") {
                        alignment = Pos.TOP_CENTER
                        addClass(Styles.darkerButton)
                        graphic = imageview("file:./src/main/Simplifile-Assets/storage-screen/buttons-png/file-icon.png")
                        action {
                            this@button.removeFromParent()
                        }
                    }
                }
            }
        }

    }
}