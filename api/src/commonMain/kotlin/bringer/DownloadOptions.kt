package bringer

data class DownloadOptions(
    override val url: String,
    override val filename: String = "",
    override val destination: String = DEFAULT_DESTINATION,
) : DownloadOptionsRaw {
    companion object {
        val DEFAULT_FILENAME = ""
        val DEFAULT_DESTINATION: String = ""
    }
}