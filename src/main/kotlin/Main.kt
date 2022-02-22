//soal A
private fun answerA()
{
    val firstArray = intArrayOf(1,6,3,5,8,7,4,20)
    firstArray.sort()
    firstArray.forEach {
        print(it)
    }
}

//soalB
private fun answerB()
{
    val secondArray = intArrayOf(1,2,3,4,5,6)
    for (i in secondArray.indices)
    {
        var list = secondArray[i] * secondArray[secondArray.size-(i+1)]
        print(list)
    }
}

//soalC
private fun answerC()
{
    val thirdArray = intArrayOf(10,33,13,72,44,51,17)
    for(i in 0 until thirdArray.size - 1)
    {
        if(i % 2 != 0)
        {
            var ganjil = thirdArray[i] - thirdArray[i+1]
            print(ganjil)
        }
        else
        {
            var genap = thirdArray[i] + thirdArray[i+1]
            print(genap)
        }
    }
}

//fungsi main
fun main()
{
    answerA()
    println()
    answerB()
    println()
    answerC()
}