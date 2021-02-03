package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable

class OperatorsConcat {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val a = Observable.range(1, 5)
            val b = Observable.range(6, 5)

            val c = Observable.concat(a, b)

            c.subscribe{
                println(it)
            }
        }
    }
}