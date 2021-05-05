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
}
