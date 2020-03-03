import java.util.UUID.randomUUID

object Weather {
  def generateId: String = randomUUID.toString

}
import Weather._

abstract class Weather(val id: String = generateId,
                       val temp: Int = 0,
                       val humidity: Int = 0)

class Forecast extends Weather

object Forecast {
  def apply(): Forecast = new Forecast()
}

class RealWeather extends Weather

object RealWeather {
  def apply(): RealWeather = new RealWeather()
}

val forecast = Forecast()
forecast.id
