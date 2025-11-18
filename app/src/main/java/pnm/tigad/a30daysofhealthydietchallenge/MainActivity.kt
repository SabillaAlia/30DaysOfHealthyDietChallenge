package pnm.tigad.a30daysofhealthydietchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Surface
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.CardDefaults
import pnm.tigad.a30daysofhealthydietchallenge.ui.theme.HealthyDietTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                DietScreen()
            }
        }
        }
    }


data class DietDay(
    val day: String,
    val title: String,
    val description: String,
    val imageRes: Int
)

@Composable
fun DietScreen() {
    val items = listOf(
        DietDay("Day 1", "Membuat jadwal diet selama 30 hari", "Diet nggak harus ribet—cukup punya jadwal dan komitmen.", R.drawable.img1),
        DietDay("Day 2", "No sugar day", "Tidak minum/makan gula tambahan.", R.drawable.img2),
        DietDay("Day 3", "Sarapan sehat", "Pilih oatmeal, buah, telur, yogurt.", R.drawable.img3),
        DietDay("Day 4", "Tambah 1 porsi sayur", "Masukkan sayur ke salah satu waktu makan.", R.drawable.img4),
        DietDay("Day 5", "Tidak makan gorengan", "Ganti dengan makanan rebus/panggang.", R.drawable.img5),
        DietDay("Day 6", "Minum lemon water", "Untuk menyegarkan tubuh kita.", R.drawable.img6),
        DietDay("Day 7", "Jalan kaki 20 menit", "Aktivitas fisik mendukung diet.", R.drawable.img7),
        DietDay("Day 8", "Makan pelan & kunyah lebih banyak", "Biar tubuh merasacepat kenyang.", R.drawable.img8),
        DietDay("Day 9", "Ganti cemilan dengan buah", "Apel, pisang, jeruk, pir.", R.drawable.img9),
        DietDay("Day 10", "½ piring sayur", "Ikuti piring makan ideal.", R.drawable.img10),
        DietDay("Day 11", "Stop minuman manis", "Tidak minum boba, soda, es teh.", R.drawable.img11),
        DietDay("Day 12", "Makan protein cukup", "Telur, ayam, ikan, tempe.", R.drawable.img12),
        DietDay("Day 13", "No junk food day", "Tidak makan fast food yang mengakibatkan lemak.", R.drawable.img13),
        DietDay("Day 14", "Minum 2 liter air", "Pastikan kebutuhan air di tubuh kita terpenuhi.", R.drawable.img14),
        DietDay("Day 15", "Tambah serat", "Sayur hijau, buah, chia seed.", R.drawable.img15),
        DietDay("Day 16", "Tidak makan setelah jam 8 malam", "Untuk kontrol porsidan menjaga berat badan", R.drawable.img16),
        DietDay("Day 17", "Pilih karbo sehat", "Nasi merah, oats, kentang.", R.drawable.img17),
        DietDay("Day 18", "Workout perut 8 menit", "Latihan ini membantu memperkuat otot perut dan meratakan area belly", R.drawable.img18),
        DietDay("Day 19", "Buat infused water", "Air + lemon + mint.", R.drawable.img19),
        DietDay("Day 20", "No snack processed", "Tidak ngemil keripik/wafer, yang bisa menambah berat badan.", R.drawable.img20),
        DietDay("Day 21", "No sugar day", "Tidak minum/makan gula tambahan.", R.drawable.img21),
        DietDay("Day 22", "Minum minuman jus buah", "Jus buah bisa membantu  tubuh menjadi lebih fresh", R.drawable.img22),
        DietDay("Day 23", "Mengisi waktu luang dengan gym", "Gym yang teratur bisa mengencangkan otot dan mengurangi lemak", R.drawable.img23),
        DietDay("Day 24", "Makan buah sebelum makan besar", "Agar lebih cepat kenyang.", R.drawable.img24),
        DietDay("Day 25", "Full body stretching 10 menit", "Stretching memperbaiki postur, mengurangi bengkak badan, dan menenangkan sistem tubuh.", R.drawable.img25),
        DietDay("Day 26", "No junk food day", "Satu hari tanpa junk food = satu langkah lebih sehat", R.drawable.img26),
        DietDay("Day 27", "20 menit jalan santai sore", "Cara paling mudah menjaga badan tetap kurus namun tetap bugar.", R.drawable.img27),
        DietDay("Day 28", "Tidur Yang Cukup", "Tidur cukup adalah skincare alami untuk tubuh dan pikiran.", R.drawable.img28),
        DietDay("Day 29", "No rice day", "Coba sehari tanpa nasi, ganti dengan yang lain", R.drawable.img29),
        DietDay("Day 30", "Evaluasi dietmu selama 30 hari", "Apa yang ingin dilanjutkandari hasil evaluasimu ini?", R.drawable.img30)
    )

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "30 Days of Healthy Diet Challenge",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn {
            items(items) { item ->
                DietCard(item)
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun DietCard(data: DietDay) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFD1DC))

    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Text(data.day, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)

            Spacer(Modifier.height(4.dp))

            Text(data.title, fontWeight = FontWeight.Bold, fontSize = 18.sp)

            Spacer(Modifier.height(8.dp))

            Image(
                painter = painterResource(id = data.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(Modifier.height(8.dp))

            Text(data.description, fontSize = 14.sp)
        }
    }
}
