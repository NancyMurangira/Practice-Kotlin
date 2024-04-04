fun main(){
oddNumbers()
    println(names(arrayOf("Nancyz", "QueenBella","Lousa", "Maria","Beatrice")))
}


fun oddNumbers(){
    for(num in 1..100){
        if(num%2!=0){
            println(num)
        }
    }
}



fun names(word:Array<String>):Int {
   return word.count(){it.length>5}
        }


fun sumOfOdds(nums: List<Int>): Int{
    var sum = 0
    nums.forEachIndexed{idx, item ->
        if(idx%2!=0){
            sum+=item
        }
    }
    return sum
}