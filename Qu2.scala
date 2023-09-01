object Q2 {
    def countLetterOccurrences(words: List[String]) : Int = {
        val lengthOfWords = words.map(word => word.length)
        val total = lengthOfWords.reduce((x, y) => x + y)
        return total
    } 

    def main(args: Array[String]) = {
        val output = countLetterOccurrences(List("apple", "orange", "banana","woodapple"))
        println(output)
    }
}