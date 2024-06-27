
fun reverseNumbers(num : Int):Int{
    var temp : Int? : null
    var sum : Int? : null
    while (num != 0){
        temp=num % 10
        sum=(sum*10)+temp
        num/=10
    }
    return sum


}


fun main(){
   var res=reverseNumbers(12345)
    println(res)
}