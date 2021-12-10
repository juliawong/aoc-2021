fun main() {
    fun part1(input: List<Int>): Int {
        // Pair up
        val windows = input.windowed(2)
        var increase = 0

        windows.forEach {
            if (it[0] < it[1]) {
                increase++
            }
        }

        return increase
    }

    fun part2(input: List<Int>): Int {
        // Use 4 to compare 2 windows
        val windows = input.windowed(4)
        var increase = 0

        windows.forEach {
            val sumWindow1 = it.subList(0, 3).sum()
            val sumWindow2 = it.subList(1, 4).sum()

            if (sumWindow1 < sumWindow2) {
                increase++
            }
        }

        return increase
    }

    val input = readInputAsInts("Day01")
    println(part1(input))
    println(part2(input))
}
