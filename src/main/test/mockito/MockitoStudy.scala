import org.mockito.Mockito
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funspec.AnyFunSpecLike
import org.scalatest.matchers.must.Matchers
import org.mockito.Mockito._
import org.mockito.ArgumentCaptor
import org.mockito.Matchers.{any, anyString}
import org.mockito.Mockito.{reset, when}

class MockitoStudy extends AnyFunSpecLike with Matchers {

  it("dd") {

/*    val x = Mockito.mock(Book.getClass)
    //when()*/
    val book = new Book("ff")
    assert(1 == 1)
  }

   class Book(author: String) {
    def getBook = author
  }

}
