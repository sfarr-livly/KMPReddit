import SwiftUI
import Shared

@main
struct iOSApp: App {
    init() {
        HelperKt.doInitKoin()
    }

    var body: some Scene {
        WindowGroup {
            FeedView()
        }
    }
}