import com.livly.multiplatform.libs.viewmodel.FeedViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object ViewModelHelper : KoinComponent {
    val feedViewModel by inject<FeedViewModel>()
}