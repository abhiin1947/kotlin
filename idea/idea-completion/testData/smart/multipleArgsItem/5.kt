fun foo(a: Int, b: String, c: String) {}

fun bar(b: String, a: Int, c: String?) {
    foo(<caret>)
}

// ABSENT: "a, b, c"
