package no.tornadofx.fxsamples.tableviews

import javafx.application.Application
import tornadofx.App

class TableViewApp : App() {
    override val primaryView = WorkBench::class
}

fun main(args: Array<String>) {
    Application.launch(TableViewApp::class.java, *args)
}