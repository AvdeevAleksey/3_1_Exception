import org.junit.Test

internal class WallServiceTest {

    @Test
    fun add_test() {
        val postService: WallService = WallService()
        val expected: Int = 0
        postService.add(Post())
        val posts = postService.posts
        val result: Int = posts[posts.lastIndex].id
        assert(expected != result)
    }

    @Test
    fun update_existsId() {
        val postService: WallService = WallService()
        val post: Post = postService.add(Post())
        assert(postService.update(post))
    }

    @Test
    fun update_doesntExistsId() {
        val postService: WallService = WallService()
        postService.add(Post())
        val post: Post = postService.posts[postService.posts.lastIndex]
        assert(!postService.update(post.copy(id = 2)))
    }

    @Test
    fun createComment_existsId() {
        val postService: WallService = WallService()
        val id: Int = 1
        postService.add(Post())
        postService.createComment(Comments(postId = id))
        assert(postService.posts[id - 1].id == postService.comments[postService.comments.lastIndex].postId)
    }

    @Test(expected = NullPointerException::class)
    fun createComment_doesntExistsId() {
            val postService: WallService = WallService()
            postService.createComment(Comments(postId = 1))
    }
}
