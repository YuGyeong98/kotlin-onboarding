package onboarding

fun solution2(cryptogram: String): String {
    val str = StringBuilder(cryptogram)
    val length = cryptogram.length

    return decodedCryptogram(str, length)
}

fun decodedCryptogram(str: StringBuilder, length: Int): String {
    var len = length

    for (i in 0 until len) {
        if (i + 1 < str.length) {
            if (str[i] == str[i + 1]) {
                str.delete(i, i + 2)
                len -= 2
                decodedCryptogram(str, len)
            }
        }
    }
    return str.toString()
}
