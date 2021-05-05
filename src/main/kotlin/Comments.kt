data class Comments(
    val commentId: Int = 0,
    val postId: Int,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String = "",
    private val count: Int = 0,
    private val canPost: Boolean = true,
    private val groupsCanPost: Boolean = true,
    private val canClose: Boolean = true,
    private val canOpen: Boolean = true
)