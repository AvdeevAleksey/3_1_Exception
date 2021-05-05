import java.lang.Exception

class WallService {

    var posts = emptyArray<Post>()
    var comments = emptyArray<Comments>()

    fun add (post: Post): Post {
        if (!posts.isEmpty()) {
            posts += post.copy(id = posts.last().id + 1)
        } else {
            posts += post.copy(id = 1)
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        if (posts.contains(post)) {
            val id = post.id-1
            posts[id] = post.copy(ownerId = posts[id].ownerId, date = posts[id].date)
            return true
        } else return false
    }

    fun likeById(id: Int) {
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(likes = Likes(count = post.likes.count + 1))
            }
        }
    }

    fun findById(id:Int): Post? {
        for (post in posts) {
            if (post.id == id)
                return post
        }
        return null
    }

    fun createComment(comment: Comments) {
        if (findById(comment.postId) != null) {
            val lastId = if (!comments.isEmpty()) comments.last().commentId + 1 else 1
            comments += comment.copy(commentId = lastId)
//            if (!comments.isEmpty()) {
//                comments += comment.copy(commentId = comments.last().commentId + 1)
//            } else {
//                comments += comment.copy(commentId = 1)
//            }
        } else throw PostNotFoundException("PostNotFoundException")
    }

    fun removeById(id: Int): Boolean {

        TODO("Unimplemented")
    }


}