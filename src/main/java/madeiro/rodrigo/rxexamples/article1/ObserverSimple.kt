package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class ObserverSimple {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val observable = Observable.create<String> { emitter ->

                emitter.onNext("a")
                emitter.onNext("b")
                emitter.onNext("c")

                emitter.onComplete()
            }

//            observable.subscribe {
//                println(it)
//            }


            val observer = object: Observer<String>{
                override fun onComplete() {}

                override fun onSubscribe(d: Disposable?) {}

                override fun onNext(text: String?) {
                    println(text)
                }

                override fun onError(e: Throwable?) {}

            }
            observable.subscribe(observer)
        }
    }
}