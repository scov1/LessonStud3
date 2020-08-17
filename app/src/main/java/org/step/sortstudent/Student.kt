package org.step.sortstudent

class Student {

    var listStud :ArrayList<String> = arrayListOf<String>("Tom Ford","Roberto Cavalli","Armani Exchenge","Tommy Hilfiger","Lacoste Boom","Polo Jeans","Dior home","Chanel number","Jimmy Choo")


    fun sortStudent(): ArrayList<String> {
        listStud.sort()
        return this.listStud
    }

    fun randomStudent(): ArrayList<String> {
        listStud.shuffle()
        return this.listStud
    }

    fun getStudents():ArrayList<String>{
        return listStud
    }
}