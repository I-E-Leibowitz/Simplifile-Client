package com.example
import com.example.view.MainView
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class, Styles::class) {
    override fun start(stage: Stage) {
        with(stage) {
            width = 1280.0
            height = 720.0

        }
        super.start(stage)
    }
}