class WallService {

    var id:Int = 0
    var posts = emptyArray<Post>()

    fun add (post: Post): Post {
        posts += post.copy(id = ++id)
        return posts[posts.lastIndex]
    }

    fun update(post: Post): Boolean {
        if (posts.contains(post)) {
            val id = post.id-1
            posts[id] = post.copy(ownerId = posts[id].ownerId, date = posts[id].date)
            return true
        } else return false
    }

}