package bringer

import koncurrent.Later
import koncurrent.later.then
import kotlinx.browser.document
import org.w3c.dom.HTMLAnchorElement

class BrowserDownloader : Downloader {
    override fun download(options: DownloadOptionsRaw): Later<Any?> {
        val o = options.toDownloadOptions()
        val url = o.url
        val filename = o.filename
        return Later(url).then {
            val a = document.createElement("a") as HTMLAnchorElement
            a.href = url
            a.target = "_blank"
            a.download = filename
            document.body?.appendChild(a)
            a
        }.then {
            it.click()
            document.body?.removeChild(it)
        }
    }
}