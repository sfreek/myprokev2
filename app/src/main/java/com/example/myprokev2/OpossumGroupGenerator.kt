package com.example.myprokev2

import kotlin.random.Random

class OpossumGroupGenerator(var maxOpossumCount: Int,var minOpossumCount: Int) {
    fun getRandomNumberInRange(from: Int, until: Int): Int {

        return Random.nextInt(from ,until)

    }

    fun Generate(): List<Opossum>
    {

        var opossumCount: Int = getRandomNumberInRange(minOpossumCount, maxOpossumCount);


        val opossumList = mutableListOf<Opossum>()


        for (i in 1..opossumCount) {
            var oposs = Opossum(Random.nextInt(1,100) ,Random.nextDouble(1.0,100.0),
                Random.nextInt(1,100),Random.nextInt(1,100), Random.nextBoolean())
            opossumList .add(oposs)
        }


        return  opossumList;

    }
}