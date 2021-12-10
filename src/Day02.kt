fun main() {
    fun part1(input: List<String>): Int {
        var horizPos = 0
        var depth = 0

        input.forEach {
            val command = it.split(" ")
            val direction = command[0]
            val steps = command[1].toInt()

            when (direction) {
                "forward" -> {
                    horizPos += steps
                }

                "down" -> {
                    depth += steps
                }

                "up" -> {
                    depth -= steps
                }
            }
        }

        return horizPos * depth
    }

    fun part2(input: List<String>): Int {
        var horizPos = 0
        var depth = 0
        var aim = 0

        input.forEach {
            val command = it.split(" ")
            val direction = command[0]
            val steps = command[1].toInt()

            when (direction) {
                "forward" -> {
                    horizPos += steps
                    depth += aim * steps
                }

                "down" -> {
                    aim += steps
                }

                "up" -> {
                    aim -= steps
                }
            }
        }

        return horizPos * depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
