package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable

class OperatorsMap {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val a = Observable.range(1, 10)

            val b = a.map {
                "Elemento $it"
            }

            b.subscribe{
                println(it)
            }
        }
    }
}