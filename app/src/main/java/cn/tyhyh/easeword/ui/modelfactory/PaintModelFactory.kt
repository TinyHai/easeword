package cn.tyhyh.easeword.ui.modelfactory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cn.tyhyh.easeword.data.repository.WordRepository
import cn.tyhyh.easeword.ui.viewmodel.PaintViewModel

/**
 * author: tiny
 * created on: 20-3-23 下午9:19
 */
class PaintModelFactory(
    private val wordRepository: WordRepository,
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.cast(PaintViewModel(wordRepository, application))!!
    }
}