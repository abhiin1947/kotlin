// INTENTION_TEXT: Replace with '%' operator

fun test() {
    class Test {
        operator fun rem(a: Int): Test = Test()
    }
    val test = Test()
    test.rem<caret>(1)
}
