rootProject.name = "MtItem"

include(
    "api",
    "base",
    "builtIn:itemsadder",
    "builtIn:hdb",
    "builtIn:minecraft",
    "commands",
)
pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://nexus.spliterash.ru/repository/gradle-plugin/")
        }
    }
}