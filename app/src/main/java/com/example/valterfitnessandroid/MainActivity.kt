import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.valterfitness.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ValterFitnessApp()
        }
    }
}

@Composable
fun ValterFitnessApp() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color.Black, Color(0xFFFF8C00))
                        )
                    )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "Valter Fitness",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    Text(
                        text = "a academia do seu coração",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 40.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_man_workout),
                        contentDescription = "Man Working Out",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(bottom = 20.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_woman_training),
                        contentDescription = "Woman Training",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(bottom = 20.dp)
                    )
                    var username by remember { mutableStateOf("") }
                    var password by remember { mutableStateOf("") }

                    BasicTextField(
                        value = username,
                        onValueChange = { username = it },
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            .fillMaxWidth()
                            .padding(bottom = 20.dp)
                    )
                    BasicTextField(
                        value = password,
                        onValueChange = { password = it },
                        visualTransformation = PasswordVisualTransformation(),
                        modifier = Modifier
                            .background(Color.White.copy(alpha = 0.8f))
                            .padding(16.dp)
                            .fillMaxWidth()
                            .padding(bottom = 20.dp)
                    )
                    Button(
                        onClick = {
                            // Ação de login
                            println("Username: $username, Password: $password")
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Login",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ValterFitnessApp()
}

