import org.gradle.api.artifacts.dsl.DependencyHandler

object Extension {
    fun DependencyHandler.kaptList(list: List<String>) {
        list.forEach { dependency ->
            add("kapt", dependency)
        }
    }

    fun DependencyHandler.implementation(name: Any) {
        add("implementation", name)
    }

    fun DependencyHandler.implementationList(list: List<String>) {
        list.forEach { dependency ->
            add("implementation", dependency)
        }
    }

    fun DependencyHandler.androidTestImplementationList(list: List<String>) {
        list.forEach { dependency ->
            add("androidTestImplementation", dependency)
        }
    }

    fun DependencyHandler.testImplementationList(list: List<String>) {
        list.forEach { dependency ->
            add("testImplementation", dependency)
        }
    }

    fun DependencyHandler.ksp(dependency: Any) {
        add("ksp", dependency)
    }

    fun DependencyHandler.anotationProcessor(dependency: Any) {
        add("annotationProcessor", dependency)
    }

}
