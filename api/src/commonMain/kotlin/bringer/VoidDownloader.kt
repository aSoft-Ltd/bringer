package bringer

import koncurrent.Later

object VoidDownloader : Downloader {
    override fun download(options: DownloadOptionsRaw): Later<Any?> = Later(null)
}