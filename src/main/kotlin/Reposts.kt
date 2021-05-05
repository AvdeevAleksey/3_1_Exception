data class Reposts(
    val repostId: Int,
    val count: Int,
    val userReposted: Boolean = false,
    val repostAuthorId: Int
)