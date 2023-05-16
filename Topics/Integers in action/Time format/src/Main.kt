fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    // enter your code

    val secsToday = totalSeconds % (24 * 60 * 60)

    val hh = secsToday / (60 * 60)
    val mm = secsToday % (hh * 60 * 60) / 60
    val ss = secsToday % (hh * 60 * 60 + mm * 60)

    println("%02d:%02d:%02d".format(hh, mm, ss))
}