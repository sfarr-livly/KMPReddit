import Foundation
import SwiftUI
import Shared

struct FeedView: View {
    var viewModel = ViewModelHelper.shared.feedViewModel

    var body: some View {
        VStack {
            Observing(viewModel.posts) {
                ProgressView("Waiting for counters to flows to produce a first value")
            } content: { posts in
                List(posts, id: \.id) { post in
                    Text(post.title)
                }
            }
        }.task {
            try? await viewModel.fetchFeed()
        }
    }
}
