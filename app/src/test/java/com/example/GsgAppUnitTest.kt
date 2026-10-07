package com.example

import com.example.data.GsgData
import com.example.model.QuoteFormState
import com.example.viewmodel.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class GsgAppUnitTest {

    @Test
    fun testFoundersCountAndNames() {
        assertEquals(3, GsgData.founders.size)
        val names = GsgData.founders.map { it.name }
        assertTrue(names.contains("Geraldo Júlio"))
        assertTrue(names.contains("Guardino António Simão"))
        assertTrue(names.contains("Sebastião Manuel Mudomba"))
    }

    @Test
    fun testRequiredCoursesExist() {
        val courseIds = GsgData.courses.map { it.id }
        assertTrue(courseIds.contains("atendimento"))
        assertTrue(courseIds.contains("sst"))
        assertTrue(courseIds.contains("hierarquia"))
        assertTrue(courseIds.contains("legislacao"))
        assertTrue(courseIds.contains("informatica"))
        assertTrue(courseIds.contains("caixa_comercial"))
    }

    @Test
    fun testContactsInfo() {
        assertEquals("942 063 073", GsgData.contacts.phone1)
        assertEquals("924 416 829", GsgData.contacts.phone2)
        assertEquals("gsgsoluções&capacitação@gmail.com", GsgData.contacts.email)
    }

    @Test
    fun testWhatsAppMessageBuilder() {
        val viewModel = MainViewModel()
        val form = QuoteFormState(
            name = "Eng. Bento Paulo",
            entityName = "Sonangol Distribuição",
            phone = "942063073",
            specificInterest = "Atendimento ao Público e ao Cliente"
        )
        val message = viewModel.buildWhatsAppMessage(form)
        assertTrue(message.contains("Eng. Bento Paulo"))
        assertTrue(message.contains("Sonangol Distribuição"))
        assertTrue(message.contains("Atendimento ao Público e ao Cliente"))
    }
}
