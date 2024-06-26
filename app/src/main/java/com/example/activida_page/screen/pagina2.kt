package com.example.activida_page.screen
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.PagerState
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
import com.example.activida_page.R
import com.example.activida_page.ui.theme.vinotinto



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pagina2(pagerState: PagerState) {
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
                Imagen2(
                    painter = painterResource(id = R.drawable.baloncesto),
                    contentDescription = "######",
                    modifier = Modifier
                        .width(500.dp)
                        .height(300.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "BALONCESTO",
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
                text = "El baloncesto es un deporte rápido y emocionante que se juega en una cancha rectangular con dos equipos de cinco jugadores cada uno. El objetivo es anotar puntos lanzando el balón a través de un aro elevado. Conocido por su acción continua y jugadas espectaculares, el baloncesto destaca la agilidad y la coordinación de sus jugadores.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp), Color.White,
                textAlign = TextAlign.Justify,
                fontSize = 20.sp
            )



        }
        Puntos(pagerState)
    }
}

@Composable
fun Imagen2(
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
