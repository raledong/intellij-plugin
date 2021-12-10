package com.github.raledong.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.raledong.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
