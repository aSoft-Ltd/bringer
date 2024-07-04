@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package bringer

import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import kotlinx.JsExport
import kotlinx.JsExportIgnore
import kotlin.js.JsName

interface Downloader {
    @JsExportIgnore
    fun download(
        url: String,
        filename: String = DownloadOptions.DEFAULT_FILENAME,
        dst: String = DownloadOptions.DEFAULT_DESTINATION
    ): Later<Any?> = download(DownloadOptions(url, filename, dst))

    @JsName("downloadWithFilename")
    fun download(
        url: String,
        filename: String
    ): Later<Any?> = download(DownloadOptions(url, filename))

    fun download(url: String) = download(DownloadOptions(url))

    @JsName("downloadNow")
    fun download(options: DownloadOptionsRaw): Later<Any?>
}