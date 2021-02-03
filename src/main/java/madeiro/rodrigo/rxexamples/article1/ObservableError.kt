package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable
import java.io.File
import java.util.*

class ObservableError {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val observable = Observable.create<String> { emitter ->

                val scanner = Scanner(File("nonexistentfile.txt"))

                scanner.use {
                    while(it.hasNext()){
                        val line = it.nextLine()
                        emitter.onNext(line)
                    }
                }

                emitter.onComplete()
            }

            observable.subscribe({
                println(it)
            },{
                println(it.message)
            })
        }
    }
}