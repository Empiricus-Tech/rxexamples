package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.Function4

class OperatorsZip {
    companion object{

        data class User(
            val name: String,
            val address: String,
            val document: String,
            val age: Int
        )

        @JvmStatic
        fun main(args: Array<String>) {

            val obsPersonal = Observable.just("Rodrigo Madeiro")
            val obsAddress = Observable.just("Rua das laranjeiras, 15")
            val obsDocument = Observable.just("01234567890")
            val obsAge = Observable.just(32)


            val obsZipped = Observable.zip(obsPersonal, obsAddress, obsDocument, obsAge, Function4<String, String, String, Int, User>{
                    name, address, document, age ->

                User(name, address, document, age)
            })

            obsZipped.subscribe{
                println(it)
            }
        }
    }
}