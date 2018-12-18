println(LemonRobot.main())

class Liuri {
    static String wangye() {
        println("wangye ui shaniu")
        return "wangye ui shazi "
    }
}

class LemonRobot {
    static String main() {
        println("liuri ggg")
        println(Liuri.wangye())
        return "6666"
    }
}

println("game over")

import com.google.gson.*

def gson = new Gson()

println(gson.toJson(["liuri": "wangye"]))
println(gson.toJson(["liuri1", "liuri2", 3]))
for (def item : ["liuri0", "2", "3", 4]) {
    println("item: " + item)
}