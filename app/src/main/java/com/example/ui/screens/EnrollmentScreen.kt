package com.example.ui.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Notes
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.GsgData
import com.example.model.QuoteFormState
import com.example.ui.theme.GsgGoldDark
import com.example.ui.theme.GsgWhatsAppGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EnrollmentScreen(
    formState: QuoteFormState,
    onFormChange: ((QuoteFormState) -> QuoteFormState) -> Unit,
    onSendWhatsApp: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    val serviceOptions = listOf(
        "Atendimento ao Público e ao Cliente",
        "Segurança e Higiene no Trabalho (SST)",
        "Relação e Hierarquia no Local de Serviço",
        "Direitos e Deveres dos Trabalhadores (Legislação Laboral)",
        "Informática Prática",
        "Capacitação de Operador de Caixa e Gestão Comercial",
        "Outros Cursos Profissionais",
        "Casamentos e Protocolo",
        "Eventos Corporativos",
        "Consultoria Organizacional"
    )

    var expandedDropdown by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Solicitar Orçamento / Inscrição",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Preencha para enviar os dados diretamente no WhatsApp da GSG.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    OutlinedTextField(
                        value = formState.name,
                        onValueChange = { value -> onFormChange { it.copy(name = value) } },
                        label = { Text("Seu Nome *") },
                        leadingIcon = { Icon(Icons.Default.Person, contentDescription = null, tint = GsgGoldDark) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("form_input_name"),
                        singleLine = true,
                        shape = RoundedCornerShape(10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = formState.phone,
                        onValueChange = { value -> onFormChange { it.copy(phone = value) } },
                        label = { Text("Telefone / WhatsApp *") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        leadingIcon = { Icon(Icons.Default.Phone, contentDescription = null, tint = GsgGoldDark) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("form_input_phone"),
                        singleLine = true,
                        shape = RoundedCornerShape(10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = formState.entityName,
                        onValueChange = { value -> onFormChange { it.copy(entityName = value) } },
                        label = { Text("Empresa ou Particular") },
                        leadingIcon = { Icon(Icons.Default.Business, contentDescription = null, tint = GsgGoldDark) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("form_input_entity"),
                        singleLine = true,
                        shape = RoundedCornerShape(10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    ExposedDropdownMenuBox(
                        expanded = expandedDropdown,
                        onExpandedChange = { expandedDropdown = !expandedDropdown },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = formState.specificInterest,
                            onValueChange = {},
                            readOnly = true,
                            label = { Text("Serviço ou Curso *") },
                            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedDropdown) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .menuAnchor()
                                .testTag("form_dropdown_service"),
                            shape = RoundedCornerShape(10.dp)
                        )

                        ExposedDropdownMenu(
                            expanded = expandedDropdown,
                            onDismissRequest = { expandedDropdown = false }
                        ) {
                            serviceOptions.forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        onFormChange { it.copy(specificInterest = option) }
                                        expandedDropdown = false
                                    }
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = formState.notes,
                        onValueChange = { value -> onFormChange { it.copy(notes = value) } },
                        label = { Text("Mensagem ou Detalhes (Opcional)") },
                        leadingIcon = { Icon(Icons.Default.Notes, contentDescription = null, tint = GsgGoldDark) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(90.dp)
                            .testTag("form_input_notes"),
                        shape = RoundedCornerShape(10.dp)
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = {
                            if (formState.name.isBlank() || formState.phone.isBlank()) {
                                Toast.makeText(context, "Por favor, informe Nome e Telefone.", Toast.LENGTH_SHORT).show()
                            } else {
                                onSendWhatsApp(GsgData.contacts.phone1Formatted)
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = GsgWhatsAppGreen,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .testTag("form_send_btn")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.Send,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Enviar via WhatsApp", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
