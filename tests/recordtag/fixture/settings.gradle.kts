pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement { repositories { google(); mavenCentral() } }
rootProject.name = if (providers.gradleProperty("monoDex").isPresent)
    "RecordTagFixture-EXPECTED-TO-FAIL"
else
    "RecordTagFixture"
