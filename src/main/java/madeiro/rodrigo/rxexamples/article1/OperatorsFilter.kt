package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable

class OperatorsFilter {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val a = Observable.range(1, 10)

            val b = a.filter {
                it.rem(2) == 0
            }

            b.subscribe{
                println(it)
            }
        }
    }
}