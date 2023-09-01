object Q1 {
    def calculateAverage(temperatures: List[Double]) : Double = {
        val celToFa = temperatures.map(num => (num * 9/5) + 32)
        val totalTemp = celToFa.reduce((acc,num) => acc + num)
        val lengthOf = temperatures.length
        val averageTemp = totalTemp / lengthOf
        return averageTemp
    } 

    def main(args: Array[String]) = {
        val output = calculateAverage(List(32,33,34,35,36))
        println("%.2f".format(output))
    }
}
