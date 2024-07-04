import bringer.BrowserDownloader
import bringer.Downloader
import koncurrent.later.test
import kotlin.test.Ignore
import kotlin.test.Test

class BrowserDownloaderTest {

    val downloader: Downloader = BrowserDownloader()

    val url = "https://www.w3schools.com/images/myw3schoolsimage.jpg"

    @Test
    @Ignore // Can't download on a headless browser
    fun should_be_able_to_download_documents() = downloader.download(url).then {
        println("Download")
    }.test()
}