package ru.hollowhorizon.kotlinscript.common.scripting.kotlin

@Target(AnnotationTarget.FILE)
@Repeatable
@Retention(AnnotationRetention.SOURCE)
annotation class Import(vararg val paths: String)