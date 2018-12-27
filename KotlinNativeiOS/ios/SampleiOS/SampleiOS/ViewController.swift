import UIKit
import sharedNative

final class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        ActualKt.callDelay()
    }
}
