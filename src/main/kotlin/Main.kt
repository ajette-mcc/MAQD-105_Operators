fun main(args: Array<String>) {
// MAD-105 Operators Assignment due 24-Jan-2022

    val A: Int = 8
    val B: Int = 5
    var C: Int
    var D: Float
    var E: Boolean

    println ("A = "+A); println ("B = "+B);
    C = A + B;
    println ("A+B ="+C);
    C = A;
    C = --C;
    println ("A-1 ="+C);
    if (A>B) {
        println ("A is greater than B")
    } else {
        println("A is not greater than B")
    }
    C = A/B;
    println ("Integer value of A / B = "+C);

    D = A.toFloat()/B.toFloat();
    println ("Actual value of A/B = "+D);

    E = A>B;
    println ("Is A>B :"+E);

    println("Program arguments: ${args.joinToString()}")
}