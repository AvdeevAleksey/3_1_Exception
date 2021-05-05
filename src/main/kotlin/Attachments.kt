sealed class Attachments {
    abstract val type: String
}

data class Photo(
    override val type: String = "photo",
    val id: Int,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "",
    val date: Int = 0,
    val width: Int = 0,
    val height: Int = 0
): Attachments()

data class Audio(
    override val type: String = "audio",
    val id: Int,
    val ownerId: Int = 0,
    val artist: String = "",
    val duration: Int = 0,
    val url: String,
    val albumId: Int = 0,
    val genreId: Int =0,
    val date: Int = 0
): Attachments()

data class Video(
    override val type: String = "video",
    val id: Int,
    val ownerId: Int = 0,
    val title: String = "",
    val description: String = "",
    val duration: Int = 0,
    val date: Int = 0,
    val views: Int = 0,
    val comments: Int = 0,
    val player: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val spectators: Int = 0
): Attachments()

data class Document(
    override val type: String = "document",
    val id: Int,
    val ownerId: Int = 0,
    val title: String = "",
    val size: Int = 0,
    val ext: String,
    val url: String = "",
    val date: Int = 0,
    val documentType: Int = 0
): Attachments()

data class Link(
    override val type: String = "link",
    val url: String,
    val title: String = "",
    val capture: String = "",
    val description: String = "",
    val previewPage: String = "",
    val previewUrl: String
): Attachments()