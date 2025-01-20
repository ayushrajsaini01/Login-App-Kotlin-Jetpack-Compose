package com.anshu.app.loginusingkotlinandjetpackcompose.ui.theme

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anshu.app.loginusingkotlinandjetpackcompose.R
import androidx.compose.material3.OutlinedTextField as OutlinedTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(){
        Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

        ) {
                Image(painter = painterResource(R.drawable.logo), contentDescription = "Login Logo",
                        modifier = Modifier.size(500.dp))

                Text(text = "HELLO THERE !",
                        fontSize = 28.sp , fontWeight = FontWeight.Bold )

                Spacer(modifier = Modifier.height(4.dp))

               OutlinedTextField(value = "", onValueChange = {}, label = {
                       Text(text = "Email Id")
               })

                Spacer(modifier = Modifier.height(16.dp))


                OutlinedTextField(value = "", onValueChange = {}, label = {
                        Text(text = "Password")
                })
                Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { },
                modifier = Modifier.width(300.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue) // Set button color to blue
            ) {
                Text(text = "Login")
            }

            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(text = "Don't Have an Account?")

                Spacer(modifier = Modifier.width(8.dp))

                Text(text = "Sign Up !", color = Color.Blue )
            }

        }
}

