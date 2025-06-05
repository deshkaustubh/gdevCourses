package com.example.courses

import android.os.Bundle
import android.os.ext.SdkExtensions
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.tappableElement
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesTheme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = { Text("Courses", style = MaterialTheme.typography.titleLarge)}
                        )
                    }
                ) {innerPadding->
                    CourseGrid(modifier = Modifier.fillMaxSize().padding(innerPadding).windowInsetsTopHeight(WindowInsets.tappableElement))
                }
            }
        }
    }
}

@RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MainPreview() {
    CoursesTheme {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("Courses")}
                )
            }
        ) {innerPadding->
            CourseGrid(modifier = Modifier.padding(innerPadding).fillMaxSize().statusBarsPadding())
        }
    }
}
