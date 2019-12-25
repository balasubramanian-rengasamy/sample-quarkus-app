import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm").version("1.3.61")
    id("org.jetbrains.kotlin.plugin.allopen") version "1.3.61"

    java
    id("io.quarkus") version "1.1.0.Final"
}

allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("sample.quarkus.app.MyAnnotation")
}

repositories {
    mavenCentral()

    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation(enforcedPlatform("io.quarkus:quarkus-bom:1.1.0.Final"))
    implementation("io.quarkus:quarkus-resteasy")

    implementation("io.quarkus:quarkus-resteasy-jsonb")

    implementation("io.quarkus:quarkus-kotlin")


    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

//    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    testImplementation("io.quarkus:quarkus-junit5")
    testImplementation("io.rest-assured:rest-assured:3.1.0")
}

quarkus {
    setSourceDir(project.projectDir.resolve("src/main/kotlin").absolutePath)
    setOutputDirectory(project.projectDir.resolve("build/classes/kotlin/main").absolutePath)
}

kotlin.sourceSets["test"].kotlin.srcDirs("test")
