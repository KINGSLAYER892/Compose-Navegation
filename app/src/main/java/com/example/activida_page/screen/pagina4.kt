package com.example.activida_page.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.activida_page.R
import com.example.activida_page.ui.theme.vinotinto

@Composable
fun Pagina4(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top
            ) {
                Imagen(
                    painter = painterResource(id = R.drawable.conclusion),
                    contentDescription = "######",
                    modifier = Modifier
                        .width(500.dp)
                        .height(300.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "CONCLUSIÓN",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = vinotinto
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(0.9f)
                .fillMaxWidth()
        ) {
            Text(
                text = "Los deportes como el fútbol, el baloncesto y el golf no solo ofrecen entretenimiento y emoción, sino que también fomentan habilidades físicas y mentales únicas. Mientras el fútbol y el baloncesto destacan por su dinamismo y trabajo en equipo, el golf ofrece una experiencia de tranquilidad y precisión.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp), Color.White,
                textAlign = TextAlign.Justify,
                fontSize = 20.sp
            )


        }
    }
}





@Composable
fun Imagen4(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = contentScale
    )
}

