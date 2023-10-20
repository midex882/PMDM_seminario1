package com.example.seminario_1

import java.lang.Math.pow

fun maximo(Lista: List<Int>): Int{
    println("EJERCICIO1")
    var max : Int
     = Lista.sorted()[Lista.size-1]
    return max
}

fun suma( Lista: List<Int>): Int{
    println("EJERCICIO2")
    var suma: Int = 0;
    Lista.map{it -> suma += it}
    return suma;
}

fun millas_km(millas: Double): Double{
    println("EJERCICIO3")
    var km: Double = millas * 1.60934
    return km
}


fun palindromo(palabra: String): Boolean{
    println("EJERCICIO4")
    var palin = false;
    var mitades = palabra.chunked(palabra.length / 2)
    if( mitades[0].equals(mitades[1]))
    {
        palin = true
    }

    //VERSIÓN ALTERNATIVA MEJORADA

//    var res = "sí"
//    var arr = palabra.chunked(1)
//    var i = 0

//    while(i < arr.size/2)
//    {
//        if(!arr[i].equals(arr[arr.size-1]))
//        {
//            println("se jodió en: $i")
//            res = "no"
//            break
//        }
//        i++
//    }


    return palin
}

fun cuenta_letras(palabra: String, letra: Char): Int{
    println("EJERCICIO5")
    var cuenta : Int = 0
    palabra.forEach { c -> {
        if(c == letra)
        {
            cuenta++
        }
    } }

    return cuenta
}

fun cuenta_subcadenas(texto: String, sub: String): Int
{
    println("EJERCICIO6")
    var cuenta = texto.split(sub).size-1
    return cuenta
}

fun primera_mayus(texto: String): String{
    println("EJERCICIO7")
    var list = texto.split(" ")
    var res: String = ""

    list.forEach {
        res += it.replaceFirstChar { it.uppercase() } + " "
    }

    return res
}

fun suma_digitos (num : Int) : Int{
    println("EJERCICIO8")
    var sum = 0
    var arr = num.toString()

    arr.forEach {
        sum += it.toString().toInt()
    }

    return sum
}

fun mcd (num1: Int, num2: Int) : Int{
    println("EJERCICIO9")
    var mcd = 0

    var mayor : Int = num2
    var menor : Int = num1
    if(num1 > num2)
    {
        mayor = num1
        menor = num2
    }
    var i = menor

    while(i >= 1)
    {
        if(mayor % i == 0 && menor % i == 0) {
            mcd = i
            break
        }
        i--
    }

    if(mcd == 0)
    {
        mcd = -1
    }

    return mcd
}

fun fibonacci_n (n : Int) : Int
{
    println("EJERCICIO10")
    var prev = 1
    var it = 0
    var contador = 0
    while (contador <= n)
    {
        it += prev
        prev = it - prev
        contador++
    }

    return prev
}

fun primos_rel (n1: Int, n2: Int) : String
{
    println("EJERCICIO11")
    var res = "no"

    var mayor : Int = n2
    var menor : Int = n1
    if(n1 > n2)
    {
        mayor = n1
        menor = n2
    }
    var i = menor

    while(i >= 1)
    {
        if(mayor % i == 0 && menor % i == 0) {
            res = "sí"
            break
        }
        i--
    }

    return res
}

fun capicua (n: Int) : String
{
    println("EJERCICIO12")
    var res = "sí"
    var arr = n.toString().chunked(1)
    var i = 0

    while(i < arr.size/2)
    {
        if(!arr[i].equals(arr[arr.size-1]))
        {
            println("se jodió en: $i")
            res = "no"
            break
        }
        i++
    }

    return res
}

fun emmet (s: String) : String
{
    println("EJERCICIO13")
    var res = ""
    val simple_tag = Regex("^[a-z]+\$")
    val class_tag = Regex("^[a-z]+\\..+\$")
    val id_tag = Regex("^[a-z]+\\#.+\$")


    if(simple_tag.matches(s))
    {
        res = "<$s></$s>"
    }else if(class_tag.matches(s))
    {
        var arr = s.split(".")
        res = "<${arr[0]} class=\"${arr[1]}\"></${arr[0]}>"
    }else if(id_tag.matches(s))
    {
        var arr = s.split("#")
        res = "<${arr[0]} id=\"${arr[1]}\"></${arr[0]}>"
    }

    return res
}

fun mosaico (n: Int): String
{
    println("EJERCICIO14")
    var res = ""
    var i = 1
    var j = 1

    while(i <= n)
    {
        while(j <= i)
        {
            print(i)
            j++
        }
        println()
        j = 1
        i++
    }

    return res
}

fun comparer(arr1: IntArray, arr2: IntArray) : MutableList<Boolean>
{
    println("EJERCICIO15")
    val res = mutableListOf<Boolean>()
    var i = 0

    while (i < arr1.size)
    {
        res.add(arr1[i] == arr2[i])
        i++
    }

    return res
}

fun multiplier(arr : IntArray) : Int
{
    println("EJERCICIO16")
    var res = 1
    var i = 0
    while(i < arr.size)
    {
        res *= arr[i]
        i++
    }

    return res
}

fun even_filter(list : List<Int>) : List<Int>
{
    println("EJERCICIO17")
    var res = list.filter { it -> it % 2 == 0 }

    return res
}

fun primo(n : Int) : Boolean
{
    println("EJERCICIO18")
    var res = true
    var i = n

    while(i > 0)
    {
        if(n % i == 0)
        {
            res = false
            break
        }
        i--
    }

    return res
}

fun vowel_remover(str: String) : String
{
    println("EJERCICIO19")
    var res = ""
    var i = 0
    val vowel = Regex("[aeiouAEIOU]")

    while(i < str.length)
    {
        if(!vowel.matches(str[i].toString()))
        {
            res += str[i]
        }
        i++
    }

    return res
}

fun factorial(n: Int) : Int
{
    println("EJERCICIO20")
    var res = 1
    var counter = n

    while(counter > 1)
    {
        res *= counter
        counter--
    }

    return res
}

fun reverse(str: String) : String
{
    println("EJERCICIO21")
    var res = ""
    var i = str.length-1

    while(i >= 0)
    {
        res+= str[i]
        i--
    }

    return res
}

fun is_perfect(n : Int) : Boolean
{
    println("EJERCICIO22")
    var res = false
    val divisors = ArrayList<Int>()
    var i = 1

    while(i < n)
    {
        if(n % i == 0)
        {
            divisors.add(i)
        }
        i++
    }

    if(suma(divisors.toList()) == n)
    {
        res = true
    }
    return res
}

fun is_armstrong(n: Int) : Boolean
{
    println("EJERCICIO23")
    var res = false
    val digits = n.toString().chunked(1)
    var i = 1
    var j = 0
    var sum = 0

    while(sum < n)
    {
        sum = 0
        while(j < digits.size)
        {
            //println("digito: "+digits[j]+" potencia: "+i)
            sum += pow(digits[j].toDouble(), i.toDouble()).toInt()
            j++
        }

        if(sum == n)
        {
            res = true
            break
        }
        j = 0
        i++
    }

    return res
}

fun matrix_biggest(list : List<List<Int>>) : Int{
    println("EJERCICIO24")
    var res = 0
    var i = 0
    var j = 0

    while(i < list.size)
    {
        j = 0
        while(j < list[i].size)
        {
            if(list[i][j] > res)
            {
                res = list[i][j]
            }
            j++
        }
        i++
    }

    return res
}

fun matrix_smallest(list : List<List<Int>>) : Int{
    println("EJERCICIO25")
    var res = list[0][0]
    var i = 0
    var j = 0

    while(i < list.size)
    {
        j = 0
        while(j < list[i].size)
        {

            if(list[i][j] < res)
            {
                res = list[i][j]
            }
            j++
        }
        i++
    }

    return res
}

fun longest_word(list: List<String>) : String
{
    println("EJERCICIO26")
    var res = list[0]
    var i = 0
    while(i < list.size)
    {
        if(list[i].length > res.length)
        {
            res = list[i]
        }
        i++
    }

    return res
}

fun shortest_word(list: List<String>) : String
{
    println("EJERCICIO27")
    var res = list[0]
    var i = 0
    while(i < list.size)
    {
        if(list[i].length < res.length)
        {
            res = list[i]
        }
        i++
    }

    return res
}

fun is_pure_string(str: String) : Boolean
{
    println("EJERCICIO28")
    return Regex("^[a-zA-Z\\s]+\$").matches(str)
}

fun is_anagram(str1: String, str2: String) : Boolean
{
    println("EJERCICIO29")
    var res = true
    val hashMap1 = HashMap<String, Int>()
    val hashMap2 = HashMap<String, Int>()
    var i = 0

    while(i < str1.length)
    {
        hashMap1[str1[i].toString()] = (hashMap1[str1[i].toString()] ?: 0) + 1
        hashMap2[str2[i].toString()] = (hashMap2[str2[i].toString()] ?: 0) + 1
        i++
    }

    for ((key, value) in hashMap1)
    {
        if(!hashMap2.containsKey(key) || hashMap2.get(key) != value )
        {
            res = false
            break
        }
    }

    return res
}

fun is_triangular(n: Int) : Boolean
{
    println("EJERCICIO30")
    return ((-1 + Math.sqrt((1 - 4 * (-2*n)).toDouble())) / 2).rem(1).equals(0.0)
}

fun double(list: List<Int>): List<Int>
{
    println("EJERCICIO31")
    return list.map { it -> it * 2 }
}

fun dictionary(list1: List<Any>, list2: List<Any>): List<List<Any>>
{
    println("EJERCICIO32")
    val res = mutableListOf<List<Any>>()
    var i = 0

    while(i < list1.size)
    {
        var aux = mutableListOf<Any>(list1[i], list2[i])
        res.add(aux)
        i++
    }

    return res
}

fun dec_bin(n: Int) : String
{
    println("EJERCICIO33")
    var res = ""
    var aux = n

    while(aux > 0)
    {
        res += (aux % 2).toString()
        aux /= 2
    }

    res = res.reversed()

    return res
}

fun karaca(str: String) : String
{
    println("EJERCICIO34")
    var res = str.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "0"
            "e" -> "1"
            "i" -> "2"
            "o" -> "3"
            "u" -> "4"
            else -> it.value
        }
    }

    res = res.reversed() + "aca"

    return res
}

fun matrix_sort (list : List<List<Int>>, order: String): List<List<Int>> {
    println("EJERCICIO35")
    //Antes de empezar, no me gusta esta solución porque es demasiado larga,
    //enrevesada e ineficiente, pero tengo graduación esta tarde y no me da tiempo de más

    //COPIA
    var aux = mutableListOf<Int>()

    //VARIABLE
    var aux2 = mutableListOf<Int>()
    var j = list[0].size
    var k = 1
    var l = 0

    var position : Int? = null

    //CONVIERTO LA MATRIZ EN UN ARRAY

    aux = list.flatten().toMutableList()

    //RELLENO EL PRIMER HUECO DEL ARRAY PARA TENER ALGO CON LO QUE COMPARAR

    aux2.add(aux[0])

    //ITERO SOBRE AUX Y VOY COLOCANDO SUS ELEMENTOS EN EL HUECO CORRECTO EN AUX2

    if(order == "ASC")
    {
        while(k < aux.size)
        {
            l = 0
            if(aux[k] >= aux2[aux2.size-1])
            {
                position = null
            }else if(aux[k] < aux2[0])
            {
                position = 0
            }else{
                while( l < aux2.size)
                {
                    if(aux[k] == aux2[l])
                    {
                        position = l
                    }else if(aux[k] > aux2[l] && aux[k] < aux2[l+1])
                    {
                        position = l+1
                    }
                    l++
                }
            }
            if(position != null)
            {
                aux2.add(position, aux[k])
            }else{
                aux2.add(aux[k])
            }
            k++

        }
    }else if(order == "DESC")
    {
        while (k < aux.size) {
            l = 0
            if (aux[k] <= aux2[aux2.size - 1]) {
                position = null
            } else if (aux[k] > aux2[0]) {
                position = 0
            } else {
                while (l < aux2.size) {
                    if (aux[k] == aux2[l]) {
                        position = l
                    } else if (aux[k] < aux2[l] && aux[k] > aux2[l + 1]) {
                        position = l + 1
                    }
                    l++
                }
            }
            if (position != null) {
                aux2.add(position, aux[k])
            } else {
                aux2.add(aux[k])
            }
            k++
        }
    }else{
        println("las opciones de ordenación son ASC y DESC")
    }



    // PARTO EL ARRAY EN PARTES SEGÚN LA J, QUE ES LA LONGITUD DE CADA FILA

    return aux2.chunked(j)
}



fun main()
{
    val lista = mutableListOf<Int>(5,7,-3,45,1532)
    val millas = 2.3

    //EJERCICIO1
    println(maximo(lista))
    //EJERCICIO2
    println(suma(lista))
    //EJERCICIO3
    println(millas_km(millas))
    //EJERCICIO4
    println(palindromo("coco"));
    //EJERCICIO5
    println(cuenta_letras("Cojones", 'o'))
    //EJERCICIO6
    println(cuenta_subcadenas("ojohola hola holaoojo", "ojo"))
    //EJERCICIO7
    println(primera_mayus("hola pedro soy julian y vengo a por tu alma"))
    //EJERCICIO8
    println(suma_digitos(123456))
    //EJERCICIO9
    println(mcd(16,24 ))
    //EJERCICIO10
    println(fibonacci_n(8))
    //EJERCICIO11
    println("rel?: "+primos_rel(20,33))
    //EJERCICIO12
    println(capicua(121))
    //EJERCICIO13
    println(emmet("a#oferta"))
    //EJERCICIO14
    println(mosaico(9))
    //EJERCICIO15
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(1, 2, 4, 4, 6)
    println(comparer(arr1, arr2))
    //EJERCICIO16
    val arr3 = intArrayOf(1, 2, 3, 4, 5)
    println(multiplier(arr3))
    //EJERCICIO17
    var list = listOf<Int>(1,2,3,4,5,6)
    println(even_filter(list))
    //EJERCICIO18
    println(primo(5))
    println(primo(8))
    //EJERCICIO19
    println(vowel_remover("me cago en dioooos"))
    //EJERCICIO20
    println(factorial(5))
    //EJERCICIO21
    println(reverse("chawarma"))
    //EJERCICIO22
    println(is_perfect(6)) //número perfecto
    println(is_perfect(32)) //número no perfecto
    //EJERCICIO23
    println(is_armstrong(153)) //número armstrong
    println(is_armstrong(33)) //número no armstrong
    //EJERCICIO24
    val list3 = mutableListOf<List<Int>>(mutableListOf(1,2,3),mutableListOf(4,5,7), mutableListOf(234, 2,8))
    println(matrix_biggest(list3))
    //EJERCICIO25
    val list4 = mutableListOf<List<Int>>(mutableListOf(1,2,3),mutableListOf(4,5,7), mutableListOf(234, 2,8))
    println(matrix_smallest(list4))
    //EJERCICIO26
    val list5 = mutableListOf<String>("cagancho","ohtia","quillo","almadraba", "sandwichera", "sandía")
    println(longest_word(list5))
    //EJERCICIO27
    println(shortest_word(list5))
    //EJERCICIO28
    println(is_pure_string("Hola tio que pasa todo guay?")) //false
    println(is_pure_string("Hola tio que pasa todo guay")) //true
    //EJERCICIO20
    println(is_anagram("hola","aloh"))
    println(is_anagram("hola","olat"))
    //EJERCICIO30
    println(is_triangular(1))
    println(is_triangular(3))
    println(is_triangular(10))
    println(is_triangular(7))

    //BONUS

    //EJERCICIO31
    val list6 = listOf(1,2,3,4,5,6)
    println(double(list6))
    //EJERCICIO32
    val list7 = listOf("a","b","c","d","e")
    val list8 = listOf(23,45,68,34,56)
    println(dictionary(list7, list8))
    //EJERCICIO33
    println(dec_bin(123))
    //EJERCICIO34
    println(karaca("holaManuelQueTal"))
    //EJERCICIO35
    val list9 = mutableListOf<List<Int>>(mutableListOf(5,2,3),mutableListOf(4,9,7), mutableListOf(234, 2,8))
    val list10 = mutableListOf<List<Int>>(mutableListOf(5,-2,3),mutableListOf(4,9,-7), mutableListOf(234, 2,8))
    println(matrix_sort(list9, "ASC"))
    println(matrix_sort(list10, "ASC"))
    println(matrix_sort(list9, "DESC"))
    println(matrix_sort(list10, "DESC"))








}