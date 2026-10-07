package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.data.GsgData
import com.example.model.MainNavigationTab
import com.example.ui.components.CorporateNavBar
import com.example.ui.components.CorporateTopBar
import com.example.ui.screens.AboutScreen
import com.example.ui.screens.ContactScreen
import com.example.ui.screens.CoursesScreen
import com.example.ui.screens.EnrollmentScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.ServicesScreen
import com.example.util.dialPhone
import com.example.util.openWhatsApp
import com.example.ui.theme.MyApplicationTheme
import com.example.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                MainAppContent(viewModel = viewModel)
            }
        }
    }
}

@Composable
fun MainAppContent(viewModel: MainViewModel) {
    val context = LocalContext.current
    val currentTab by viewModel.currentTab.collectAsState()
    val quoteFormState by viewModel.quoteForm.collectAsState()

    if (currentTab != MainNavigationTab.HOME) {
        BackHandler {
            viewModel.navigateTo(MainNavigationTab.HOME)
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CorporateTopBar(
                onCallClick = { dialPhone(context, GsgData.contacts.phone1Formatted) }
            )
        },
        bottomBar = {
            CorporateNavBar(
                selectedTab = currentTab,
                onTabSelected = { tab ->
                    viewModel.navigateTo(tab)
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when (currentTab) {
                MainNavigationTab.HOME -> {
                    HomeScreen(
                        onNavigate = { tab -> viewModel.navigateTo(tab) }
                    )
                }

                MainNavigationTab.ABOUT -> {
                    AboutScreen()
                }

                MainNavigationTab.COURSES -> {
                    CoursesScreen(
                        onRequestQuote = { courseTitle ->
                            viewModel.openQuoteFor(courseTitle)
                        }
                    )
                }

                MainNavigationTab.SERVICES -> {
                    ServicesScreen(
                        onRequestQuote = { serviceTitle ->
                            viewModel.openQuoteFor(serviceTitle)
                        }
                    )
                }

                MainNavigationTab.ENROLLMENT -> {
                    EnrollmentScreen(
                        formState = quoteFormState,
                        onFormChange = { transform -> viewModel.updateForm(transform) },
                        onSendWhatsApp = { phoneNumber ->
                            val message = viewModel.buildWhatsAppMessage(quoteFormState)
                            openWhatsApp(context, phoneNumber, message)
                        }
                    )
                }

                MainNavigationTab.CONTACT -> {
                    ContactScreen()
                }
            }
        }
    }
}
