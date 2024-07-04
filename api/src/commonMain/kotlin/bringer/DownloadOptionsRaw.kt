package bringer

import kotlinx.JsExport

@JsExport
interface DownloadOptionsRaw {
    val url: String
    val filename: String?
    val destination: String?
}

fun DownloadOptionsRaw.toDownloadOptions() = DownloadOptions(
    url = url,
    filename = filename ?: DownloadOptions.DEFAULT_FILENAME,
    destination = destination ?: DownloadOptions.DEFAULT_DESTINATION
)