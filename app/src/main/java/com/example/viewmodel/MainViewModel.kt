package com.example.viewmodel

import androidx.lifecycle.ViewModel
import com.example.model.MainNavigationTab
import com.example.model.QuoteFormState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MainViewModel : ViewModel() {

    private val _currentTab = MutableStateFlow(MainNavigationTab.HOME)
    val currentTab: StateFlow<MainNavigationTab> = _currentTab.asStateFlow()

    private val _quoteForm = MutableStateFlow(QuoteFormState())
    val quoteForm: StateFlow<QuoteFormState> = _quoteForm.asStateFlow()

    fun navigateTo(tab: MainNavigationTab) {
        _currentTab.value = tab
    }

    fun openQuoteFor(serviceOrCourseTitle: String) {
        _quoteForm.update {
            it.copy(specificInterest = serviceOrCourseTitle)
        }
        _currentTab.value = MainNavigationTab.ENROLLMENT
    }

    fun updateForm(transform: (QuoteFormState) -> QuoteFormState) {
        _quoteForm.update(transform)
    }

    fun buildWhatsAppMessage(form: QuoteFormState): String {
        return buildString {
            append("⭐ *SOLICITAÇÃO DE ORÇAMENTO - GSG SOLUÇÕES*\n\n")
            append("👤 *Nome:* ${form.name.ifBlank { "Não informado" }}\n")
            append("📞 *Telefone:* ${form.phone.ifBlank { "Não informado" }}\n")
            if (form.entityName.isNotBlank()) {
                append("🏢 *Empresa / Particular:* ${form.entityName}\n")
            }
            append("🎯 *Interesse:* ${form.specificInterest}\n")
            if (form.notes.isNotBlank()) {
                append("📝 *Mensagem:* ${form.notes}\n")
            }
        }
    }
}
