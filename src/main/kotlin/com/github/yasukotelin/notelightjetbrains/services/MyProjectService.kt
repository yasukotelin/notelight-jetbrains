package com.github.yasukotelin.notelightjetbrains.services

import com.intellij.openapi.project.Project
import com.github.yasukotelin.notelightjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
