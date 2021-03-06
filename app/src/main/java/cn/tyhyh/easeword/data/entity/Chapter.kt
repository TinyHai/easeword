package cn.tyhyh.easeword.data.entity

import org.litepal.crud.LitePalSupport

data class Chapter(
    var preview: String,
    var unlockedCount: Int,
    var words: ArrayList<Word>
) : LitePalSupport() {
    var id: Long = 0
        private set

    var data: Data? = null

    constructor(): this("", 1, ArrayList(0))
}