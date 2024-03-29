package com.amir.moneymanagemant.feature_management.presentation.add_money_action.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.amir.moneymanagemant.feature_management.presentation.add_money_action.decrease_screen.AddMoneyActionDecreaseEvent
import com.amir.moneymanagemant.feature_management.presentation.add_money_action.decrease_screen.AddMoneyActionDecreaseViewModel

@Composable
fun SaveButton(viewModel: AddMoneyActionDecreaseViewModel = hiltViewModel()) {
    Box(
        modifier = Modifier
              .fillMaxHeight()
              .fillMaxWidth(0.85f)
              .offset(y = 20.dp), contentAlignment = Alignment.TopCenter
    ) {
        Card(modifier = Modifier.fillMaxSize(), RoundedCornerShape(35.dp)) {
            Box(modifier = Modifier
                  .fillMaxWidth()
                  .clickable {
                        viewModel.onEvent(AddMoneyActionDecreaseEvent.SavedActionDecrease)
                  }, contentAlignment = Alignment.Center) {
                Text(
                    text = "Save",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.White
                )
            }

        }
    }
}