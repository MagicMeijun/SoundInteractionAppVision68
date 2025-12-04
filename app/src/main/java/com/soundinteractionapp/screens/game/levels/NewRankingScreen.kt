package com.soundinteractionapp.screens.game.levels

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * 排名系統畫面 (Ranking Screen) 骨架。
 */
@Composable
fun NewRankingScreenContent(onNavigateBack: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.surface) {
        Column(modifier = Modifier.fillMaxSize()) {

            // 【關鍵修正】使用基礎 Row + Surface 模擬 TopAppBar
            // 這是最不會出錯的方案，因為它不依賴複雜的 Material 3 API
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.primaryContainer, // 使用主題 Primary 顏色
                shadowElevation = 4.dp // 模擬陰影
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // 1. 返回按鈕 (左側)
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "返回",
                            tint = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }

                    // 2. 標題 (中間)
                    Text(
                        text = "排行榜 (Leaderboard)",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        modifier = Modifier.weight(1f) // 佔據剩餘空間
                    )
                }
            }

            // 這裡是用於顯示排名列表的地方
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text("這裡是排名列表的內容...")
            }
        }
    }
}