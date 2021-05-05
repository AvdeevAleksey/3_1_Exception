import java.lang.RuntimeException

class PostNotFoundException(manager: String) : RuntimeException() {
    override val message: String?
        get() = super.message

}
