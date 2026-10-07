package com.example.model

enum class MainNavigationTab(val label: String) {
    HOME("Início"),
    ABOUT("Sobre"),
    COURSES("Cursos"),
    SERVICES("Serviços"),
    ENROLLMENT("Orçamento"),
    CONTACT("Contactos")
}

data class QuoteFormState(
    val name: String = "",
    val phone: String = "",
    val entityName: String = "",
    val specificInterest: String = "Atendimento ao Público e ao Cliente",
    val notes: String = ""
)
