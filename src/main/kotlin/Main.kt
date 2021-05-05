fun main() {
    var postService: WallService = WallService()

    println(message = postService.add(Post()))
    println(message = postService.add(Post()))
    println("=====================================================")
    val newPost = Post(id = 2, ownerId = 20, date = 2000, createdBy = 20)
    println(newPost)
    println(postService.update(newPost))
    println("=====================================================")
    println(postService.posts[postService.posts.lastIndex])
    println(postService.posts.size)
    postService.update(newPost)

}