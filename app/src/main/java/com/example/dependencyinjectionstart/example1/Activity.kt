package com.example.dependencyinjectionstart.example1

class Activity {


//    val computer: Computer = Component().getComputer()


    lateinit var computer: Computer

    init {
        Component().inject(this)
    }
}