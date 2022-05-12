package com.example

import tornadofx.*
import tornadofx.EventBus.RunOn.BackgroundThread
import java.io.File

object NewFileLoaded : FXEvent(BackgroundThread)
class NewFileEvent(val file: String) : FXEvent()
