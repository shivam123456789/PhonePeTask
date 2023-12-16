package com.test.phonepe.androidassignment1.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.test.phonepe.androidassignment1.commonui.theme.AndroidAssignment1Theme
import com.test.phonepe.androidassignment1.data.model.Venue
import com.test.phonepe.androidassignment1.presentation.PlaceViewModel
import com.test.phonepe.androidassignment1.presentation.ResultStates
import org.koin.androidx.compose.koinViewModel

@Composable
fun PlaceItem(
    place: Venue,
) {
    Column() {
        Row(
            modifier = Modifier.fillMaxWidth()
                .wrapContentHeight()
                .padding(vertical = 25.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = place.nameV2.toString(), style = MaterialTheme.typography.subtitle1)
            Text(text = place.address.toString(), style = MaterialTheme.typography.caption)
            Text(text = place.extendedAddress.toString(), style = MaterialTheme.typography.body1)
        }
    }
}

@Composable
fun PlaceList(
    placeList: List<Venue>
) {
    Box() {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(placeList.size) { index ->
                PlaceItem(placeList[index])
            }
        }
    }
}

@Composable
fun PlaceScreen(
    viewModel: PlaceViewModel = koinViewModel()
) {
    val state = viewModel.resultStates

    LaunchedEffect(Unit) {
        viewModel.getTopPlaces()
    }


    when (state) {
        is ResultStates.Loading -> {
            CircularProgressIndicator()
        }
        is ResultStates.Success -> {
            PlaceList(
                placeList = state.places,
            )
        }
        is ResultStates.Error -> {
            Text(text = state.errorDetails)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PlaceItemPreview() {
    AndroidAssignment1Theme {
        PlaceItem(
            place = Venue()
        )
    }
}

