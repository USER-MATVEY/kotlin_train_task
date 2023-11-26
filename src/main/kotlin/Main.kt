import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

val cities = listOf("Москва", "Санкт-Петербург", "Новосибирск",
    "Екатеринбург", "Нижний Новгород", "Казань", "Челябинск",
    "Омск", "Самара", "Ростов-на-Дону", "Уфа", "Красноярск",
    "Пермь", "Воронеж", "Волгоград")

fun main() = runBlocking {
    var flag = true
    while (flag){
        println("Создаём поезд...")
        val train = Train()
        train.Create_track(cities)
        println("Отправная точка: ${train.start_point}")
        delay(750)
        println("Конечная точка: ${train.end_point}")
        delay(750)
        println("Продажа билетов....")
        val passengers: Int = (5.. 200).random()
        delay(750)
        println("Продано билетов: $passengers")
        println("Рассадка пасажиров по вагонам....")
        println("Отправка поезда...")
        train.Obtain_vagons(passengers)
        train.Send_train()
        println("Хотите создать ещё одтн поезд? (y/n)")
        val want_continue: String = readln()
        if (want_continue == "n") flag = false
    }
}