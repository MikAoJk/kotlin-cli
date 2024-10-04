import com.github.ajalt.clikt.testing.test
import mikaojk.github.io.Hello
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


internal class ApplicationTest {
    @Test
    fun testHello() {
        val command = Hello()
        val result = command.test("--name Foo")

        assertEquals("Hello Foo!\n", result.stdout)
        assertEquals(0,result.statusCode)
        assertEquals("Foo",command.name)
    }
}
