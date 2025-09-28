import kotlin.random.Random
fun main() {
    //ЗАДАНИЕ 1
//val t = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while(true){
//        print("Введи число: ")
//        val input = readln().toInt()
//        when{
//            input < t -> println("Загаданное число больше.")
//            input > t -> println("Загаданное число меньше")
//            else -> {
//                println("Поздравляю! Ты угадал число $t")
//                break
//            }
//        }
//    }


    //ЗАДАНИЕ 2
//    val s : String = readln()
//    var res = 0
//    for (c in s) {
//        if (c in "аеёиоуыэюяАЕЁИОУЫЭЮЯ")
//            res++
//    }
//    println(res)


    //Задание 3
//    val N = readln().toInt()
//    for (i in N downTo 1){
//        println(i)
//    }

    //Задание 4
//    val p1 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
//    val p2  = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
//    val p3 = "0123456789"
//    val p4 = "!@#$%^&*"
//    var pas = "${p1.random()}${p2.random()}${p3.random()}${p4.random()}"
//    val a = p1 + p2 + p3 + p4
//    val res = Random.nextInt(4, 13)
//    repeat(res) {
//        pas += a.random()
//    }
//    println(pas)

    //Задание 5
//    print("Введите ваше имя: ")
//    val name = readLine()
//    print("1. Какой ваш любимый цвет? ")
//    val v1 = readLine()
//    print("2. Какое ваше любимое животное? ")
//    val v2 = readLine()
//    print("3. Куда бы вы хотели поехать? ")
//    val v3 = readLine()
//    val otziv = listOf("Ты крутой!", "Хорошая работа!", "Отличные ответы!", "Молодец!", "Так держать!")
//    val resOtziv = otziv.random()
//    println("Имя: $name")
//    println("Ответ 1: $v1")
//    println("Ответ 2: $v2")
//    println("Ответ 3: $v3")
//    println("Отзыв: $resOtziv")

    //Задание 6
//    val N = readln().toInt()
//    var sum : Int = 0
//    for (i in N downTo 1){
//        sum+= i
//    }
//    println(sum)

    //задание 7
//    var c = 0
//    while (c < 10) {
//        val res = Random.nextInt(1, 7)
//        c++
//        println("Бросок $c: $res")
//    }


    //Задание 8
//    val n1 = Random.nextInt(1, 6)
//    val n2 = Random.nextInt(1, 6)
//    val n3 = Random.nextInt(1, 6)
//    println("$n1 $n2 $n3")
//    if ( n1 == n2 && n2 == n3 ){
//        println("Джекпот!")
//    }

    //задание 9
//    var chet = Random.nextInt(100,1000)
//    println("У вас на счёте: $chet рублей")
//
//    var day = 1
//    while (chet > 0) {
//        val trata = Random.nextInt(10,100)
//        if (trata > chet) {
//            println("День $day: потрачено $chet руб., осталось 0 руб.")
//            chet= 0
//        } else {
//
//            chet -= trata
//            println("День $day: потрачено $trata руб., осталось $chet руб.")
//        }
//
//        day++
//    }


    //Задание 10
//        val day = arrayOf("Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье")
//
//    println("Дни с температурой ниже нуля:")
//
//    for (i in 0..6) {
//        val temp = Random.nextInt(-10,10)
//
//        if (temp < 0) {
//            println("${day[i]}: $temp°C")
//        }
//    }
}