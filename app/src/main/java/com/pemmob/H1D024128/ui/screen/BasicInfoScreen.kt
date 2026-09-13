package com.pemmob.H1D024128.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pemmob.H1D024128.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicInfoScreen(
    onNavigateToContact: () -> Unit
) {

    Scaffold { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Icon aplikasi
            Image(
                painter = painterResource(
                    id = R.mipmap.ic_launcher_foreground
                ),
                contentDescription = "Icon Aplikasi",
                modifier = Modifier.size(120.dp)
            )

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            // Judul
            Text(
                text = "Tentang Jualan",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            // Deskripsi aplikasi
            Text(
                text = "Aplikasi Jualan adalah platform yang mewadahi produk lokal UMKM di wilayah kabupaten Purbalingga, Jawa tengah.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(
                modifier = Modifier.height(32.dp)
            )

            // Card Misi Kami
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {

                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "Misi Kami:",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.weight(1f)
                    )

                    Text(
                        text = "Memajukan UMKM Lokal",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.weight(2f)
                    )
                }
            }

            Spacer(
                modifier = Modifier.weight(1f)
            )

            // Tombol Hubungi Kami
            Button(
                onClick = {
                    onNavigateToContact()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {

                Text(
                    text = "Hubungi Kami",
                    style = MaterialTheme.typography.labelLarge
                )
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )
        }
    }
}