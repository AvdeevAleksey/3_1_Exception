fun main() {
    var postService: WallService = WallService()

    println(message = postService.add(Post()))
    println(message = postService.add(Post()))
    println(message = postService.add(Post()))
    println(message = postService.createComment(Comments(postId = 3, text = "Здравствуй дорогая бабушка")))
    println(message = postService.createComment(Comments(postId = 4, text = "Здравствуй дорогой дедушка")))
    println(message = postService.comments.last())

}