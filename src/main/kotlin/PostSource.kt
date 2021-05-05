class PostSource(
    val type: String = "",
    val platform: String = "",
    val data: String? = null,
    val url: String = "http://"
)

enum class PostSourceType(val string: String) {
    vk("vk"),
    widget("widget"),
    api("api"),
    rss("rss"),
    sms("sms")
}

enum class PostSourcePlatform(val string: String) {
    android("android"),
    iphone("iphone"),
    wphone("wphone")
}

enum class PostSourceData(val string: String) {
    profileActivity("profile activity"),
    profilePhoto("profile photo"),
    comments("comments"),
    like("like"),
    poll("poll")
}