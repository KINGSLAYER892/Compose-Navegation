package com.example.activida_page.screen
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal(navegationHostController: NavHostController) {
    val pagerState = rememberPagerState(initialPage = 0){
        3
    }
    Box(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { page ->
            when (page) {
                0 -> Pagina1(pagerState)
                1 -> Pagina2(pagerState)
                2 -> Pagina3(navegationHostController, pagerState)
            }
        }
    }
}



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pagina1(pagerState: PagerState) {
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
                    painter = painterResource(id = R.drawable.futbol),
                    contentDescription = "######",
                    modifier = Modifier
                        .width(500.dp)
                        .height(300.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "FÚTBOL",
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
                text = "El fútbol, conocido como el deporte rey, es jugado y seguido por millones de personas en todo el mundo. Este deporte apasionante, que se juega con una pelota y dos equipos de once jugadores, se destaca por su dinamismo y la habilidad necesaria para controlar y pasar el balón.",
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Puntos(pagerState: PagerState){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {
        repeat(3){
            var color = if (pagerState.currentPage == it) Color.Black else Color.Blue
            Box(modifier = Modifier
                .padding(2.dp)
                .clip(CircleShape)
                .background(color)
                .size(12.dp)
            )
        }
    }
}



@Composable
fun Imagen(
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



