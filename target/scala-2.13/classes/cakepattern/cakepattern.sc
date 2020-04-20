/**
 * say, there're 2 components in the app
 * */

trait NameProviderComponent {
  val nameProvider:NameProvider

  trait NameProvider {
    def getName: String
  }

}

trait SayHelloComponent {
  val sayHelloService: SayHelloService

  trait SayHelloService {
    def sayHello: Unit
  }

}

/**
 * Realization of the components
 * */
trait NameProviderComponentImpl extends NameProviderComponent {

  class NameProviderImpl extends NameProvider {
    def getName: String = "World"
  }

}

/*this service should be extended or mixed in with the
* class/trait along with SayHelloComponentImpl and NameProviderComponent.
* Since that is implemented, it's possible to use nameProvider. This
* trick as sorta 'jam' between the components, that's why the pattern is
* called 'cake pattern'
* */

trait SayHelloComponentImpl extends SayHelloComponent {
  this: SayHelloComponentImpl with NameProviderComponent =>

  class SayHelloServiceImpl extends SayHelloService {
    def sayHello: Unit = println("Hello, " + nameProvider.getName+"!")
  }

}

/*
Now the realization. Note that this object implements component's implementations
*/

object ComponentRegistry
  extends SayHelloComponentImpl
    with NameProviderComponentImpl {
  val nameProvider = new NameProviderImpl
  val sayHelloService = new SayHelloServiceImpl
}

object MyApplication {
  def main(args : Array[String]) : Unit = {
    ComponentRegistry.sayHelloService.sayHello
  }
}

