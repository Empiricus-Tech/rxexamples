package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable

class OperatorsConcat {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val a = Observable.range(1, 100)
            val b = Observable.range(101, 100)

            val c = Observable.concat(a, b)

            c.subscribe{
                println(it)
            }
        }
    }
}