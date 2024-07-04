package bringer

import koncurrent.Executor
import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import koncurrent.SynchronousExecutor

class MockDownloader(
    private val executor: Executor = SynchronousExecutor
) : Downloader {
    override fun download(options: DownloadOptionsRaw) = Later(options, executor).then {
        println("Downloading from ${options.url}")
    }
}