package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable

class ObservableSimple {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val observable = Observable.create<String> { emitter ->

                emitter.onNext("a")
                emitter.onNext("b")
                emitter.onNext("c")

                emitter.onComplete()
            }

            observable.subscribe {
                println(it)
            }
        }
    }
}