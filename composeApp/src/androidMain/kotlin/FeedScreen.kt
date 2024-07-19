import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.livly.multiplatform.libs.viewmodel.FeedViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.androidx.compose.koinViewModel

@Composable
@Preview
fun FeedScreen(viewModel: FeedViewModel = koinViewModel()) {
    MaterialTheme {
        val feed by viewModel.posts.collectAsState(initial = emptyList())
        
        if (feed.isEmpty()) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(feed) { post ->
                    Text(post.title)
                    Spacer(modifier = Modifier.height(15.dp))
                }
            }
        }
        
        LaunchedEffect(Unit) {
            viewModel.fetchFeed()
        }
    }
}